package com.traidable.app.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.traidable.app.dto.REFERENCE.agencyreference.AgencyReferenceResponseDTO;
import org.neo4j.driver.summary.ResultSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.Collection;
import java.util.Map;

@Service
public class AgencyService {

    private final PersistenceService persistenceService;

    public AgencyService(PersistenceService persistenceService){
        this.persistenceService = persistenceService;
    }

    private final static Logger log = LoggerFactory.getLogger(AgencyService.class);

    public Long topTierAgencyCountDB() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Long topTierAgencyCount = null;
        Collection<Map<String, Object>> all = persistenceService.getClient().query("MATCH (t:TopTierAgency) RETURN count(t)").in(PersistenceService.database).fetch().all();
        for (Map<String, Object> objectMap : all) {
            for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
                    topTierAgencyCount = (Long) entry.getValue();
            }
        }
        stopWatch.stop();
        log.trace("topTierAgencyCount took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
        return topTierAgencyCount;
    }

    public void importTopTierAgencies() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("CALL apoc.load.jsonParams(\"https://api.usaspending.gov/api/v2/references/toptier_agencies/?sort=percentage_of_total_budget_authority&order=desc\",{Accept: \"application/json\"}, null) YIELD value\n" +
                "UNWIND  value.results as agency\n" +
                "CREATE (a:TopTierAgency{agency_id:agency.agency_id})\n" +
                "SET a.toptier_code = agency.toptier_code,\n" +
                "a.abbreviation = agency.abbreviation,\n" +
                "a.agency_name = agency.agency_name,\n" +
                "a.congressional_justification_url = agency.congressional_justification_url,\n" +
                "a.active_fy = agency.active_fy,\n" +
                "a.active_fq = agency.active_fq,\n" +
                "a.outlay_amount = agency.outlay_amount,\n" +
                "a.obligated_amount = agency.obligated_amount,\n" +
                "a.budget_authority_amount = agency.budget_authority_amount,\n" +
                "a.current_total_budget_authority_amount = agency.current_total_budget_authority_amount,\n" +
                "a.percentage_of_total_budget_authority = agency.percentage_of_total_budget_authority,\n" +
                "a.agency_slug = agency.agency_slug;").in(PersistenceService.database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importTopTierAgencies", all);
        log.trace("importTopTierAgencies took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public Integer topTierAgencyCountAPI(){
        return HTTPService.webClient.get()
                .uri("/references/toptier_agencies/")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgencyReferenceResponseDTO.class).block().getResults().size();
    }
}
