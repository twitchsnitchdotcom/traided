
package com.traidable.app.dto.recipient;

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
    "total",
    "limit",
    "next",
    "previous",
    "hasNext",
    "hasPrevious"
})
@Generated("jsonschema2pojo")
public class PageMetadata {

    @JsonProperty("page")
    private Long page;
    @JsonProperty("total")
    private Long total;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("next")
    private Long next;
    @JsonProperty("previous")
    private Long previous;
    @JsonProperty("hasNext")
    private Boolean hasNext;
    @JsonProperty("hasPrevious")
    private Boolean hasPrevious;
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

    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @JsonProperty("next")
    public Long getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(Long next) {
        this.next = next;
    }

    @JsonProperty("previous")
    public Long getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(Long previous) {
        this.previous = previous;
    }

    @JsonProperty("hasNext")
    public Boolean getHasNext() {
        return hasNext;
    }

    @JsonProperty("hasNext")
    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    @JsonProperty("hasPrevious")
    public Boolean getHasPrevious() {
        return hasPrevious;
    }

    @JsonProperty("hasPrevious")
    public void setHasPrevious(Boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
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
