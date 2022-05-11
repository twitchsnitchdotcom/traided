package com.traidable.app.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.traidable.app.dto.awarddetails.AwardDetailsDTO;
import com.traidable.app.dto.awardingagency.AwardingAgencyDTO;
import com.traidable.app.dto.awardingagency.request.AwardingAgencyRequestDTO;
import com.traidable.app.dto.awardingsubagency.AwardingSubAgencyDTO;
import com.traidable.app.dto.awardingsubagency.request.AwardingSubAgencyRequestDTO;
import com.traidable.app.dto.awardsaccounts.AwardAccountsDTO;
import com.traidable.app.dto.awardsaccounts.request.AwardAccountsRequestDTO;
import com.traidable.app.dto.awardsovertime.NewAwardsOverTimeDTO;
import com.traidable.app.dto.awardsovertime.request.NewAwardsOverTimeRequestDTO;
import com.traidable.app.dto.cfda.CFDAResponseDTO;
import com.traidable.app.dto.cfda.request.CFDARequestDTO;
import com.traidable.app.dto.entity.EntityDTO;
import com.traidable.app.dto.federalaccounts.FederalAccountsDTO;
import com.traidable.app.dto.federalaccounts.request.FederalAccountsRequestDTO;
import com.traidable.app.dto.naics.Naicsdto;
import com.traidable.app.dto.naics.request.NAICSRequestDTO;
import com.traidable.app.dto.psc.PSCResponseDTO;
import com.traidable.app.dto.psc.request.PSCRequestDTO;
import com.traidable.app.dto.recipient.RecipientSearchRequest;
import com.traidable.app.dto.recipient.RecipientsDTO;
import com.traidable.app.dto.recipient.Result;
import com.traidable.app.dto.spending.SpendingOverTimeDTO;
import com.traidable.app.dto.spending.request.SpendingOverTimeRequestDTO;
import com.traidable.app.dto.spendingbyaward.SpendingByAwardResponseDTO;
import com.traidable.app.dto.spendingbyaward.request.SpendingByAwardRequestDTO;
import com.traidable.app.dto.spendingbyawardcount.SpendingByAwardCountResponseDTO;
import com.traidable.app.dto.spendingbyawardcount.request.SpendingByAwardCountRequestDTO;
import com.traidable.app.dto.spendingbycountry.SpendingByCountryResponseDTO;
import com.traidable.app.dto.spendingbycountry.request.SpendingByCountryRequestDTO;
import com.traidable.app.dto.spendingbystateterritory.SpendingByStateResponseDTO;
import com.traidable.app.dto.spendingbystateterritory.request.SpendingByStateRequestDTO;
import com.traidable.app.dto.transactions.AwardTransactionResponseDTO;
import com.traidable.app.dto.transactions.request.AwardTransactionRequestDTO;
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
import org.springframework.util.StopWatch;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class ImporterService {


    private RestTemplate restTemplate = new RestTemplate();

    private final static Logger log = LoggerFactory.getLogger(ImporterService.class);



    public final ObjectMapper objectMapper() {
        JavaTimeModule module = new JavaTimeModule();
        return new ObjectMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(module);
    }



    public void importRecipientRecords(int totalPages){
        for(int i=1; i<= totalPages; i++){
            RecipientSearchRequest recipientSearchRequest = new RecipientSearchRequest(i);
            recipientSearchRequest.setLimit(5);

            RecipientsDTO recipientsDTO = runGetReceipt(recipientSearchRequest);
            persistRecipient(recipientsDTO.getMap());

            for(Result result: recipientsDTO.getResults()){

                //entity info
                EntityDTO entityDTO = runGetEntity(result.getId());
                persistEntityInfo(entityDTO.getMap());

                //spending info

                //new awards info

                //awarding agency info

                //awarding sub agency info

                //federal accounst info

                //cfda info

                //naics info

            }

        }
    }

    //persist methods

    public void persistSpendingOverTime(String id, Map jsonMap){

    }

    public void persistNewAwardsOverTime(String id, Map jsonMap){

    }

    public void persistAwardingAgency(String id, Map jsonMap){

    }

    public void persistAwardingSubAgency(String id, Map jsonMap){

    }

    public void persistFederalAccounts(String id, Map jsonMap){

    }

    public void persistCatalogOfFederalDomesticAssistance(String id, Map jsonMap){

    }

    public void persistNAICSCodes(String id, Map jsonMap){

    }

    public void persistAwardDetails(String id, Map jsonMap){

    }

    public void persistAwardAccounts(String id, Map jsonMap){

    }

    public void persistPSC(String id, Map jsonMap){

    }

    public void persistSpendingByAward(String id, Map jsonMap){

    }

    public void persistSpendingByAwardCount(String id, Map jsonMap){

    }

    public void persistSpendingByCountry(String id, Map jsonMap){

    }

    public void persistSpendingByStateTerritory(String id, Map jsonMap){

    }

    public void persistTransactions(String id, Map jsonMap){

    }




    //http requests

    public HttpEntity getGenericHttpRequest() {
        // create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity request = new HttpEntity(headers);

        return request;
    }

    public EntityDTO runGetEntity(String id){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<RecipientSearchRequest> entity = new HttpEntity<>(headers);

        String url = "https://api.usaspending.gov/api/v2/recipient/" + id + "/";
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(
                    url,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                EntityDTO entityDTO = objectMapper().readValue(response.getBody(), EntityDTO.class);
                entityDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return entityDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public RecipientsDTO runGetReceipt(RecipientSearchRequest recipientSearchRequest) {

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
                RecipientsDTO recipientDTO = objectMapper().readValue(response.getBody(), RecipientsDTO.class);
                recipientDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return recipientDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public SpendingOverTimeDTO runGetSpendingOverTime(SpendingOverTimeRequestDTO spendingOverTimeRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<SpendingOverTimeRequestDTO> entity = new HttpEntity<>(spendingOverTimeRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_over_time/";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                SpendingOverTimeDTO spendingOverTimeDTO = objectMapper().readValue(response.getBody(), SpendingOverTimeDTO.class);
                spendingOverTimeDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return spendingOverTimeDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public NewAwardsOverTimeDTO runGetNewAwardsOverTime(NewAwardsOverTimeRequestDTO newAwardsOverTimeRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<NewAwardsOverTimeRequestDTO> entity = new HttpEntity<>(newAwardsOverTimeRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/new_awards_over_time/";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                NewAwardsOverTimeDTO newAwardsOverTimeDTO = objectMapper().readValue(response.getBody(), NewAwardsOverTimeDTO.class);
                newAwardsOverTimeDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return newAwardsOverTimeDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AwardingAgencyDTO runGetAwardingAgency(AwardingAgencyRequestDTO awardingAgencyRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<AwardingAgencyRequestDTO> entity = new HttpEntity<>(awardingAgencyRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/awarding_agency";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                AwardingAgencyDTO awardingAgencyDTO = objectMapper().readValue(response.getBody(), AwardingAgencyDTO.class);
                awardingAgencyDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return awardingAgencyDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AwardingSubAgencyDTO runGetAwardingSubAgency(AwardingSubAgencyRequestDTO awardingSubAgencyRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<AwardingSubAgencyRequestDTO> entity = new HttpEntity<>(awardingSubAgencyRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/awarding_subagency";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                AwardingSubAgencyDTO awardingSubAgencyDTO = objectMapper().readValue(response.getBody(), AwardingSubAgencyDTO.class);
                awardingSubAgencyDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return awardingSubAgencyDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public FederalAccountsDTO runGetFederalAccounts(FederalAccountsRequestDTO federalAccountsRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<FederalAccountsRequestDTO> entity = new HttpEntity<>(federalAccountsRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/federal_account";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                FederalAccountsDTO federalAccountsDTO = objectMapper().readValue(response.getBody(), FederalAccountsDTO.class);
                federalAccountsDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return federalAccountsDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CFDAResponseDTO runGetCatalogOfFederalDomesticAssistance(CFDARequestDTO cfdaRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<CFDARequestDTO> entity = new HttpEntity<>(cfdaRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/cfda";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                CFDAResponseDTO cfdaResponseDTO = objectMapper().readValue(response.getBody(), CFDAResponseDTO.class);
                cfdaResponseDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return cfdaResponseDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Naicsdto runGetNAICSCodes(NAICSRequestDTO naicsRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<NAICSRequestDTO> entity = new HttpEntity<>(naicsRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/naics";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                Naicsdto naicsdto = objectMapper().readValue(response.getBody(), Naicsdto.class);
                naicsdto.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return naicsdto;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AwardDetailsDTO runGetAwardDetails(String id){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<NAICSRequestDTO> entity = new HttpEntity<>( headers);

        String url = "https://api.usaspending.gov/api/v2/awards/" + id + "/";
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(
                    url,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                AwardDetailsDTO awardDetailsDTO = objectMapper().readValue(response.getBody(), AwardDetailsDTO.class);
                awardDetailsDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return awardDetailsDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AwardAccountsDTO runGetAwardAccounts(AwardAccountsRequestDTO awardAccountsRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<AwardAccountsRequestDTO> entity = new HttpEntity<>(awardAccountsRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/awards/accounts/";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                AwardAccountsDTO awardAccountsDTO = objectMapper().readValue(response.getBody(), AwardAccountsDTO.class);
                awardAccountsDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return awardAccountsDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PSCResponseDTO runGetPSC(PSCRequestDTO pscRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<PSCRequestDTO> entity = new HttpEntity<>(pscRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/psc";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                PSCResponseDTO pscResponseDTO = objectMapper().readValue(response.getBody(), PSCResponseDTO.class);
                pscResponseDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return pscResponseDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public SpendingByAwardResponseDTO runGetSpendingByAward(SpendingByAwardRequestDTO spendingByAwardRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<SpendingByAwardRequestDTO> entity = new HttpEntity<>(spendingByAwardRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_award/";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                SpendingByAwardResponseDTO spendingByAwardResponseDTO = objectMapper().readValue(response.getBody(), SpendingByAwardResponseDTO.class);
                spendingByAwardResponseDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return spendingByAwardResponseDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public SpendingByAwardCountResponseDTO runGetSpendingByAwardCount(SpendingByAwardCountRequestDTO spendingByAwardCountRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<SpendingByAwardCountRequestDTO> entity = new HttpEntity<>(spendingByAwardCountRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_award_count/";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                SpendingByAwardCountResponseDTO spendingByAwardCountResponseDTO = objectMapper().readValue(response.getBody(), SpendingByAwardCountResponseDTO.class);
                spendingByAwardCountResponseDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return spendingByAwardCountResponseDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public SpendingByCountryResponseDTO runGetSpendingByCountry(SpendingByCountryRequestDTO spendingByCountryRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<SpendingByCountryRequestDTO> entity = new HttpEntity<>(spendingByCountryRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/country";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                SpendingByCountryResponseDTO spendingByCountryResponseDTO = objectMapper().readValue(response.getBody(), SpendingByCountryResponseDTO.class);
                spendingByCountryResponseDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return spendingByCountryResponseDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public SpendingByStateResponseDTO runGetSpendingByStateTerritory(SpendingByStateRequestDTO spendingByStateRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<SpendingByStateRequestDTO> entity = new HttpEntity<>(spendingByStateRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/search/spending_by_category/state_territory";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                SpendingByStateResponseDTO spendingByStateResponseDTO = objectMapper().readValue(response.getBody(), SpendingByStateResponseDTO.class);
                spendingByStateResponseDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return spendingByStateResponseDTO;
            }
        } catch (HttpClientErrorException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AwardTransactionResponseDTO runGetTransactions(AwardTransactionRequestDTO awardTransactionRequestDTO){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<AwardTransactionRequestDTO> entity = new HttpEntity<>(awardTransactionRequestDTO, headers);

        String url = "https://api.usaspending.gov/api/v2/transactions/";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    url,
                    entity,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                AwardTransactionResponseDTO awardTransactionResponseDTO = objectMapper().readValue(response.getBody(), AwardTransactionResponseDTO.class);
                awardTransactionResponseDTO.setMap(objectMapper().readValue(response.getBody(), Map.class));
                return awardTransactionResponseDTO;
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


}
