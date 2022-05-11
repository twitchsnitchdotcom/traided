
package com.traidable.app.dto.transactions;

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
    "id",
    "type",
    "type_description",
    "action_date",
    "action_type",
    "action_type_description",
    "modification_number",
    "description",
    "federal_action_obligation",
    "face_value_loan_guarantee",
    "original_loan_subsidy_cost"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("type_description")
    private String typeDescription;
    @JsonProperty("action_date")
    private String actionDate;
    @JsonProperty("action_type")
    private String actionType;
    @JsonProperty("action_type_description")
    private String actionTypeDescription;
    @JsonProperty("modification_number")
    private String modificationNumber;
    @JsonProperty("description")
    private String description;
    @JsonProperty("federal_action_obligation")
    private Double federalActionObligation;
    @JsonProperty("face_value_loan_guarantee")
    private Object faceValueLoanGuarantee;
    @JsonProperty("original_loan_subsidy_cost")
    private Object originalLoanSubsidyCost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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

    @JsonProperty("action_date")
    public String getActionDate() {
        return actionDate;
    }

    @JsonProperty("action_date")
    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return actionType;
    }

    @JsonProperty("action_type")
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @JsonProperty("action_type_description")
    public String getActionTypeDescription() {
        return actionTypeDescription;
    }

    @JsonProperty("action_type_description")
    public void setActionTypeDescription(String actionTypeDescription) {
        this.actionTypeDescription = actionTypeDescription;
    }

    @JsonProperty("modification_number")
    public String getModificationNumber() {
        return modificationNumber;
    }

    @JsonProperty("modification_number")
    public void setModificationNumber(String modificationNumber) {
        this.modificationNumber = modificationNumber;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("federal_action_obligation")
    public Double getFederalActionObligation() {
        return federalActionObligation;
    }

    @JsonProperty("federal_action_obligation")
    public void setFederalActionObligation(Double federalActionObligation) {
        this.federalActionObligation = federalActionObligation;
    }

    @JsonProperty("face_value_loan_guarantee")
    public Object getFaceValueLoanGuarantee() {
        return faceValueLoanGuarantee;
    }

    @JsonProperty("face_value_loan_guarantee")
    public void setFaceValueLoanGuarantee(Object faceValueLoanGuarantee) {
        this.faceValueLoanGuarantee = faceValueLoanGuarantee;
    }

    @JsonProperty("original_loan_subsidy_cost")
    public Object getOriginalLoanSubsidyCost() {
        return originalLoanSubsidyCost;
    }

    @JsonProperty("original_loan_subsidy_cost")
    public void setOriginalLoanSubsidyCost(Object originalLoanSubsidyCost) {
        this.originalLoanSubsidyCost = originalLoanSubsidyCost;
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
