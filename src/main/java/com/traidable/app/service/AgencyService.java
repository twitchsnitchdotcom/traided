package com.traidable.app.service;

import com.traidable.app.constants.FinancialConstants;
import com.traidable.app.dto.AGENCY.subagencycount.SubAgencyCountResponseDTO;
import com.traidable.app.dto.REFERENCE.agencyreference.AgencyReferenceResponseDTO;
import com.traidable.app.entity.TopTierAgency;
import com.traidable.app.repositories.TopTierAgencyRepository;
import org.neo4j.driver.summary.ResultSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class AgencyService {

    @Value("${database}")
    public String database = "traided";

    private final PersistenceService persistenceService;
    private final TopTierAgencyRepository topTierAgencyRepository;

    public AgencyService(PersistenceService persistenceService, TopTierAgencyRepository topTierAgencyRepository){
        this.persistenceService = persistenceService;
        this.topTierAgencyRepository = topTierAgencyRepository;
    }

    private final static Logger log = LoggerFactory.getLogger(AgencyService.class);

    public Long topTierAgencyCountDB() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Long topTierAgencyCount = null;
        Collection<Map<String, Object>> all = persistenceService.getClient().query("MATCH (t:TopTierAgency) RETURN count(t)").in(database).fetch().all();
        for (Map<String, Object> objectMap : all) {
            for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
                    topTierAgencyCount = (Long) entry.getValue();
            }
        }
        stopWatch.stop();
        log.debug("topTierAgencyCount took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
        return topTierAgencyCount;
    }

    public void importTopTierAgencies() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
            ResultSummary all = persistenceService.getClient().query("CALL apoc.load.jsonParams(\"https://api.usaspending.gov/api/v2/references/toptier_agencies/\",{Accept: \"application/json\"}, null) YIELD value\n" +
                    "UNWIND  value.results as agency\n" +
                    "MERGE (a:TopTierAgency{agency_id:agency.agency_id, active_fy:agency.active_fy})\n" +
                    "SET a.toptier_code = agency.toptier_code,\n" +
                    "a.abbreviation = agency.abbreviation,\n" +
                    "a.agency_name = agency.agency_name,\n" +
                    "a.congressional_justification_url = agency.congressional_justification_url,\n" +
                    "a.active_fq = agency.active_fq,\n" +
//                    "a.outlay_amount = agency.outlay_amount,\n" +
//                    "a.obligated_amount = agency.obligated_amount,\n" +
//                    "a.budget_authority_amount = agency.budget_authority_amount,\n" +
//                    "a.current_total_budget_authority_amount = agency.current_total_budget_authority_amount,\n" +
//                    "a.percentage_of_total_budget_authority = agency.percentage_of_total_budget_authority,\n" +
                    "a.agency_slug = agency.agency_slug;").in(database).run();
            PersistenceService.logResultSummaries("importTopTierAgencies", all);

        stopWatch.stop();
        log.debug("importTopTierAgencies took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public void importTopTierAgencySummaries() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("CALL apoc.periodic.iterate(\n" +
                "  'MATCH (a:TopTierAgency) RETURN a',\n" +
                "  'WITH a, \"https://api.usaspending.gov/api/v2/agency/\" + a.toptier_code +  \"/\"  as url\n" +
                "  CALL apoc.load.jsonParams(url,{Accept: \"application/json\"}, null) YIELD value\n" +
                "  WITH a, value\n" +
                "  SET a.icon_filename = value.icon_filename,\n" +
                "  a.mission = value.mission,\n" +
                "  a.website = value.website',\n" +
//                "    FOREACH (def in value.def_codes |\n" +
//                "            MERGE (d:DisasterEmergencyFunding{code:def.code})\n" +
//                "            SET d.public_law = def.public_law,\n" +
//                "            d.title = def.title,\n" +
//                "            d.urls = def.urls,\n" +
//                "            d.disaster = def.disaster\n" +
//                "            MERGE (a)-[:HAS_DISASTER_EMERGENCY_FUNDING]->(d))',\n" +
                "{batchSize:1, parallel:true})").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importTopTierAgencySummaries", all);
        log.trace("importTopTierAgencySummaries took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public void importSubAgencySummary(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(int year: FinancialConstants.FISCAL_YEARS){
        }
        ResultSummary all = persistenceService.getClient().query("CALL apoc.periodic.iterate(\n" +
                "  'MATCH (a:TopTierAgency) RETURN a',\n" +
                "  'WITH a, \"https://api.usaspending.gov/api/v2/agency/\" + a.toptier_code +  \"/sub_agency/count/\" as url\n" +
                "  CALL apoc.load.jsonParams(url,{Accept: \"application/json\"}, null) YIELD value\n" +
                "  WITH a, value\n" +
                "  MERGE (s:SubAgencySummary{toptier_code:value.toptier_code,fiscal_year:value.fiscal_year })\n" +
                "  SET s.sub_agency_count = value.sub_agency_count,\n" +
                "  s.office_count = value.office_count\n" +
                "  MERGE (a)-[:HAS_SUB_AGENCY]->(s)',\n" +
                "{batchSize:1, parallel:true})").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importSubAgencySummary", all);
        log.debug("importSubAgencySummary took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public Long subAgencySummaryCountDB() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Long subAgencySummaryCountDB = null;
        Collection<Map<String, Object>> all = persistenceService.getClient().query("MATCH (s:SubAgencySummary) RETURN count(s)").in(database).fetch().all();
        for (Map<String, Object> objectMap : all) {
            for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
                subAgencySummaryCountDB = (Long) entry.getValue();
            }
        }
        stopWatch.stop();
        log.debug("subAgencySummaryCountDB took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
        return subAgencySummaryCountDB;
    }

    //todo can be extended to read the office counts as well
    public Long subAgencySummaryCountAPI(){
        Long total = 0L;
        for(String code: FinancialConstants.TOP_TIER_AGENCY_CODES){
            Long subAgencyCount = HTTPService.webClient.get()
                    .uri("agency/" + code + "/sub_agency/count/")
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .retrieve()
                    .bodyToMono(SubAgencyCountResponseDTO.class).block().getSubAgencyCount();
            total = total + subAgencyCount;
        }
        return total;
    }

    public void importAgencyAwardSummary(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importAgencyAwardSummary", all);
        log.debug("importAgencyAwardSummary took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public void importAgencyBudgetSummary(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importAgencyBudgetSummary", all);
        log.debug("importAgencyBudgetSummary took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public void importAgencyBudgetaryResourcesSummary(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importAgencyBudgetaryResourcesSummary", all);
        log.debug("importAgencyBudgetaryResourcesSummary took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public void importAgencyFederalAccounts(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importAgencyFederalAccounts", all);
        log.debug("importAgencyFederalAccounts took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public void importAgencyObjectClasses(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importAgencyObjectClasses", all);
        log.debug("importAgencyObjectClasses took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public void importAgencyOverviewNewAwards(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importAgencyOverviewNewAwards", all);
        log.debug("importAgencyOverviewNewAwards took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public Integer topTierAgencyCountAPI(){
        return HTTPService.webClient.get()
                .uri("/references/toptier_agencies/")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgencyReferenceResponseDTO.class).block().getResults().size();
    }

    public List<TopTierAgency> getAllTopTierAgencies(){
        return topTierAgencyRepository.findAll();
    }


}
