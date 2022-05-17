package com.traidable.app.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.traidable.app.dto.REFERENCE.agencyreference.AgencyReferenceResponseDTO;
import com.traidable.app.dto.entity.EntityDTO;
import com.traidable.app.dto.recipient.RecipientSearchRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.Map;

@Service
public class HTTPService {

    private final static Logger log = LoggerFactory.getLogger(HTTPService.class);

    public static WebClient webClient;

    @PostConstruct
    public static void init(){
        webClient = WebClient.builder()
                .baseUrl("http://api.usaspending.gov/api/v2/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }


}
