
package com.traidable.app.dto.spendingbyaward;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "internal_id",
    "Award ID",
    "Recipient Name",
    "Start Date",
    "End Date",
    "Award Amount",
    "Description",
    "def_codes",
    "COVID-19 Obligations",
    "COVID-19 Outlays",
    "Awarding Agency",
    "Awarding Sub Agency",
    "Contract Award Type",
    "recipient_id",
    "prime_award_recipient_id",
    "awarding_agency_id",
    "agency_slug",
    "generated_internal_id"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("internal_id")
    private Long internalId;
    @JsonProperty("Award ID")
    private String awardID;
    @JsonProperty("Recipient Name")
    private String recipientName;
    @JsonProperty("Start Date")
    private String startDate;
    @JsonProperty("End Date")
    private String endDate;
    @JsonProperty("Award Amount")
    private Double awardAmount;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("def_codes")
    private Object defCodes;
    @JsonProperty("COVID-19 Obligations")
    private Object cOVID19Obligations;
    @JsonProperty("COVID-19 Outlays")
    private Object cOVID19Outlays;
    @JsonProperty("Awarding Agency")
    private String awardingAgency;
    @JsonProperty("Awarding Sub Agency")
    private String awardingSubAgency;
    @JsonProperty("Contract Award Type")
    private String contractAwardType;
    @JsonProperty("recipient_id")
    private String recipientId;
    @JsonProperty("prime_award_recipient_id")
    private Object primeAwardRecipientId;
    @JsonProperty("awarding_agency_id")
    private Long awardingAgencyId;
    @JsonProperty("agency_slug")
    private String agencySlug;
    @JsonProperty("generated_internal_id")
    private String generatedInternalId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("internal_id")
    public Long getInternalId() {
        return internalId;
    }

    @JsonProperty("internal_id")
    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    @JsonProperty("Award ID")
    public String getAwardID() {
        return awardID;
    }

    @JsonProperty("Award ID")
    public void setAwardID(String awardID) {
        this.awardID = awardID;
    }

    @JsonProperty("Recipient Name")
    public String getRecipientName() {
        return recipientName;
    }

    @JsonProperty("Recipient Name")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @JsonProperty("Start Date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("Start Date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("End Date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("End Date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Award Amount")
    public Double getAwardAmount() {
        return awardAmount;
    }

    @JsonProperty("Award Amount")
    public void setAwardAmount(Double awardAmount) {
        this.awardAmount = awardAmount;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("def_codes")
    public Object getDefCodes() {
        return defCodes;
    }

    @JsonProperty("def_codes")
    public void setDefCodes(Object defCodes) {
        this.defCodes = defCodes;
    }

    @JsonProperty("COVID-19 Obligations")
    public Object getCOVID19Obligations() {
        return cOVID19Obligations;
    }

    @JsonProperty("COVID-19 Obligations")
    public void setCOVID19Obligations(Object cOVID19Obligations) {
        this.cOVID19Obligations = cOVID19Obligations;
    }

    @JsonProperty("COVID-19 Outlays")
    public Object getCOVID19Outlays() {
        return cOVID19Outlays;
    }

    @JsonProperty("COVID-19 Outlays")
    public void setCOVID19Outlays(Object cOVID19Outlays) {
        this.cOVID19Outlays = cOVID19Outlays;
    }

    @JsonProperty("Awarding Agency")
    public String getAwardingAgency() {
        return awardingAgency;
    }

    @JsonProperty("Awarding Agency")
    public void setAwardingAgency(String awardingAgency) {
        this.awardingAgency = awardingAgency;
    }

    @JsonProperty("Awarding Sub Agency")
    public String getAwardingSubAgency() {
        return awardingSubAgency;
    }

    @JsonProperty("Awarding Sub Agency")
    public void setAwardingSubAgency(String awardingSubAgency) {
        this.awardingSubAgency = awardingSubAgency;
    }

    @JsonProperty("Contract Award Type")
    public String getContractAwardType() {
        return contractAwardType;
    }

    @JsonProperty("Contract Award Type")
    public void setContractAwardType(String contractAwardType) {
        this.contractAwardType = contractAwardType;
    }

    @JsonProperty("recipient_id")
    public String getRecipientId() {
        return recipientId;
    }

    @JsonProperty("recipient_id")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    @JsonProperty("prime_award_recipient_id")
    public Object getPrimeAwardRecipientId() {
        return primeAwardRecipientId;
    }

    @JsonProperty("prime_award_recipient_id")
    public void setPrimeAwardRecipientId(Object primeAwardRecipientId) {
        this.primeAwardRecipientId = primeAwardRecipientId;
    }

    @JsonProperty("awarding_agency_id")
    public Long getAwardingAgencyId() {
        return awardingAgencyId;
    }

    @JsonProperty("awarding_agency_id")
    public void setAwardingAgencyId(Long awardingAgencyId) {
        this.awardingAgencyId = awardingAgencyId;
    }

    @JsonProperty("agency_slug")
    public String getAgencySlug() {
        return agencySlug;
    }

    @JsonProperty("agency_slug")
    public void setAgencySlug(String agencySlug) {
        this.agencySlug = agencySlug;
    }

    @JsonProperty("generated_internal_id")
    public String getGeneratedInternalId() {
        return generatedInternalId;
    }

    @JsonProperty("generated_internal_id")
    public void setGeneratedInternalId(String generatedInternalId) {
        this.generatedInternalId = generatedInternalId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
