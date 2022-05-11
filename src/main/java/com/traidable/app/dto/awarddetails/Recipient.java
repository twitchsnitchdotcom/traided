
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
    "recipient_hash",
    "recipient_name",
    "recipient_uei",
    "recipient_unique_id",
    "parent_recipient_hash",
    "parent_recipient_name",
    "parent_recipient_uei",
    "parent_recipient_unique_id",
    "business_categories",
    "location"
})
@Generated("jsonschema2pojo")
public class Recipient {

    @JsonProperty("recipient_hash")
    private String recipientHash;
    @JsonProperty("recipient_name")
    private String recipientName;
    @JsonProperty("recipient_uei")
    private String recipientUei;
    @JsonProperty("recipient_unique_id")
    private String recipientUniqueId;
    @JsonProperty("parent_recipient_hash")
    private String parentRecipientHash;
    @JsonProperty("parent_recipient_name")
    private String parentRecipientName;
    @JsonProperty("parent_recipient_uei")
    private String parentRecipientUei;
    @JsonProperty("parent_recipient_unique_id")
    private String parentRecipientUniqueId;
    @JsonProperty("business_categories")
    private List<String> businessCategories = null;
    @JsonProperty("location")
    private Location location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recipient_hash")
    public String getRecipientHash() {
        return recipientHash;
    }

    @JsonProperty("recipient_hash")
    public void setRecipientHash(String recipientHash) {
        this.recipientHash = recipientHash;
    }

    @JsonProperty("recipient_name")
    public String getRecipientName() {
        return recipientName;
    }

    @JsonProperty("recipient_name")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @JsonProperty("recipient_uei")
    public String getRecipientUei() {
        return recipientUei;
    }

    @JsonProperty("recipient_uei")
    public void setRecipientUei(String recipientUei) {
        this.recipientUei = recipientUei;
    }

    @JsonProperty("recipient_unique_id")
    public String getRecipientUniqueId() {
        return recipientUniqueId;
    }

    @JsonProperty("recipient_unique_id")
    public void setRecipientUniqueId(String recipientUniqueId) {
        this.recipientUniqueId = recipientUniqueId;
    }

    @JsonProperty("parent_recipient_hash")
    public String getParentRecipientHash() {
        return parentRecipientHash;
    }

    @JsonProperty("parent_recipient_hash")
    public void setParentRecipientHash(String parentRecipientHash) {
        this.parentRecipientHash = parentRecipientHash;
    }

    @JsonProperty("parent_recipient_name")
    public String getParentRecipientName() {
        return parentRecipientName;
    }

    @JsonProperty("parent_recipient_name")
    public void setParentRecipientName(String parentRecipientName) {
        this.parentRecipientName = parentRecipientName;
    }

    @JsonProperty("parent_recipient_uei")
    public String getParentRecipientUei() {
        return parentRecipientUei;
    }

    @JsonProperty("parent_recipient_uei")
    public void setParentRecipientUei(String parentRecipientUei) {
        this.parentRecipientUei = parentRecipientUei;
    }

    @JsonProperty("parent_recipient_unique_id")
    public String getParentRecipientUniqueId() {
        return parentRecipientUniqueId;
    }

    @JsonProperty("parent_recipient_unique_id")
    public void setParentRecipientUniqueId(String parentRecipientUniqueId) {
        this.parentRecipientUniqueId = parentRecipientUniqueId;
    }

    @JsonProperty("business_categories")
    public List<String> getBusinessCategories() {
        return businessCategories;
    }

    @JsonProperty("business_categories")
    public void setBusinessCategories(List<String> businessCategories) {
        this.businessCategories = businessCategories;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
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
