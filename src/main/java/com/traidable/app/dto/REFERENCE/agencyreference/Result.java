
package com.traidable.app.dto.REFERENCE.agencyreference;

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
    "agency_id",
    "toptier_code",
    "abbreviation",
    "agency_name",
    "congressional_justification_url",
    "active_fy",
    "active_fq",
    "outlay_amount",
    "obligated_amount",
    "budget_authority_amount",
    "current_total_budget_authority_amount",
    "percentage_of_total_budget_authority",
    "agency_slug"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("agency_id")
    private Long agencyId;
    @JsonProperty("toptier_code")
    private String toptierCode;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("agency_name")
    private String agencyName;
    @JsonProperty("congressional_justification_url")
    private String congressionalJustificationUrl;
    @JsonProperty("active_fy")
    private String activeFy;
    @JsonProperty("active_fq")
    private String activeFq;
    @JsonProperty("outlay_amount")
    private Double outlayAmount;
    @JsonProperty("obligated_amount")
    private Double obligatedAmount;
    @JsonProperty("budget_authority_amount")
    private Double budgetAuthorityAmount;
    @JsonProperty("current_total_budget_authority_amount")
    private Double currentTotalBudgetAuthorityAmount;
    @JsonProperty("percentage_of_total_budget_authority")
    private Double percentageOfTotalBudgetAuthority;
    @JsonProperty("agency_slug")
    private String agencySlug;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("agency_id")
    public Long getAgencyId() {
        return agencyId;
    }

    @JsonProperty("agency_id")
    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    @JsonProperty("toptier_code")
    public String getToptierCode() {
        return toptierCode;
    }

    @JsonProperty("toptier_code")
    public void setToptierCode(String toptierCode) {
        this.toptierCode = toptierCode;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("agency_name")
    public String getAgencyName() {
        return agencyName;
    }

    @JsonProperty("agency_name")
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @JsonProperty("congressional_justification_url")
    public String getCongressionalJustificationUrl() {
        return congressionalJustificationUrl;
    }

    @JsonProperty("congressional_justification_url")
    public void setCongressionalJustificationUrl(String congressionalJustificationUrl) {
        this.congressionalJustificationUrl = congressionalJustificationUrl;
    }

    @JsonProperty("active_fy")
    public String getActiveFy() {
        return activeFy;
    }

    @JsonProperty("active_fy")
    public void setActiveFy(String activeFy) {
        this.activeFy = activeFy;
    }

    @JsonProperty("active_fq")
    public String getActiveFq() {
        return activeFq;
    }

    @JsonProperty("active_fq")
    public void setActiveFq(String activeFq) {
        this.activeFq = activeFq;
    }

    @JsonProperty("outlay_amount")
    public Double getOutlayAmount() {
        return outlayAmount;
    }

    @JsonProperty("outlay_amount")
    public void setOutlayAmount(Double outlayAmount) {
        this.outlayAmount = outlayAmount;
    }

    @JsonProperty("obligated_amount")
    public Double getObligatedAmount() {
        return obligatedAmount;
    }

    @JsonProperty("obligated_amount")
    public void setObligatedAmount(Double obligatedAmount) {
        this.obligatedAmount = obligatedAmount;
    }

    @JsonProperty("budget_authority_amount")
    public Double getBudgetAuthorityAmount() {
        return budgetAuthorityAmount;
    }

    @JsonProperty("budget_authority_amount")
    public void setBudgetAuthorityAmount(Double budgetAuthorityAmount) {
        this.budgetAuthorityAmount = budgetAuthorityAmount;
    }

    @JsonProperty("current_total_budget_authority_amount")
    public Double getCurrentTotalBudgetAuthorityAmount() {
        return currentTotalBudgetAuthorityAmount;
    }

    @JsonProperty("current_total_budget_authority_amount")
    public void setCurrentTotalBudgetAuthorityAmount(Double currentTotalBudgetAuthorityAmount) {
        this.currentTotalBudgetAuthorityAmount = currentTotalBudgetAuthorityAmount;
    }

    @JsonProperty("percentage_of_total_budget_authority")
    public Double getPercentageOfTotalBudgetAuthority() {
        return percentageOfTotalBudgetAuthority;
    }

    @JsonProperty("percentage_of_total_budget_authority")
    public void setPercentageOfTotalBudgetAuthority(Double percentageOfTotalBudgetAuthority) {
        this.percentageOfTotalBudgetAuthority = percentageOfTotalBudgetAuthority;
    }

    @JsonProperty("agency_slug")
    public String getAgencySlug() {
        return agencySlug;
    }

    @JsonProperty("agency_slug")
    public void setAgencySlug(String agencySlug) {
        this.agencySlug = agencySlug;
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
