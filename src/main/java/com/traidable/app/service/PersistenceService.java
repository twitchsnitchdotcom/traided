package com.traidable.app.service;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.summary.ResultSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class PersistenceService {

    private final static Logger log = LoggerFactory.getLogger(PersistenceService.class);

    private Neo4jClient client;

    @Value("${database}")
    private String database;


    @PostConstruct
    public void initNeo4j() {
        Driver driver = GraphDatabase
                .driver("neo4j://68.183.7.177:7687", AuthTokens.basic("neo4j", "admin"));
        client = Neo4jClient.create(driver);
    }

    public void addDatabase(String database) {
        ResultSummary run = client.query("CREATE DATABASE " + database).in(database).run();
        logResultSummaries("addDatabase", run);
    }

    public void dropDatabase(String database) {
        ResultSummary run = client.query("DROP DATABASE " + database).in(database).run();
        logResultSummaries("dropDatabase", run);
    }

    //todo complete this

    /**

     {
     "name": "ACTION FACILITIES MANAGEMENT, INC.",
     "alternate_names": [
     "ACTION FACILITIES MANAGEMENT  INC.",
     "ACTION FACILITIES MANAGEMENT INC",
     "ACTION FACILITIES MANAGEMENT INCORPORATED",
     "ACTION INTEGRATED SERVICES  LLC"
     ],
     "duns": "129304551",
     "uei": "HB9HZZ9R8AX4",
     "recipient_id": "f0b5ad28-54d1-49a3-e86c-e3dd896cce70-P",
     "recipient_level": "P",
     "parent_id": "f0b5ad28-54d1-49a3-e86c-e3dd896cce70-P",
     "parent_name": "ACTION FACILITIES MANAGEMENT, INC.",
     "parent_duns": "129304551",
     "parent_uei": "HB9HZZ9R8AX4",
     "parents": [
     {
     "parent_id": "f0b5ad28-54d1-49a3-e86c-e3dd896cce70-P",
     "parent_duns": "129304551",
     "parent_uei": "HB9HZZ9R8AX4",
     "parent_name": "ACTION FACILITIES MANAGEMENT, INC."
     }
     ],
     "business_types": [
     "black_american_owned_business",
     "category_business",
     "corporate_entity_not_tax_exempt",
     "dot_certified_disadvantaged_business_enterprise",
     "economically_disadvantaged_women_owned_small_business",
     "minority_owned_business",
     "self_certified_small_disadvanted_business",
     "small_business",
     "special_designations",
     "subchapter_s_corporation",
     "us_owned_business",
     "woman_owned_business",
     "women_owned_small_business"
     ],
     "location": {
     "address_line1": "115 MALONE DR",
     "address_line2": null,
     "address_line3": null,
     "foreign_province": null,
     "city_name": "MORGANTOWN",
     "county_name": null,
     "state_code": "WV",
     "zip": "26501",
     "zip4": "2283",
     "foreign_postal_code": null,
     "country_name": "UNITED STATES",
     "country_code": "USA",
     "congressional_code": "01"
     },
     "total_transaction_amount": 31194306.2,
     "total_transactions": 260,
     "total_face_value_loan_amount": 0.0,
     "total_face_value_loan_transactions": 0
     }

     * @param jsonMap
     */
    public void persistEntityInfo(Map jsonMap){
        ResultSummary run = client.query(
                        "MATCH (r:Recipient{id:$json.recipient_id})\n" +
                                "            SET     r.total_transactions = $json.total_transactions,\n" +
                                "                    r.total_face_value_loan_amount = $json.total_face_value_loan_amount,\n" +
                                "                    r.total_face_value_loan_transactions = $json.total_face_value_loan_transactions\n" +
                                "                    ;").in(database)
                .bind(jsonMap).to("json")
                .run();

        logResultSummaries("persistEntityInfo", run);
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

    public List<String> getAllRecipientsWithOutEntityInfo(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<String> allRecipients = new ArrayList<>();
        Collection<Map<String, Object>> all = client.query("MATCH (r:Recipient) RETURN r.id").in(database).fetch().all();
        for (Map<String, Object> objectMap : all) {
            for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
                allRecipients.add((String) entry.getValue());
            }
        }
        stopWatch.stop();
        log.trace("Get all recipient ids: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
        return allRecipients;
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
