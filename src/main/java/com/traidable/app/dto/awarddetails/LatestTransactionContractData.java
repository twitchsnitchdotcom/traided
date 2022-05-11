
package com.traidable.app.dto.awarddetails;

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
    "idv_type_description",
    "type_of_idc_description",
    "referenced_idv_agency_iden",
    "referenced_idv_agency_desc",
    "solicitation_identifier",
    "solicitation_procedures",
    "number_of_offers_received",
    "extent_competed",
    "type_set_aside",
    "type_set_aside_description",
    "evaluated_preference",
    "fed_biz_opps",
    "fed_biz_opps_description",
    "small_business_competitive",
    "product_or_service_code",
    "naics",
    "naics_description",
    "sea_transportation",
    "clinger_cohen_act_planning",
    "labor_standards",
    "cost_or_pricing_data",
    "domestic_or_foreign_entity",
    "foreign_funding",
    "major_program",
    "program_acronym",
    "subcontracting_plan",
    "multi_year_contract",
    "consolidated_contract",
    "type_of_contract_pricing",
    "national_interest_action",
    "multiple_or_single_award_description",
    "solicitation_procedures_description",
    "extent_competed_description",
    "other_than_full_and_open",
    "other_than_full_and_open_description",
    "commercial_item_acquisition",
    "commercial_item_acquisition_description",
    "commercial_item_test_program",
    "commercial_item_test_program_description",
    "evaluated_preference_description",
    "fair_opportunity_limited",
    "fair_opportunity_limited_description",
    "product_or_service_description",
    "dod_claimant_program",
    "dod_claimant_program_description",
    "dod_acquisition_program",
    "dod_acquisition_program_description",
    "information_technology_commercial_item_category",
    "information_technology_commercial_item_category_description",
    "sea_transportation_description",
    "clinger_cohen_act_planning_description",
    "construction_wage_rate",
    "construction_wage_rate_description",
    "labor_standards_description",
    "materials_supplies",
    "materials_supplies_description",
    "cost_or_pricing_data_description",
    "domestic_or_foreign_entity_description",
    "foreign_funding_description",
    "interagency_contracting_authority",
    "interagency_contracting_authority_description",
    "price_evaluation_adjustment",
    "subcontracting_plan_description",
    "multi_year_contract_description",
    "purchase_card_as_payment_method",
    "purchase_card_as_payment_method_description",
    "consolidated_contract_description",
    "type_of_contract_pricing_description",
    "national_interest_action_description"
})
@Generated("jsonschema2pojo")
public class LatestTransactionContractData {

    @JsonProperty("idv_type_description")
    private Object idvTypeDescription;
    @JsonProperty("type_of_idc_description")
    private Object typeOfIdcDescription;
    @JsonProperty("referenced_idv_agency_iden")
    private Object referencedIdvAgencyIden;
    @JsonProperty("referenced_idv_agency_desc")
    private Object referencedIdvAgencyDesc;
    @JsonProperty("solicitation_identifier")
    private Object solicitationIdentifier;
    @JsonProperty("solicitation_procedures")
    private String solicitationProcedures;
    @JsonProperty("number_of_offers_received")
    private String numberOfOffersReceived;
    @JsonProperty("extent_competed")
    private String extentCompeted;
    @JsonProperty("type_set_aside")
    private String typeSetAside;
    @JsonProperty("type_set_aside_description")
    private String typeSetAsideDescription;
    @JsonProperty("evaluated_preference")
    private String evaluatedPreference;
    @JsonProperty("fed_biz_opps")
    private String fedBizOpps;
    @JsonProperty("fed_biz_opps_description")
    private String fedBizOppsDescription;
    @JsonProperty("small_business_competitive")
    private Boolean smallBusinessCompetitive;
    @JsonProperty("product_or_service_code")
    private String productOrServiceCode;
    @JsonProperty("naics")
    private String naics;
    @JsonProperty("naics_description")
    private String naicsDescription;
    @JsonProperty("sea_transportation")
    private Object seaTransportation;
    @JsonProperty("clinger_cohen_act_planning")
    private String clingerCohenActPlanning;
    @JsonProperty("labor_standards")
    private String laborStandards;
    @JsonProperty("cost_or_pricing_data")
    private String costOrPricingData;
    @JsonProperty("domestic_or_foreign_entity")
    private String domesticOrForeignEntity;
    @JsonProperty("foreign_funding")
    private String foreignFunding;
    @JsonProperty("major_program")
    private Object majorProgram;
    @JsonProperty("program_acronym")
    private Object programAcronym;
    @JsonProperty("subcontracting_plan")
    private String subcontractingPlan;
    @JsonProperty("multi_year_contract")
    private String multiYearContract;
    @JsonProperty("consolidated_contract")
    private String consolidatedContract;
    @JsonProperty("type_of_contract_pricing")
    private String typeOfContractPricing;
    @JsonProperty("national_interest_action")
    private String nationalInterestAction;
    @JsonProperty("multiple_or_single_award_description")
    private Object multipleOrSingleAwardDescription;
    @JsonProperty("solicitation_procedures_description")
    private String solicitationProceduresDescription;
    @JsonProperty("extent_competed_description")
    private String extentCompetedDescription;
    @JsonProperty("other_than_full_and_open")
    private String otherThanFullAndOpen;
    @JsonProperty("other_than_full_and_open_description")
    private String otherThanFullAndOpenDescription;
    @JsonProperty("commercial_item_acquisition")
    private String commercialItemAcquisition;
    @JsonProperty("commercial_item_acquisition_description")
    private String commercialItemAcquisitionDescription;
    @JsonProperty("commercial_item_test_program")
    private String commercialItemTestProgram;
    @JsonProperty("commercial_item_test_program_description")
    private String commercialItemTestProgramDescription;
    @JsonProperty("evaluated_preference_description")
    private String evaluatedPreferenceDescription;
    @JsonProperty("fair_opportunity_limited")
    private Object fairOpportunityLimited;
    @JsonProperty("fair_opportunity_limited_description")
    private Object fairOpportunityLimitedDescription;
    @JsonProperty("product_or_service_description")
    private String productOrServiceDescription;
    @JsonProperty("dod_claimant_program")
    private Object dodClaimantProgram;
    @JsonProperty("dod_claimant_program_description")
    private Object dodClaimantProgramDescription;
    @JsonProperty("dod_acquisition_program")
    private Object dodAcquisitionProgram;
    @JsonProperty("dod_acquisition_program_description")
    private Object dodAcquisitionProgramDescription;
    @JsonProperty("information_technology_commercial_item_category")
    private Object informationTechnologyCommercialItemCategory;
    @JsonProperty("information_technology_commercial_item_category_description")
    private Object informationTechnologyCommercialItemCategoryDescription;
    @JsonProperty("sea_transportation_description")
    private Object seaTransportationDescription;
    @JsonProperty("clinger_cohen_act_planning_description")
    private String clingerCohenActPlanningDescription;
    @JsonProperty("construction_wage_rate")
    private String constructionWageRate;
    @JsonProperty("construction_wage_rate_description")
    private String constructionWageRateDescription;
    @JsonProperty("labor_standards_description")
    private String laborStandardsDescription;
    @JsonProperty("materials_supplies")
    private String materialsSupplies;
    @JsonProperty("materials_supplies_description")
    private String materialsSuppliesDescription;
    @JsonProperty("cost_or_pricing_data_description")
    private String costOrPricingDataDescription;
    @JsonProperty("domestic_or_foreign_entity_description")
    private String domesticOrForeignEntityDescription;
    @JsonProperty("foreign_funding_description")
    private String foreignFundingDescription;
    @JsonProperty("interagency_contracting_authority")
    private String interagencyContractingAuthority;
    @JsonProperty("interagency_contracting_authority_description")
    private String interagencyContractingAuthorityDescription;
    @JsonProperty("price_evaluation_adjustment")
    private String priceEvaluationAdjustment;
    @JsonProperty("subcontracting_plan_description")
    private String subcontractingPlanDescription;
    @JsonProperty("multi_year_contract_description")
    private String multiYearContractDescription;
    @JsonProperty("purchase_card_as_payment_method")
    private String purchaseCardAsPaymentMethod;
    @JsonProperty("purchase_card_as_payment_method_description")
    private String purchaseCardAsPaymentMethodDescription;
    @JsonProperty("consolidated_contract_description")
    private String consolidatedContractDescription;
    @JsonProperty("type_of_contract_pricing_description")
    private String typeOfContractPricingDescription;
    @JsonProperty("national_interest_action_description")
    private String nationalInterestActionDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idv_type_description")
    public Object getIdvTypeDescription() {
        return idvTypeDescription;
    }

    @JsonProperty("idv_type_description")
    public void setIdvTypeDescription(Object idvTypeDescription) {
        this.idvTypeDescription = idvTypeDescription;
    }

    @JsonProperty("type_of_idc_description")
    public Object getTypeOfIdcDescription() {
        return typeOfIdcDescription;
    }

    @JsonProperty("type_of_idc_description")
    public void setTypeOfIdcDescription(Object typeOfIdcDescription) {
        this.typeOfIdcDescription = typeOfIdcDescription;
    }

    @JsonProperty("referenced_idv_agency_iden")
    public Object getReferencedIdvAgencyIden() {
        return referencedIdvAgencyIden;
    }

    @JsonProperty("referenced_idv_agency_iden")
    public void setReferencedIdvAgencyIden(Object referencedIdvAgencyIden) {
        this.referencedIdvAgencyIden = referencedIdvAgencyIden;
    }

    @JsonProperty("referenced_idv_agency_desc")
    public Object getReferencedIdvAgencyDesc() {
        return referencedIdvAgencyDesc;
    }

    @JsonProperty("referenced_idv_agency_desc")
    public void setReferencedIdvAgencyDesc(Object referencedIdvAgencyDesc) {
        this.referencedIdvAgencyDesc = referencedIdvAgencyDesc;
    }

    @JsonProperty("solicitation_identifier")
    public Object getSolicitationIdentifier() {
        return solicitationIdentifier;
    }

    @JsonProperty("solicitation_identifier")
    public void setSolicitationIdentifier(Object solicitationIdentifier) {
        this.solicitationIdentifier = solicitationIdentifier;
    }

    @JsonProperty("solicitation_procedures")
    public String getSolicitationProcedures() {
        return solicitationProcedures;
    }

    @JsonProperty("solicitation_procedures")
    public void setSolicitationProcedures(String solicitationProcedures) {
        this.solicitationProcedures = solicitationProcedures;
    }

    @JsonProperty("number_of_offers_received")
    public String getNumberOfOffersReceived() {
        return numberOfOffersReceived;
    }

    @JsonProperty("number_of_offers_received")
    public void setNumberOfOffersReceived(String numberOfOffersReceived) {
        this.numberOfOffersReceived = numberOfOffersReceived;
    }

    @JsonProperty("extent_competed")
    public String getExtentCompeted() {
        return extentCompeted;
    }

    @JsonProperty("extent_competed")
    public void setExtentCompeted(String extentCompeted) {
        this.extentCompeted = extentCompeted;
    }

    @JsonProperty("type_set_aside")
    public String getTypeSetAside() {
        return typeSetAside;
    }

    @JsonProperty("type_set_aside")
    public void setTypeSetAside(String typeSetAside) {
        this.typeSetAside = typeSetAside;
    }

    @JsonProperty("type_set_aside_description")
    public String getTypeSetAsideDescription() {
        return typeSetAsideDescription;
    }

    @JsonProperty("type_set_aside_description")
    public void setTypeSetAsideDescription(String typeSetAsideDescription) {
        this.typeSetAsideDescription = typeSetAsideDescription;
    }

    @JsonProperty("evaluated_preference")
    public String getEvaluatedPreference() {
        return evaluatedPreference;
    }

    @JsonProperty("evaluated_preference")
    public void setEvaluatedPreference(String evaluatedPreference) {
        this.evaluatedPreference = evaluatedPreference;
    }

    @JsonProperty("fed_biz_opps")
    public String getFedBizOpps() {
        return fedBizOpps;
    }

    @JsonProperty("fed_biz_opps")
    public void setFedBizOpps(String fedBizOpps) {
        this.fedBizOpps = fedBizOpps;
    }

    @JsonProperty("fed_biz_opps_description")
    public String getFedBizOppsDescription() {
        return fedBizOppsDescription;
    }

    @JsonProperty("fed_biz_opps_description")
    public void setFedBizOppsDescription(String fedBizOppsDescription) {
        this.fedBizOppsDescription = fedBizOppsDescription;
    }

    @JsonProperty("small_business_competitive")
    public Boolean getSmallBusinessCompetitive() {
        return smallBusinessCompetitive;
    }

    @JsonProperty("small_business_competitive")
    public void setSmallBusinessCompetitive(Boolean smallBusinessCompetitive) {
        this.smallBusinessCompetitive = smallBusinessCompetitive;
    }

    @JsonProperty("product_or_service_code")
    public String getProductOrServiceCode() {
        return productOrServiceCode;
    }

    @JsonProperty("product_or_service_code")
    public void setProductOrServiceCode(String productOrServiceCode) {
        this.productOrServiceCode = productOrServiceCode;
    }

    @JsonProperty("naics")
    public String getNaics() {
        return naics;
    }

    @JsonProperty("naics")
    public void setNaics(String naics) {
        this.naics = naics;
    }

    @JsonProperty("naics_description")
    public String getNaicsDescription() {
        return naicsDescription;
    }

    @JsonProperty("naics_description")
    public void setNaicsDescription(String naicsDescription) {
        this.naicsDescription = naicsDescription;
    }

    @JsonProperty("sea_transportation")
    public Object getSeaTransportation() {
        return seaTransportation;
    }

    @JsonProperty("sea_transportation")
    public void setSeaTransportation(Object seaTransportation) {
        this.seaTransportation = seaTransportation;
    }

    @JsonProperty("clinger_cohen_act_planning")
    public String getClingerCohenActPlanning() {
        return clingerCohenActPlanning;
    }

    @JsonProperty("clinger_cohen_act_planning")
    public void setClingerCohenActPlanning(String clingerCohenActPlanning) {
        this.clingerCohenActPlanning = clingerCohenActPlanning;
    }

    @JsonProperty("labor_standards")
    public String getLaborStandards() {
        return laborStandards;
    }

    @JsonProperty("labor_standards")
    public void setLaborStandards(String laborStandards) {
        this.laborStandards = laborStandards;
    }

    @JsonProperty("cost_or_pricing_data")
    public String getCostOrPricingData() {
        return costOrPricingData;
    }

    @JsonProperty("cost_or_pricing_data")
    public void setCostOrPricingData(String costOrPricingData) {
        this.costOrPricingData = costOrPricingData;
    }

    @JsonProperty("domestic_or_foreign_entity")
    public String getDomesticOrForeignEntity() {
        return domesticOrForeignEntity;
    }

    @JsonProperty("domestic_or_foreign_entity")
    public void setDomesticOrForeignEntity(String domesticOrForeignEntity) {
        this.domesticOrForeignEntity = domesticOrForeignEntity;
    }

    @JsonProperty("foreign_funding")
    public String getForeignFunding() {
        return foreignFunding;
    }

    @JsonProperty("foreign_funding")
    public void setForeignFunding(String foreignFunding) {
        this.foreignFunding = foreignFunding;
    }

    @JsonProperty("major_program")
    public Object getMajorProgram() {
        return majorProgram;
    }

    @JsonProperty("major_program")
    public void setMajorProgram(Object majorProgram) {
        this.majorProgram = majorProgram;
    }

    @JsonProperty("program_acronym")
    public Object getProgramAcronym() {
        return programAcronym;
    }

    @JsonProperty("program_acronym")
    public void setProgramAcronym(Object programAcronym) {
        this.programAcronym = programAcronym;
    }

    @JsonProperty("subcontracting_plan")
    public String getSubcontractingPlan() {
        return subcontractingPlan;
    }

    @JsonProperty("subcontracting_plan")
    public void setSubcontractingPlan(String subcontractingPlan) {
        this.subcontractingPlan = subcontractingPlan;
    }

    @JsonProperty("multi_year_contract")
    public String getMultiYearContract() {
        return multiYearContract;
    }

    @JsonProperty("multi_year_contract")
    public void setMultiYearContract(String multiYearContract) {
        this.multiYearContract = multiYearContract;
    }

    @JsonProperty("consolidated_contract")
    public String getConsolidatedContract() {
        return consolidatedContract;
    }

    @JsonProperty("consolidated_contract")
    public void setConsolidatedContract(String consolidatedContract) {
        this.consolidatedContract = consolidatedContract;
    }

    @JsonProperty("type_of_contract_pricing")
    public String getTypeOfContractPricing() {
        return typeOfContractPricing;
    }

    @JsonProperty("type_of_contract_pricing")
    public void setTypeOfContractPricing(String typeOfContractPricing) {
        this.typeOfContractPricing = typeOfContractPricing;
    }

    @JsonProperty("national_interest_action")
    public String getNationalInterestAction() {
        return nationalInterestAction;
    }

    @JsonProperty("national_interest_action")
    public void setNationalInterestAction(String nationalInterestAction) {
        this.nationalInterestAction = nationalInterestAction;
    }

    @JsonProperty("multiple_or_single_award_description")
    public Object getMultipleOrSingleAwardDescription() {
        return multipleOrSingleAwardDescription;
    }

    @JsonProperty("multiple_or_single_award_description")
    public void setMultipleOrSingleAwardDescription(Object multipleOrSingleAwardDescription) {
        this.multipleOrSingleAwardDescription = multipleOrSingleAwardDescription;
    }

    @JsonProperty("solicitation_procedures_description")
    public String getSolicitationProceduresDescription() {
        return solicitationProceduresDescription;
    }

    @JsonProperty("solicitation_procedures_description")
    public void setSolicitationProceduresDescription(String solicitationProceduresDescription) {
        this.solicitationProceduresDescription = solicitationProceduresDescription;
    }

    @JsonProperty("extent_competed_description")
    public String getExtentCompetedDescription() {
        return extentCompetedDescription;
    }

    @JsonProperty("extent_competed_description")
    public void setExtentCompetedDescription(String extentCompetedDescription) {
        this.extentCompetedDescription = extentCompetedDescription;
    }

    @JsonProperty("other_than_full_and_open")
    public String getOtherThanFullAndOpen() {
        return otherThanFullAndOpen;
    }

    @JsonProperty("other_than_full_and_open")
    public void setOtherThanFullAndOpen(String otherThanFullAndOpen) {
        this.otherThanFullAndOpen = otherThanFullAndOpen;
    }

    @JsonProperty("other_than_full_and_open_description")
    public String getOtherThanFullAndOpenDescription() {
        return otherThanFullAndOpenDescription;
    }

    @JsonProperty("other_than_full_and_open_description")
    public void setOtherThanFullAndOpenDescription(String otherThanFullAndOpenDescription) {
        this.otherThanFullAndOpenDescription = otherThanFullAndOpenDescription;
    }

    @JsonProperty("commercial_item_acquisition")
    public String getCommercialItemAcquisition() {
        return commercialItemAcquisition;
    }

    @JsonProperty("commercial_item_acquisition")
    public void setCommercialItemAcquisition(String commercialItemAcquisition) {
        this.commercialItemAcquisition = commercialItemAcquisition;
    }

    @JsonProperty("commercial_item_acquisition_description")
    public String getCommercialItemAcquisitionDescription() {
        return commercialItemAcquisitionDescription;
    }

    @JsonProperty("commercial_item_acquisition_description")
    public void setCommercialItemAcquisitionDescription(String commercialItemAcquisitionDescription) {
        this.commercialItemAcquisitionDescription = commercialItemAcquisitionDescription;
    }

    @JsonProperty("commercial_item_test_program")
    public String getCommercialItemTestProgram() {
        return commercialItemTestProgram;
    }

    @JsonProperty("commercial_item_test_program")
    public void setCommercialItemTestProgram(String commercialItemTestProgram) {
        this.commercialItemTestProgram = commercialItemTestProgram;
    }

    @JsonProperty("commercial_item_test_program_description")
    public String getCommercialItemTestProgramDescription() {
        return commercialItemTestProgramDescription;
    }

    @JsonProperty("commercial_item_test_program_description")
    public void setCommercialItemTestProgramDescription(String commercialItemTestProgramDescription) {
        this.commercialItemTestProgramDescription = commercialItemTestProgramDescription;
    }

    @JsonProperty("evaluated_preference_description")
    public String getEvaluatedPreferenceDescription() {
        return evaluatedPreferenceDescription;
    }

    @JsonProperty("evaluated_preference_description")
    public void setEvaluatedPreferenceDescription(String evaluatedPreferenceDescription) {
        this.evaluatedPreferenceDescription = evaluatedPreferenceDescription;
    }

    @JsonProperty("fair_opportunity_limited")
    public Object getFairOpportunityLimited() {
        return fairOpportunityLimited;
    }

    @JsonProperty("fair_opportunity_limited")
    public void setFairOpportunityLimited(Object fairOpportunityLimited) {
        this.fairOpportunityLimited = fairOpportunityLimited;
    }

    @JsonProperty("fair_opportunity_limited_description")
    public Object getFairOpportunityLimitedDescription() {
        return fairOpportunityLimitedDescription;
    }

    @JsonProperty("fair_opportunity_limited_description")
    public void setFairOpportunityLimitedDescription(Object fairOpportunityLimitedDescription) {
        this.fairOpportunityLimitedDescription = fairOpportunityLimitedDescription;
    }

    @JsonProperty("product_or_service_description")
    public String getProductOrServiceDescription() {
        return productOrServiceDescription;
    }

    @JsonProperty("product_or_service_description")
    public void setProductOrServiceDescription(String productOrServiceDescription) {
        this.productOrServiceDescription = productOrServiceDescription;
    }

    @JsonProperty("dod_claimant_program")
    public Object getDodClaimantProgram() {
        return dodClaimantProgram;
    }

    @JsonProperty("dod_claimant_program")
    public void setDodClaimantProgram(Object dodClaimantProgram) {
        this.dodClaimantProgram = dodClaimantProgram;
    }

    @JsonProperty("dod_claimant_program_description")
    public Object getDodClaimantProgramDescription() {
        return dodClaimantProgramDescription;
    }

    @JsonProperty("dod_claimant_program_description")
    public void setDodClaimantProgramDescription(Object dodClaimantProgramDescription) {
        this.dodClaimantProgramDescription = dodClaimantProgramDescription;
    }

    @JsonProperty("dod_acquisition_program")
    public Object getDodAcquisitionProgram() {
        return dodAcquisitionProgram;
    }

    @JsonProperty("dod_acquisition_program")
    public void setDodAcquisitionProgram(Object dodAcquisitionProgram) {
        this.dodAcquisitionProgram = dodAcquisitionProgram;
    }

    @JsonProperty("dod_acquisition_program_description")
    public Object getDodAcquisitionProgramDescription() {
        return dodAcquisitionProgramDescription;
    }

    @JsonProperty("dod_acquisition_program_description")
    public void setDodAcquisitionProgramDescription(Object dodAcquisitionProgramDescription) {
        this.dodAcquisitionProgramDescription = dodAcquisitionProgramDescription;
    }

    @JsonProperty("information_technology_commercial_item_category")
    public Object getInformationTechnologyCommercialItemCategory() {
        return informationTechnologyCommercialItemCategory;
    }

    @JsonProperty("information_technology_commercial_item_category")
    public void setInformationTechnologyCommercialItemCategory(Object informationTechnologyCommercialItemCategory) {
        this.informationTechnologyCommercialItemCategory = informationTechnologyCommercialItemCategory;
    }

    @JsonProperty("information_technology_commercial_item_category_description")
    public Object getInformationTechnologyCommercialItemCategoryDescription() {
        return informationTechnologyCommercialItemCategoryDescription;
    }

    @JsonProperty("information_technology_commercial_item_category_description")
    public void setInformationTechnologyCommercialItemCategoryDescription(Object informationTechnologyCommercialItemCategoryDescription) {
        this.informationTechnologyCommercialItemCategoryDescription = informationTechnologyCommercialItemCategoryDescription;
    }

    @JsonProperty("sea_transportation_description")
    public Object getSeaTransportationDescription() {
        return seaTransportationDescription;
    }

    @JsonProperty("sea_transportation_description")
    public void setSeaTransportationDescription(Object seaTransportationDescription) {
        this.seaTransportationDescription = seaTransportationDescription;
    }

    @JsonProperty("clinger_cohen_act_planning_description")
    public String getClingerCohenActPlanningDescription() {
        return clingerCohenActPlanningDescription;
    }

    @JsonProperty("clinger_cohen_act_planning_description")
    public void setClingerCohenActPlanningDescription(String clingerCohenActPlanningDescription) {
        this.clingerCohenActPlanningDescription = clingerCohenActPlanningDescription;
    }

    @JsonProperty("construction_wage_rate")
    public String getConstructionWageRate() {
        return constructionWageRate;
    }

    @JsonProperty("construction_wage_rate")
    public void setConstructionWageRate(String constructionWageRate) {
        this.constructionWageRate = constructionWageRate;
    }

    @JsonProperty("construction_wage_rate_description")
    public String getConstructionWageRateDescription() {
        return constructionWageRateDescription;
    }

    @JsonProperty("construction_wage_rate_description")
    public void setConstructionWageRateDescription(String constructionWageRateDescription) {
        this.constructionWageRateDescription = constructionWageRateDescription;
    }

    @JsonProperty("labor_standards_description")
    public String getLaborStandardsDescription() {
        return laborStandardsDescription;
    }

    @JsonProperty("labor_standards_description")
    public void setLaborStandardsDescription(String laborStandardsDescription) {
        this.laborStandardsDescription = laborStandardsDescription;
    }

    @JsonProperty("materials_supplies")
    public String getMaterialsSupplies() {
        return materialsSupplies;
    }

    @JsonProperty("materials_supplies")
    public void setMaterialsSupplies(String materialsSupplies) {
        this.materialsSupplies = materialsSupplies;
    }

    @JsonProperty("materials_supplies_description")
    public String getMaterialsSuppliesDescription() {
        return materialsSuppliesDescription;
    }

    @JsonProperty("materials_supplies_description")
    public void setMaterialsSuppliesDescription(String materialsSuppliesDescription) {
        this.materialsSuppliesDescription = materialsSuppliesDescription;
    }

    @JsonProperty("cost_or_pricing_data_description")
    public String getCostOrPricingDataDescription() {
        return costOrPricingDataDescription;
    }

    @JsonProperty("cost_or_pricing_data_description")
    public void setCostOrPricingDataDescription(String costOrPricingDataDescription) {
        this.costOrPricingDataDescription = costOrPricingDataDescription;
    }

    @JsonProperty("domestic_or_foreign_entity_description")
    public String getDomesticOrForeignEntityDescription() {
        return domesticOrForeignEntityDescription;
    }

    @JsonProperty("domestic_or_foreign_entity_description")
    public void setDomesticOrForeignEntityDescription(String domesticOrForeignEntityDescription) {
        this.domesticOrForeignEntityDescription = domesticOrForeignEntityDescription;
    }

    @JsonProperty("foreign_funding_description")
    public String getForeignFundingDescription() {
        return foreignFundingDescription;
    }

    @JsonProperty("foreign_funding_description")
    public void setForeignFundingDescription(String foreignFundingDescription) {
        this.foreignFundingDescription = foreignFundingDescription;
    }

    @JsonProperty("interagency_contracting_authority")
    public String getInteragencyContractingAuthority() {
        return interagencyContractingAuthority;
    }

    @JsonProperty("interagency_contracting_authority")
    public void setInteragencyContractingAuthority(String interagencyContractingAuthority) {
        this.interagencyContractingAuthority = interagencyContractingAuthority;
    }

    @JsonProperty("interagency_contracting_authority_description")
    public String getInteragencyContractingAuthorityDescription() {
        return interagencyContractingAuthorityDescription;
    }

    @JsonProperty("interagency_contracting_authority_description")
    public void setInteragencyContractingAuthorityDescription(String interagencyContractingAuthorityDescription) {
        this.interagencyContractingAuthorityDescription = interagencyContractingAuthorityDescription;
    }

    @JsonProperty("price_evaluation_adjustment")
    public String getPriceEvaluationAdjustment() {
        return priceEvaluationAdjustment;
    }

    @JsonProperty("price_evaluation_adjustment")
    public void setPriceEvaluationAdjustment(String priceEvaluationAdjustment) {
        this.priceEvaluationAdjustment = priceEvaluationAdjustment;
    }

    @JsonProperty("subcontracting_plan_description")
    public String getSubcontractingPlanDescription() {
        return subcontractingPlanDescription;
    }

    @JsonProperty("subcontracting_plan_description")
    public void setSubcontractingPlanDescription(String subcontractingPlanDescription) {
        this.subcontractingPlanDescription = subcontractingPlanDescription;
    }

    @JsonProperty("multi_year_contract_description")
    public String getMultiYearContractDescription() {
        return multiYearContractDescription;
    }

    @JsonProperty("multi_year_contract_description")
    public void setMultiYearContractDescription(String multiYearContractDescription) {
        this.multiYearContractDescription = multiYearContractDescription;
    }

    @JsonProperty("purchase_card_as_payment_method")
    public String getPurchaseCardAsPaymentMethod() {
        return purchaseCardAsPaymentMethod;
    }

    @JsonProperty("purchase_card_as_payment_method")
    public void setPurchaseCardAsPaymentMethod(String purchaseCardAsPaymentMethod) {
        this.purchaseCardAsPaymentMethod = purchaseCardAsPaymentMethod;
    }

    @JsonProperty("purchase_card_as_payment_method_description")
    public String getPurchaseCardAsPaymentMethodDescription() {
        return purchaseCardAsPaymentMethodDescription;
    }

    @JsonProperty("purchase_card_as_payment_method_description")
    public void setPurchaseCardAsPaymentMethodDescription(String purchaseCardAsPaymentMethodDescription) {
        this.purchaseCardAsPaymentMethodDescription = purchaseCardAsPaymentMethodDescription;
    }

    @JsonProperty("consolidated_contract_description")
    public String getConsolidatedContractDescription() {
        return consolidatedContractDescription;
    }

    @JsonProperty("consolidated_contract_description")
    public void setConsolidatedContractDescription(String consolidatedContractDescription) {
        this.consolidatedContractDescription = consolidatedContractDescription;
    }

    @JsonProperty("type_of_contract_pricing_description")
    public String getTypeOfContractPricingDescription() {
        return typeOfContractPricingDescription;
    }

    @JsonProperty("type_of_contract_pricing_description")
    public void setTypeOfContractPricingDescription(String typeOfContractPricingDescription) {
        this.typeOfContractPricingDescription = typeOfContractPricingDescription;
    }

    @JsonProperty("national_interest_action_description")
    public String getNationalInterestActionDescription() {
        return nationalInterestActionDescription;
    }

    @JsonProperty("national_interest_action_description")
    public void setNationalInterestActionDescription(String nationalInterestActionDescription) {
        this.nationalInterestActionDescription = nationalInterestActionDescription;
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
