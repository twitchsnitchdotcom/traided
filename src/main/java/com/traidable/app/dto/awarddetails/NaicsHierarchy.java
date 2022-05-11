
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
    "toptier_code",
    "midtier_code",
    "base_code"
})
@Generated("jsonschema2pojo")
public class NaicsHierarchy {

    @JsonProperty("toptier_code")
    private ToptierCode toptierCode;
    @JsonProperty("midtier_code")
    private MidtierCode midtierCode;
    @JsonProperty("base_code")
    private BaseCode baseCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("toptier_code")
    public ToptierCode getToptierCode() {
        return toptierCode;
    }

    @JsonProperty("toptier_code")
    public void setToptierCode(ToptierCode toptierCode) {
        this.toptierCode = toptierCode;
    }

    @JsonProperty("midtier_code")
    public MidtierCode getMidtierCode() {
        return midtierCode;
    }

    @JsonProperty("midtier_code")
    public void setMidtierCode(MidtierCode midtierCode) {
        this.midtierCode = midtierCode;
    }

    @JsonProperty("base_code")
    public BaseCode getBaseCode() {
        return baseCode;
    }

    @JsonProperty("base_code")
    public void setBaseCode(BaseCode baseCode) {
        this.baseCode = baseCode;
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
