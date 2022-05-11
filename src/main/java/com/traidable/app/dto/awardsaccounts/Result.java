
package com.traidable.app.dto.awardsaccounts;

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
    "total_transaction_obligated_amount",
    "federal_account",
    "account_title",
    "funding_agency_abbreviation",
    "funding_agency_name",
    "funding_agency_id",
    "funding_toptier_agency_id",
    "funding_agency_slug"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("total_transaction_obligated_amount")
    private Double totalTransactionObligatedAmount;
    @JsonProperty("federal_account")
    private String federalAccount;
    @JsonProperty("account_title")
    private String accountTitle;
    @JsonProperty("funding_agency_abbreviation")
    private String fundingAgencyAbbreviation;
    @JsonProperty("funding_agency_name")
    private String fundingAgencyName;
    @JsonProperty("funding_agency_id")
    private Long fundingAgencyId;
    @JsonProperty("funding_toptier_agency_id")
    private Long fundingToptierAgencyId;
    @JsonProperty("funding_agency_slug")
    private String fundingAgencySlug;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total_transaction_obligated_amount")
    public Double getTotalTransactionObligatedAmount() {
        return totalTransactionObligatedAmount;
    }

    @JsonProperty("total_transaction_obligated_amount")
    public void setTotalTransactionObligatedAmount(Double totalTransactionObligatedAmount) {
        this.totalTransactionObligatedAmount = totalTransactionObligatedAmount;
    }

    @JsonProperty("federal_account")
    public String getFederalAccount() {
        return federalAccount;
    }

    @JsonProperty("federal_account")
    public void setFederalAccount(String federalAccount) {
        this.federalAccount = federalAccount;
    }

    @JsonProperty("account_title")
    public String getAccountTitle() {
        return accountTitle;
    }

    @JsonProperty("account_title")
    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    @JsonProperty("funding_agency_abbreviation")
    public String getFundingAgencyAbbreviation() {
        return fundingAgencyAbbreviation;
    }

    @JsonProperty("funding_agency_abbreviation")
    public void setFundingAgencyAbbreviation(String fundingAgencyAbbreviation) {
        this.fundingAgencyAbbreviation = fundingAgencyAbbreviation;
    }

    @JsonProperty("funding_agency_name")
    public String getFundingAgencyName() {
        return fundingAgencyName;
    }

    @JsonProperty("funding_agency_name")
    public void setFundingAgencyName(String fundingAgencyName) {
        this.fundingAgencyName = fundingAgencyName;
    }

    @JsonProperty("funding_agency_id")
    public Long getFundingAgencyId() {
        return fundingAgencyId;
    }

    @JsonProperty("funding_agency_id")
    public void setFundingAgencyId(Long fundingAgencyId) {
        this.fundingAgencyId = fundingAgencyId;
    }

    @JsonProperty("funding_toptier_agency_id")
    public Long getFundingToptierAgencyId() {
        return fundingToptierAgencyId;
    }

    @JsonProperty("funding_toptier_agency_id")
    public void setFundingToptierAgencyId(Long fundingToptierAgencyId) {
        this.fundingToptierAgencyId = fundingToptierAgencyId;
    }

    @JsonProperty("funding_agency_slug")
    public String getFundingAgencySlug() {
        return fundingAgencySlug;
    }

    @JsonProperty("funding_agency_slug")
    public void setFundingAgencySlug(String fundingAgencySlug) {
        this.fundingAgencySlug = fundingAgencySlug;
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
