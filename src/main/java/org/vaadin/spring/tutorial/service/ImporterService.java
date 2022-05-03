package org.vaadin.spring.tutorial.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.commons.lang3.StringUtils;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.summary.ResultSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.vaadin.spring.tutorial.dto.RecipientDTO;
import org.vaadin.spring.tutorial.dto.RecipientSearchRequest;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.Map;

@Service
public class ImporterService {
    private Neo4jClient client;

    @Value("${database}")
    private String database;

    private RestTemplate restTemplate = new RestTemplate();

    private final static Logger log = LoggerFactory.getLogger(ImporterService.class);

    @PostConstruct
    public void initNeo4j() {
        Driver driver = GraphDatabase
                .driver("neo4j://68.183.7.177:7687", AuthTokens.basic("neo4j", "admin"));
        client = Neo4jClient.create(driver);
    }

    public final ObjectMapper objectMapper() {
        JavaTimeModule module = new JavaTimeModule();
        return new ObjectMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(module);
    }

    public void addDatabase(String database) {
        ResultSummary run = client.query("CREATE DATABASE " + database).in(database).run();
        logResultSummaries("addDatabase", run);
    }

    public void dropDatabase(String database) {
        ResultSummary run = client.query("DROP DATABASE " + database).in(database).run();
        logResultSummaries("dropDatabase", run);
    }

    public void importRecipientRecords(int totalPages){
        for(int i=1; i<= totalPages; i++){
            RecipientSearchRequest recipientSearchRequest = new RecipientSearchRequest(i);
            RecipientDTO recipientDTO = runGetReciept(recipientSearchRequest);
            persistRecipient(recipientDTO.getMap());
        }
    }

    public void persistRecipient(Map jsonMap){
        ResultSummary run = client.query("UNWIND $json.results as result\n" +
                        "MATCH (r:Recipient{id:result.id})\n" +
                        "            SET     r.duns = result.duns,\n" +
                        "                    r.uei = result.uei,\n" +
                        "                    r.name = result.name,\n" +
                        "                    r.recipient_level = result.recipient_level,\n" +
                        "                    r.amount = result.amount;").in(database)
                .bind(jsonMap).to("json")
                .run();

        logResultSummaries("persistRecipient", run);
    }


    public HttpEntity getGenericHttpRequest() {
        // create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity request = new HttpEntity(headers);

        return request;
    }

    public RecipientDTO runGetReciept(RecipientSearchRequest recipientSearchRequest) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<RecipientSearchRequest> entity = new HttpEntity<>(recipientSearchRequest, headers);

        String url = "https://api.usaspending.gov/api/v2/recipient/";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                RecipientDTO recipientDTO = objectMapper().readValue(response.getBody(), RecipientDTO.class);
                recipientDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return recipientDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static boolean isFuzzy(String term, String value) {
        int distance;
        term = term.trim();
        if (term.length() < 3) {
            distance = 0;
        } else if (term.length() < 6) {
            distance = 1;
        } else {
            distance = 2;
        }
        return StringUtils.getLevenshteinDistance(value, term) <= distance;
    }


    //DB METHODS
    public void deleteDBData() {
        //drop db development
        //create db development
        ResultSummary run = client.query("CALL apoc.periodic.iterate(\n" +
                "'MATCH ()-[r]->() RETURN id(r) AS id', \n" +
                "'MATCH ()-[r]->() WHERE id(r)=id DELETE r', \n" +
                "{batchSize: 1000});").in(database).run();
        ResultSummary run2 = client.query("CALL apoc.periodic.iterate(\n" +
                "'MATCH (n) RETURN id(n) AS id', \n" +
                "'MATCH (n) WHERE id(n)=id DELETE n', \n" +
                "{batchSize: 1000});").in(database).run();
        log.trace("Nodes deleted from the DB: " + run.counters().nodesDeleted() + run2.counters().nodesDeleted());
    }

    public void dropDBConstraints() {
        ResultSummary dropConstraints = client.query("CALL apoc. schema. assert({}, {});").in(database).run();
        logResultSummaries("", dropConstraints);
    }

    private void logResultSummaries(String key, ResultSummary resultSummary) {
        log.trace("RESULT SUMMARY FOR: " + key);

        if (resultSummary.counters().nodesCreated() > 0) {
            log.trace("Nodes created: " + resultSummary.counters().nodesCreated());
        }
        if (resultSummary.counters().labelsAdded() > 0) {
            log.trace("Labels added: " + resultSummary.counters().labelsAdded());
        }
        if (resultSummary.counters().relationshipsCreated() > 0) {
            log.trace("Relationships added: " + resultSummary.counters().relationshipsCreated());
        }
        if (resultSummary.counters().relationshipsDeleted() > 0) {
            log.trace("Relationships deleted: " + resultSummary.counters().relationshipsDeleted());
        }
        if (resultSummary.counters().indexesAdded() > 0) {
            log.trace("Indexes added: " + resultSummary.counters().indexesAdded());
        }
        if (resultSummary.counters().indexesRemoved() > 0) {
            log.trace("Indexes removed: " + resultSummary.counters().indexesRemoved());
        }
        if (resultSummary.counters().constraintsAdded() > 0) {
            log.trace("Constraints added: " + resultSummary.counters().constraintsAdded());
        }
        if (resultSummary.counters().constraintsRemoved() > 0) {
            log.trace("Constraints added: " + resultSummary.counters().constraintsRemoved());
        }
        if (resultSummary.counters().propertiesSet() > 0) {
            log.trace("Properties set: " + resultSummary.counters().propertiesSet());
        }

    }
}
