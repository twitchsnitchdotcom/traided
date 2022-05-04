
package org.vaadin.spring.tutorial.dto.recipient;

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
    "duns",
    "uei",
    "name",
    "recipient_level",
    "amount"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("duns")
    private String duns;
    @JsonProperty("uei")
    private String uei;
    @JsonProperty("name")
    private String name;
    @JsonProperty("recipient_level")
    private String recipientLevel;
    @JsonProperty("amount")
    private Double amount;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("recipient_level")
    public String getRecipientLevel() {
        return recipientLevel;
    }

    @JsonProperty("recipient_level")
    public void setRecipientLevel(String recipientLevel) {
        this.recipientLevel = recipientLevel;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
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
