
package com.traidable.app.dto.spendingbyawardcount.request;

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
    "time_period",
    "recipient_search_text"
})
@Generated("jsonschema2pojo")
public class Filters {

    @JsonProperty("time_period")
    private List<TimePeriod> timePeriod = null;
    @JsonProperty("recipient_search_text")
    private List<String> recipientSearchText = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time_period")
    public List<TimePeriod> getTimePeriod() {
        return timePeriod;
    }

    @JsonProperty("time_period")
    public void setTimePeriod(List<TimePeriod> timePeriod) {
        this.timePeriod = timePeriod;
    }

    @JsonProperty("recipient_search_text")
    public List<String> getRecipientSearchText() {
        return recipientSearchText;
    }

    @JsonProperty("recipient_search_text")
    public void setRecipientSearchText(List<String> recipientSearchText) {
        this.recipientSearchText = recipientSearchText;
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
