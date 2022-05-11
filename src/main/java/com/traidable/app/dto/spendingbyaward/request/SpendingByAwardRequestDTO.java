
package com.traidable.app.dto.spendingbyaward.request;

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
    "filters",
    "fields",
    "page",
    "limit",
    "sort",
    "order",
    "subawards"
})
@Generated("jsonschema2pojo")
public class SpendingByAwardRequestDTO {

    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("fields")
    private List<String> fields = null;
    @JsonProperty("page")
    private Long page;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("sort")
    private String sort;
    @JsonProperty("order")
    private String order;
    @JsonProperty("subawards")
    private Boolean subawards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    @JsonProperty("fields")
    public List<String> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    @JsonProperty("page")
    public Long getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Long page) {
        this.page = page;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @JsonProperty("sort")
    public String getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(String sort) {
        this.sort = sort;
    }

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("subawards")
    public Boolean getSubawards() {
        return subawards;
    }

    @JsonProperty("subawards")
    public void setSubawards(Boolean subawards) {
        this.subawards = subawards;
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
