
package org.vaadin.spring.tutorial.dto.entity;

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
    "parent_id",
    "parent_duns",
    "parent_uei",
    "parent_name"
})
@Generated("jsonschema2pojo")
public class Parent {

    @JsonProperty("parent_id")
    private String parentId;
    @JsonProperty("parent_duns")
    private String parentDuns;
    @JsonProperty("parent_uei")
    private String parentUei;
    @JsonProperty("parent_name")
    private String parentName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("parent_id")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    @JsonProperty("parent_name")
    public String getParentName() {
        return parentName;
    }

    @JsonProperty("parent_name")
    public void setParentName(String parentName) {
        this.parentName = parentName;
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
