package org.vaadin.spring.tutorial.dto.recipient;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 {"order":"desc","sort":"amount","page":75,"limit":5,"award_type":"all"}
 */
public class RecipientSearchRequest {
    
    private String order = "desc";
    private String sort = "amount";
    private Integer page;
    private Integer limit = 100;
    @JsonProperty("award_type")
    private String awardType = "all";


    public RecipientSearchRequest(Integer page) {
        this.page = page;
    }

    public RecipientSearchRequest() {
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }
}
