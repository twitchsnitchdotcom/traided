
package com.traidable.app.dto.spendingbyaward;

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
    "limit",
    "results",
    "page_metadata",
    "messages"
})
@Generated("jsonschema2pojo")
public class SpendingByAwardResponseDTO {

    private Map map;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonProperty("page_metadata")
    private PageMetadata pageMetadata;
    @JsonProperty("messages")
    private List<List<String>> messages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("page_metadata")
    public PageMetadata getPageMetadata() {
        return pageMetadata;
    }

    @JsonProperty("page_metadata")
    public void setPageMetadata(PageMetadata pageMetadata) {
        this.pageMetadata = pageMetadata;
    }

    @JsonProperty("messages")
    public List<List<String>> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<List<String>> messages) {
        this.messages = messages;
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
