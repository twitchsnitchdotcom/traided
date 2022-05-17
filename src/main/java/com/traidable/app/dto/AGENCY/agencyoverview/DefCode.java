
package com.traidable.app.dto.AGENCY.agencyoverview;

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
    "code",
    "public_law",
    "title",
    "urls",
    "disaster"
})
@Generated("jsonschema2pojo")
public class DefCode {

    @JsonProperty("code")
    private String code;
    @JsonProperty("public_law")
    private String publicLaw;
    @JsonProperty("title")
    private String title;
    @JsonProperty("urls")
    private String urls;
    @JsonProperty("disaster")
    private Object disaster;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("public_law")
    public String getPublicLaw() {
        return publicLaw;
    }

    @JsonProperty("public_law")
    public void setPublicLaw(String publicLaw) {
        this.publicLaw = publicLaw;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("urls")
    public String getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(String urls) {
        this.urls = urls;
    }

    @JsonProperty("disaster")
    public Object getDisaster() {
        return disaster;
    }

    @JsonProperty("disaster")
    public void setDisaster(Object disaster) {
        this.disaster = disaster;
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
