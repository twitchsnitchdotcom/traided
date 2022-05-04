
package org.vaadin.spring.tutorial.dto.entity;

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
    "name",
    "alternate_names",
    "duns",
    "uei",
    "recipient_id",
    "recipient_level",
    "parent_id",
    "parent_name",
    "parent_duns",
    "parent_uei",
    "parents",
    "business_types",
    "location",
    "total_transaction_amount",
    "total_transactions",
    "total_face_value_loan_amount",
    "total_face_value_loan_transactions"
})
@Generated("jsonschema2pojo")
public class EntityDTO {

    private Map map;
    @JsonProperty("name")
    private String name;
    @JsonProperty("alternate_names")
    private List<String> alternateNames = null;
    @JsonProperty("duns")
    private String duns;
    @JsonProperty("uei")
    private String uei;
    @JsonProperty("recipient_id")
    private String recipientId;
    @JsonProperty("recipient_level")
    private String recipientLevel;
    @JsonProperty("parent_id")
    private String parentId;
    @JsonProperty("parent_name")
    private String parentName;
    @JsonProperty("parent_duns")
    private String parentDuns;
    @JsonProperty("parent_uei")
    private String parentUei;
    @JsonProperty("parents")
    private List<Parent> parents = null;
    @JsonProperty("business_types")
    private List<String> businessTypes = null;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("total_transaction_amount")
    private Double totalTransactionAmount;
    @JsonProperty("total_transactions")
    private Long totalTransactions;
    @JsonProperty("total_face_value_loan_amount")
    private Double totalFaceValueLoanAmount;
    @JsonProperty("total_face_value_loan_transactions")
    private Long totalFaceValueLoanTransactions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("alternate_names")
    public List<String> getAlternateNames() {
        return alternateNames;
    }

    @JsonProperty("alternate_names")
    public void setAlternateNames(List<String> alternateNames) {
        this.alternateNames = alternateNames;
    }

    @JsonProperty("duns")
    public String getDuns() {
        return duns;
    }

    @JsonProperty("duns")
    public void setDuns(String duns) {
        this.duns = duns;
    }

    @JsonProperty("uei")
    public String getUei() {
        return uei;
    }

    @JsonProperty("uei")
    public void setUei(String uei) {
        this.uei = uei;
    }

    @JsonProperty("recipient_id")
    public String getRecipientId() {
        return recipientId;
    }

    @JsonProperty("recipient_id")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    @JsonProperty("recipient_level")
    public String getRecipientLevel() {
        return recipientLevel;
    }

    @JsonProperty("recipient_level")
    public void setRecipientLevel(String recipientLevel) {
        this.recipientLevel = recipientLevel;
    }

    @JsonProperty("parent_id")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("parent_name")
    public String getParentName() {
        return parentName;
    }

    @JsonProperty("parent_name")
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @JsonProperty("parent_duns")
    public String getParentDuns() {
        return parentDuns;
    }

    @JsonProperty("parent_duns")
    public void setParentDuns(String parentDuns) {
        this.parentDuns = parentDuns;
    }

    @JsonProperty("parent_uei")
    public String getParentUei() {
        return parentUei;
    }

    @JsonProperty("parent_uei")
    public void setParentUei(String parentUei) {
        this.parentUei = parentUei;
    }

    @JsonProperty("parents")
    public List<Parent> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @JsonProperty("business_types")
    public List<String> getBusinessTypes() {
        return businessTypes;
    }

    @JsonProperty("business_types")
    public void setBusinessTypes(List<String> businessTypes) {
        this.businessTypes = businessTypes;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("total_transaction_amount")
    public Double getTotalTransactionAmount() {
        return totalTransactionAmount;
    }

    @JsonProperty("total_transaction_amount")
    public void setTotalTransactionAmount(Double totalTransactionAmount) {
        this.totalTransactionAmount = totalTransactionAmount;
    }

    @JsonProperty("total_transactions")
    public Long getTotalTransactions() {
        return totalTransactions;
    }

    @JsonProperty("total_transactions")
    public void setTotalTransactions(Long totalTransactions) {
        this.totalTransactions = totalTransactions;
    }

    @JsonProperty("total_face_value_loan_amount")
    public Double getTotalFaceValueLoanAmount() {
        return totalFaceValueLoanAmount;
    }

    @JsonProperty("total_face_value_loan_amount")
    public void setTotalFaceValueLoanAmount(Double totalFaceValueLoanAmount) {
        this.totalFaceValueLoanAmount = totalFaceValueLoanAmount;
    }

    @JsonProperty("total_face_value_loan_transactions")
    public Long getTotalFaceValueLoanTransactions() {
        return totalFaceValueLoanTransactions;
    }

    @JsonProperty("total_face_value_loan_transactions")
    public void setTotalFaceValueLoanTransactions(Long totalFaceValueLoanTransactions) {
        this.totalFaceValueLoanTransactions = totalFaceValueLoanTransactions;
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
