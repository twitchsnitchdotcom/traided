package com.traidable.app.service;

import com.traidable.app.dto.REFERENCE.agencyreference.AgencyReferenceResponseDTO;
import com.traidable.app.dto.REFERENCE.submissionperiod.SubmissionPeriodResponseDTO;
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
import java.util.Map;

@Service
public class ReferenceService {

    @Value("${database}")
    public String database = "traided";

    private final PersistenceService persistenceService;
    private final TopTierAgencyRepository topTierAgencyRepository;

    public ReferenceService(PersistenceService persistenceService, TopTierAgencyRepository topTierAgencyRepository){
        this.persistenceService = persistenceService;
        this.topTierAgencyRepository = topTierAgencyRepository;
    }

    private final static Logger log = LoggerFactory.getLogger(AgencyService.class);

    public void importSubmissionPeriods(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ResultSummary all = persistenceService.getClient().query("CALL apoc.load.jsonParams(\"https://api.usaspending.gov/api/v2/references/submission_periods/\",{Accept: \"application/json\"}, null) YIELD value\n" +
                "UNWIND  value.available_periods as period\n" +
                "CREATE (sp:SubmissionPeriod)\n" +
                "SET sp.period_start_date = datetime(period.period_start_date),\n" +
                "sp.period_end_date = datetime(period.period_end_date),\n" +
                "sp.submission_start_date = datetime(period.submission_start_date),\n" +
                "sp.submission_due_date = datetime(period.submission_due_date),\n" +
                "sp.certification_due_date = datetime(period.certification_due_date),\n" +
                "sp.submission_reveal_date = datetime(period.submission_reveal_date),\n" +
                "sp.submission_fiscal_year = period.submission_fiscal_year,\n" +
                "sp.submission_fiscal_quarter = period.submission_fiscal_quarter,\n" +
                "sp.submission_fiscal_month = period.submission_fiscal_month,\n" +
                "sp.is_quarter = period.is_quarter").in(database).run();
        stopWatch.stop();
        PersistenceService.logResultSummaries("importSubmissionPeriods", all);
        log.trace("importSubmissionPeriods took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
    }

    public Long submissionPeriodsCountDB() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Long submissionPeriodsCountDB = null;
        Collection<Map<String, Object>> all = persistenceService.getClient().query("MATCH (s:SubmissionPeriod) RETURN count(s)").in(database).fetch().all();
        for (Map<String, Object> objectMap : all) {
            for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
                submissionPeriodsCountDB = (Long) entry.getValue();
            }
        }
        stopWatch.stop();
        log.trace("submissionPeriodsCountDB took: " + stopWatch.getLastTaskTimeMillis() / 1000 + " seconds");
        return submissionPeriodsCountDB;
    }

    public Integer submissionPeriodsCountAPI() {
            return HTTPService.webClient.get()
                    .uri("references/submission_periods/")
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .retrieve()
                    .bodyToMono(SubmissionPeriodResponseDTO.class).block().getAvailablePeriods().size();
    }
}
