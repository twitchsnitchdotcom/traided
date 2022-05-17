package com.traidable.app.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.neo4j.driver.summary.ResultSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.Collection;
import java.util.Map;

import static com.traidable.app.service.PersistenceService.logResultSummaries;

@Service
public class DbService {

    private final static Logger log = LoggerFactory.getLogger(SearchBuilderService.class);

    private final PersistenceService persistenceService;

    @Value("${database}")
    public String database = "traided";

    public DbService(PersistenceService persistenceService) {
        this.persistenceService = persistenceService;
    }

    public String dbInfo() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String statsString = null;
        Collection<Map<String, Object>> all = persistenceService.getClient().query("CALL apoc.meta.stats()").in(database).fetch().all();
        for (Map<String, Object> objectMap : all) {
            for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
                try {
                    statsString = ObjectMapperService.getObjectMapper().writeValueAsString(entry);
                } catch (JsonProcessingException e) {
                    log.error("Cant parse APOC Stats");
                }
            }
        }
        stopWatch.stop();
        log.trace("Get all Apoc meta stats took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
        return statsString;
    }

    public void addDB() {
        ResultSummary run = PersistenceService.getClient().query("CREATE DATABASE " + database).in(database).run();
        logResultSummaries("addDatabase", run);
    }

    public void dropDB() {
        ResultSummary run = PersistenceService.getClient().query("DROP DATABASE " + database).in(database).run();
        logResultSummaries("dropDatabase", run);
    }

    public void dropDBData() {
        ResultSummary run = PersistenceService.getClient().query("CALL apoc.periodic.iterate(\n" +
                "'MATCH ()-[r]->() RETURN id(r) AS id', \n" +
                "'MATCH ()-[r]->() WHERE id(r)=id DELETE r', \n" +
                "{batchSize: 1000});").in(database).run();
        ResultSummary run2 = PersistenceService.getClient().query("CALL apoc.periodic.iterate(\n" +
                "'MATCH (n) RETURN id(n) AS id', \n" +
                "'MATCH (n) WHERE id(n)=id DELETE n', \n" +
                "{batchSize: 1000});").in(database).run();
        log.trace("Nodes deleted from the DB: " + run.counters().nodesDeleted() + run2.counters().nodesDeleted());
    }

    public void dropDBConstraints() {
        ResultSummary dropConstraints = PersistenceService.getClient().query("CALL apoc. schema. assert({}, {});").in(database).run();
        logResultSummaries("", dropConstraints);
    }

    public void addDBConstraints() {
        ResultSummary topTierAgencyIdConstraint = PersistenceService.getClient().query("CREATE CONSTRAINT agency_id FOR (t:TopTierAgency) REQUIRE t.agency_id IS UNIQUE;").in(database).run();
        ResultSummary defCodeConstraint = PersistenceService.getClient().query("CREATE CONSTRAINT def_code FOR (d:DisasterEmergencyFunding) REQUIRE d.code IS UNIQUE;").in(database).run();
        ResultSummary subComponentIdConstraint = PersistenceService.getClient().query("CREATE CONSTRAINT sub_component_id FOR (s:SubComponent) REQUIRE s.id IS UNIQUE;").in(database).run();
        ResultSummary subAgencyNameConstraint = PersistenceService.getClient().query("CREATE CONSTRAINT sub_agency_name FOR (s:SubAgency) REQUIRE s.name IS UNIQUE;").in(database).run();
        ResultSummary submissionPeriodCompositeConstraint = PersistenceService.getClient().query("CREATE CONSTRAINT submission_period_composite FOR (s:SubmissionPeriod) ASSERT (s.submission_fiscal_year, s.submission_fiscal_quarter, s.submission_fiscal_month) IS NODE KEY;").in(database).run();
        ResultSummary subAgencySummaryCompositeConstraint = PersistenceService.getClient().query("CREATE CONSTRAINT subagency_summary_composite FOR (s:SubAgencySummary) ASSERT (s.toptier_code, s.fiscal_year) IS NODE KEY;").in(database).run();

        logResultSummaries("topTierAgencyIdConstraint", topTierAgencyIdConstraint);
        logResultSummaries("defCodeConstraint", defCodeConstraint);
        logResultSummaries("subComponentIdConstraint", subComponentIdConstraint);
        logResultSummaries("subAgencyNameConstraint", subAgencyNameConstraint);
        logResultSummaries("submissionPeriodCompositeConstraint", submissionPeriodCompositeConstraint);
        logResultSummaries("subAgencySummaryCompositeConstraint", subAgencySummaryCompositeConstraint);

//
//        ResultSummary liveStreamTwitchIdIndex = client.query("CREATE INDEX FOR (l:LiveStream) ON (l.sully_id);").in(database).run();
//        ResultSummary languageNameIndex = client.query("CREATE INDEX FOR (l:Language) ON (l.name);").in(database).run();
//
//        logResultSummaries("liveStreamConstraint", liveStreamConstraint);
//        logResultSummaries("gameDisplayNameConstraint", gameDisplayNameConstraint);
//
//        logResultSummaries("channelSullyIdIndex", channelSullyIdIndex);
//        logResultSummaries("channelTwitchIdIndex", channelTwitchIdIndex);
    }
}
