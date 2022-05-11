
package com.traidable.app.dto.awardsovertime;

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
    "new_award_count_in_period",
    "time_period"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("new_award_count_in_period")
    private Long newAwardCountInPeriod;
    @JsonProperty("time_period")
    private TimePeriod timePeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("new_award_count_in_period")
    public Long getNewAwardCountInPeriod() {
        return newAwardCountInPeriod;
    }

    @JsonProperty("new_award_count_in_period")
    public void setNewAwardCountInPeriod(Long newAwardCountInPeriod) {
        this.newAwardCountInPeriod = newAwardCountInPeriod;
    }

    @JsonProperty("time_period")
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    @JsonProperty("time_period")
    public void setTimePeriod(TimePeriod timePeriod) {
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
