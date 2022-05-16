package com.traidable.app.service;

import com.traidable.app.dto.awardingagency.request.AwardingAgencyRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class SearchBuilderService {

    private final static Logger log = LoggerFactory.getLogger(SearchBuilderService.class);

    //private SimpleDateFormat

    /**
     {"filters":{"recipient_id":"f0b5ad28-54d1-49a3-e86c-e3dd896cce70-P","time_period":[{"start_date":"2021-05-02","end_date":"2022-05-02"}]},"category":"awarding_agency","limit":100,"page":1}
     * @return
     */
    public static AwardingAgencyRequestDTO getAwardingAgencyRequestDTOOneYear(String recipientId){
        return null;
    }

    public static AwardingAgencyRequestDTO getAwardingAgencyRequestDTO(){
        return null;
    }
}
