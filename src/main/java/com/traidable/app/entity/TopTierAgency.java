package com.traidable.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node
public class TopTierAgency {

    @Id
    @GeneratedValue
    private Long id;

    @Property("agency_id")
    private Long agencyId;
    @Property("toptier_code")
    private String toptierCode;
    @Property("abbreviation")
    private String abbreviation;
    @Property("agency_name")
    private String agencyName;
    @Property("congressional_justification_url")
    private String congressionalJustificationUrl;
    @Property("active_fy")
    private String activeFy;
    @Property("active_fq")
    private String activeFq;
    @Property("outlay_amount")
    private Double outlayAmount;
    @Property("obligated_amount")
    private Double obligatedAmount;
    @Property("budget_authority_amount")
    private Double budgetAuthorityAmount;
    @Property("current_total_budget_authority_amount")
    private Double currentTotalBudgetAuthorityAmount;
    @Property("percentage_of_total_budget_authority")
    private Double percentageOfTotalBudgetAuthority;
    @Property("agency_slug")
    private String agencySlug;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public String getToptierCode() {
        return toptierCode;
    }

    public void setToptierCode(String toptierCode) {
        this.toptierCode = toptierCode;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getCongressionalJustificationUrl() {
        return congressionalJustificationUrl;
    }

    public void setCongressionalJustificationUrl(String congressionalJustificationUrl) {
        this.congressionalJustificationUrl = congressionalJustificationUrl;
    }

    public String getActiveFy() {
        return activeFy;
    }

    public void setActiveFy(String activeFy) {
        this.activeFy = activeFy;
    }

    public String getActiveFq() {
        return activeFq;
    }

    public void setActiveFq(String activeFq) {
        this.activeFq = activeFq;
    }

    public Double getOutlayAmount() {
        return outlayAmount;
    }

    public void setOutlayAmount(Double outlayAmount) {
        this.outlayAmount = outlayAmount;
    }

    public Double getObligatedAmount() {
        return obligatedAmount;
    }

    public void setObligatedAmount(Double obligatedAmount) {
        this.obligatedAmount = obligatedAmount;
    }

    public Double getBudgetAuthorityAmount() {
        return budgetAuthorityAmount;
    }

    public void setBudgetAuthorityAmount(Double budgetAuthorityAmount) {
        this.budgetAuthorityAmount = budgetAuthorityAmount;
    }

    public Double getCurrentTotalBudgetAuthorityAmount() {
        return currentTotalBudgetAuthorityAmount;
    }

    public void setCurrentTotalBudgetAuthorityAmount(Double currentTotalBudgetAuthorityAmount) {
        this.currentTotalBudgetAuthorityAmount = currentTotalBudgetAuthorityAmount;
    }

    public Double getPercentageOfTotalBudgetAuthority() {
        return percentageOfTotalBudgetAuthority;
    }

    public void setPercentageOfTotalBudgetAuthority(Double percentageOfTotalBudgetAuthority) {
        this.percentageOfTotalBudgetAuthority = percentageOfTotalBudgetAuthority;
    }

    public String getAgencySlug() {
        return agencySlug;
    }

    public void setAgencySlug(String agencySlug) {
        this.agencySlug = agencySlug;
    }
}
