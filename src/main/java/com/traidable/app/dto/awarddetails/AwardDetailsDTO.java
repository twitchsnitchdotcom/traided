
package com.traidable.app.dto.awarddetails;

import java.util.HashMap;
import java.util.List;
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
    "id",
    "generated_unique_award_id",
    "piid",
    "category",
    "type",
    "type_description",
    "description",
    "total_obligation",
    "subaward_count",
    "total_subaward_amount",
    "date_signed",
    "base_exercised_options",
    "base_and_all_options",
    "total_account_outlay",
    "total_account_obligation",
    "account_outlays_by_defc",
    "account_obligations_by_defc",
    "parent_award",
    "latest_transaction_contract_data",
    "funding_agency",
    "awarding_agency",
    "period_of_performance",
    "recipient",
    "executive_details",
    "place_of_performance",
    "psc_hierarchy",
    "naics_hierarchy",
    "total_outlay"
})
@Generated("jsonschema2pojo")
public class AwardDetailsDTO {

    private Map map;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("generated_unique_award_id")
    private String generatedUniqueAwardId;
    @JsonProperty("piid")
    private String piid;
    @JsonProperty("category")
    private String category;
    @JsonProperty("type")
    private String type;
    @JsonProperty("type_description")
    private String typeDescription;
    @JsonProperty("description")
    private String description;
    @JsonProperty("total_obligation")
    private Double totalObligation;
    @JsonProperty("subaward_count")
    private Long subawardCount;
    @JsonProperty("total_subaward_amount")
    private Object totalSubawardAmount;
    @JsonProperty("date_signed")
    private String dateSigned;
    @JsonProperty("base_exercised_options")
    private Double baseExercisedOptions;
    @JsonProperty("base_and_all_options")
    private Double baseAndAllOptions;
    @JsonProperty("total_account_outlay")
    private Long totalAccountOutlay;
    @JsonProperty("total_account_obligation")
    private Long totalAccountObligation;
    @JsonProperty("account_outlays_by_defc")
    private List<Object> accountOutlaysByDefc = null;
    @JsonProperty("account_obligations_by_defc")
    private List<Object> accountObligationsByDefc = null;
    @JsonProperty("parent_award")
    private Object parentAward;
    @JsonProperty("latest_transaction_contract_data")
    private LatestTransactionContractData latestTransactionContractData;
    @JsonProperty("funding_agency")
    private FundingAgency fundingAgency;
    @JsonProperty("awarding_agency")
    private AwardingAgency awardingAgency;
    @JsonProperty("period_of_performance")
    private PeriodOfPerformance periodOfPerformance;
    @JsonProperty("recipient")
    private Recipient recipient;
    @JsonProperty("executive_details")
    private ExecutiveDetails executiveDetails;
    @JsonProperty("place_of_performance")
    private PlaceOfPerformance placeOfPerformance;
    @JsonProperty("psc_hierarchy")
    private PscHierarchy pscHierarchy;
    @JsonProperty("naics_hierarchy")
    private NaicsHierarchy naicsHierarchy;
    @JsonProperty("total_outlay")
    private Object totalOutlay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("generated_unique_award_id")
    public String getGeneratedUniqueAwardId() {
        return generatedUniqueAwardId;
    }

    @JsonProperty("generated_unique_award_id")
    public void setGeneratedUniqueAwardId(String generatedUniqueAwardId) {
        this.generatedUniqueAwardId = generatedUniqueAwardId;
    }

    @JsonProperty("piid")
    public String getPiid() {
        return piid;
    }

    @JsonProperty("piid")
    public void setPiid(String piid) {
        this.piid = piid;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("type_description")
    public String getTypeDescription() {
        return typeDescription;
    }

    @JsonProperty("type_description")
    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("total_obligation")
    public Double getTotalObligation() {
        return totalObligation;
    }

    @JsonProperty("total_obligation")
    public void setTotalObligation(Double totalObligation) {
        this.totalObligation = totalObligation;
    }

    @JsonProperty("subaward_count")
    public Long getSubawardCount() {
        return subawardCount;
    }

    @JsonProperty("subaward_count")
    public void setSubawardCount(Long subawardCount) {
        this.subawardCount = subawardCount;
    }

    @JsonProperty("total_subaward_amount")
    public Object getTotalSubawardAmount() {
        return totalSubawardAmount;
    }

    @JsonProperty("total_subaward_amount")
    public void setTotalSubawardAmount(Object totalSubawardAmount) {
        this.totalSubawardAmount = totalSubawardAmount;
    }

    @JsonProperty("date_signed")
    public String getDateSigned() {
        return dateSigned;
    }

    @JsonProperty("date_signed")
    public void setDateSigned(String dateSigned) {
        this.dateSigned = dateSigned;
    }

    @JsonProperty("base_exercised_options")
    public Double getBaseExercisedOptions() {
        return baseExercisedOptions;
    }

    @JsonProperty("base_exercised_options")
    public void setBaseExercisedOptions(Double baseExercisedOptions) {
        this.baseExercisedOptions = baseExercisedOptions;
    }

    @JsonProperty("base_and_all_options")
    public Double getBaseAndAllOptions() {
        return baseAndAllOptions;
    }

    @JsonProperty("base_and_all_options")
    public void setBaseAndAllOptions(Double baseAndAllOptions) {
        this.baseAndAllOptions = baseAndAllOptions;
    }

    @JsonProperty("total_account_outlay")
    public Long getTotalAccountOutlay() {
        return totalAccountOutlay;
    }

    @JsonProperty("total_account_outlay")
    public void setTotalAccountOutlay(Long totalAccountOutlay) {
        this.totalAccountOutlay = totalAccountOutlay;
    }

    @JsonProperty("total_account_obligation")
    public Long getTotalAccountObligation() {
        return totalAccountObligation;
    }

    @JsonProperty("total_account_obligation")
    public void setTotalAccountObligation(Long totalAccountObligation) {
        this.totalAccountObligation = totalAccountObligation;
    }

    @JsonProperty("account_outlays_by_defc")
    public List<Object> getAccountOutlaysByDefc() {
        return accountOutlaysByDefc;
    }

    @JsonProperty("account_outlays_by_defc")
    public void setAccountOutlaysByDefc(List<Object> accountOutlaysByDefc) {
        this.accountOutlaysByDefc = accountOutlaysByDefc;
    }

    @JsonProperty("account_obligations_by_defc")
    public List<Object> getAccountObligationsByDefc() {
        return accountObligationsByDefc;
    }

    @JsonProperty("account_obligations_by_defc")
    public void setAccountObligationsByDefc(List<Object> accountObligationsByDefc) {
        this.accountObligationsByDefc = accountObligationsByDefc;
    }

    @JsonProperty("parent_award")
    public Object getParentAward() {
        return parentAward;
    }

    @JsonProperty("parent_award")
    public void setParentAward(Object parentAward) {
        this.parentAward = parentAward;
    }

    @JsonProperty("latest_transaction_contract_data")
    public LatestTransactionContractData getLatestTransactionContractData() {
        return latestTransactionContractData;
    }

    @JsonProperty("latest_transaction_contract_data")
    public void setLatestTransactionContractData(LatestTransactionContractData latestTransactionContractData) {
        this.latestTransactionContractData = latestTransactionContractData;
    }

    @JsonProperty("funding_agency")
    public FundingAgency getFundingAgency() {
        return fundingAgency;
    }

    @JsonProperty("funding_agency")
    public void setFundingAgency(FundingAgency fundingAgency) {
        this.fundingAgency = fundingAgency;
    }

    @JsonProperty("awarding_agency")
    public AwardingAgency getAwardingAgency() {
        return awardingAgency;
    }

    @JsonProperty("awarding_agency")
    public void setAwardingAgency(AwardingAgency awardingAgency) {
        this.awardingAgency = awardingAgency;
    }

    @JsonProperty("period_of_performance")
    public PeriodOfPerformance getPeriodOfPerformance() {
        return periodOfPerformance;
    }

    @JsonProperty("period_of_performance")
    public void setPeriodOfPerformance(PeriodOfPerformance periodOfPerformance) {
        this.periodOfPerformance = periodOfPerformance;
    }

    @JsonProperty("recipient")
    public Recipient getRecipient() {
        return recipient;
    }

    @JsonProperty("recipient")
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("executive_details")
    public ExecutiveDetails getExecutiveDetails() {
        return executiveDetails;
    }

    @JsonProperty("executive_details")
    public void setExecutiveDetails(ExecutiveDetails executiveDetails) {
        this.executiveDetails = executiveDetails;
    }

    @JsonProperty("place_of_performance")
    public PlaceOfPerformance getPlaceOfPerformance() {
        return placeOfPerformance;
    }

    @JsonProperty("place_of_performance")
    public void setPlaceOfPerformance(PlaceOfPerformance placeOfPerformance) {
        this.placeOfPerformance = placeOfPerformance;
    }

    @JsonProperty("psc_hierarchy")
    public PscHierarchy getPscHierarchy() {
        return pscHierarchy;
    }

    @JsonProperty("psc_hierarchy")
    public void setPscHierarchy(PscHierarchy pscHierarchy) {
        this.pscHierarchy = pscHierarchy;
    }

    @JsonProperty("naics_hierarchy")
    public NaicsHierarchy getNaicsHierarchy() {
        return naicsHierarchy;
    }

    @JsonProperty("naics_hierarchy")
    public void setNaicsHierarchy(NaicsHierarchy naicsHierarchy) {
        this.naicsHierarchy = naicsHierarchy;
    }

    @JsonProperty("total_outlay")
    public Object getTotalOutlay() {
        return totalOutlay;
    }

    @JsonProperty("total_outlay")
    public void setTotalOutlay(Object totalOutlay) {
        this.totalOutlay = totalOutlay;
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
