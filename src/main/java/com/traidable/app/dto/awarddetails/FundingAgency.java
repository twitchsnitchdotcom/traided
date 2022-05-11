
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
    "id",
    "has_agency_page",
    "toptier_agency",
    "subtier_agency",
    "office_agency_name"
})
@Generated("jsonschema2pojo")
public class FundingAgency {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("has_agency_page")
    private Boolean hasAgencyPage;
    @JsonProperty("toptier_agency")
    private ToptierAgency toptierAgency;
    @JsonProperty("subtier_agency")
    private SubtierAgency subtierAgency;
    @JsonProperty("office_agency_name")
    private String officeAgencyName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("has_agency_page")
    public Boolean getHasAgencyPage() {
        return hasAgencyPage;
    }

    @JsonProperty("has_agency_page")
    public void setHasAgencyPage(Boolean hasAgencyPage) {
        this.hasAgencyPage = hasAgencyPage;
    }

    @JsonProperty("toptier_agency")
    public ToptierAgency getToptierAgency() {
        return toptierAgency;
    }

    @JsonProperty("toptier_agency")
    public void setToptierAgency(ToptierAgency toptierAgency) {
        this.toptierAgency = toptierAgency;
    }

    @JsonProperty("subtier_agency")
    public SubtierAgency getSubtierAgency() {
        return subtierAgency;
    }

    @JsonProperty("subtier_agency")
    public void setSubtierAgency(SubtierAgency subtierAgency) {
        this.subtierAgency = subtierAgency;
    }

    @JsonProperty("office_agency_name")
    public String getOfficeAgencyName() {
        return officeAgencyName;
    }

    @JsonProperty("office_agency_name")
    public void setOfficeAgencyName(String officeAgencyName) {
        this.officeAgencyName = officeAgencyName;
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
