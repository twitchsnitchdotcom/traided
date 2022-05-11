
package com.traidable.app.dto.naics.request;

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
    "recipient_id",
    "time_period"
})
@Generated("jsonschema2pojo")
public class Filters {

    @JsonProperty("recipient_id")
    private String recipientId;
    @JsonProperty("time_period")
    private List<TimePeriod> timePeriod = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recipient_id")
    public String getRecipientId() {
        return recipientId;
    }

    @JsonProperty("recipient_id")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    @JsonProperty("time_period")
    public List<TimePeriod> getTimePeriod() {
        return timePeriod;
    }

    @JsonProperty("time_period")
    public void setTimePeriod(List<TimePeriod> timePeriod) {
        this.timePeriod = timePeriod;
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
