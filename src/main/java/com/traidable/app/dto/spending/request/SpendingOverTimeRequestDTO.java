
package com.traidable.app.dto.spending.request;

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
    "group",
    "filters",
    "auditTrail"
})
@Generated("jsonschema2pojo")
public class SpendingOverTimeRequestDTO {

    @JsonProperty("group")
    private String group;
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("auditTrail")
    private String auditTrail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    @JsonProperty("auditTrail")
    public String getAuditTrail() {
        return auditTrail;
    }

    @JsonProperty("auditTrail")
    public void setAuditTrail(String auditTrail) {
        this.auditTrail = auditTrail;
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
