
package com.traidable.app.dto.spendingbyawardcount;

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
    "contracts",
    "direct_payments",
    "grants",
    "idvs",
    "loans",
    "other"
})
@Generated("jsonschema2pojo")
public class Results {

    @JsonProperty("contracts")
    private Long contracts;
    @JsonProperty("direct_payments")
    private Long directPayments;
    @JsonProperty("grants")
    private Long grants;
    @JsonProperty("idvs")
    private Long idvs;
    @JsonProperty("loans")
    private Long loans;
    @JsonProperty("other")
    private Long other;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contracts")
    public Long getContracts() {
        return contracts;
    }

    @JsonProperty("contracts")
    public void setContracts(Long contracts) {
        this.contracts = contracts;
    }

    @JsonProperty("direct_payments")
    public Long getDirectPayments() {
        return directPayments;
    }

    @JsonProperty("direct_payments")
    public void setDirectPayments(Long directPayments) {
        this.directPayments = directPayments;
    }

    @JsonProperty("grants")
    public Long getGrants() {
        return grants;
    }

    @JsonProperty("grants")
    public void setGrants(Long grants) {
        this.grants = grants;
    }

    @JsonProperty("idvs")
    public Long getIdvs() {
        return idvs;
    }

    @JsonProperty("idvs")
    public void setIdvs(Long idvs) {
        this.idvs = idvs;
    }

    @JsonProperty("loans")
    public Long getLoans() {
        return loans;
    }

    @JsonProperty("loans")
    public void setLoans(Long loans) {
        this.loans = loans;
    }

    @JsonProperty("other")
    public Long getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(Long other) {
        this.other = other;
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
