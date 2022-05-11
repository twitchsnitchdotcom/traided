
package com.traidable.app.dto.spendingbyaward;

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
    "page",
    "hasNext",
    "last_record_unique_id",
    "last_record_sort_value"
})
@Generated("jsonschema2pojo")
public class PageMetadata {

    @JsonProperty("page")
    private Long page;
    @JsonProperty("hasNext")
    private Boolean hasNext;
    @JsonProperty("last_record_unique_id")
    private Long lastRecordUniqueId;
    @JsonProperty("last_record_sort_value")
    private String lastRecordSortValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("page")
    public Long getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Long page) {
        this.page = page;
    }

    @JsonProperty("hasNext")
    public Boolean getHasNext() {
        return hasNext;
    }

    @JsonProperty("hasNext")
    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    @JsonProperty("last_record_unique_id")
    public Long getLastRecordUniqueId() {
        return lastRecordUniqueId;
    }

    @JsonProperty("last_record_unique_id")
    public void setLastRecordUniqueId(Long lastRecordUniqueId) {
        this.lastRecordUniqueId = lastRecordUniqueId;
    }

    @JsonProperty("last_record_sort_value")
    public String getLastRecordSortValue() {
        return lastRecordSortValue;
    }

    @JsonProperty("last_record_sort_value")
    public void setLastRecordSortValue(String lastRecordSortValue) {
        this.lastRecordSortValue = lastRecordSortValue;
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
