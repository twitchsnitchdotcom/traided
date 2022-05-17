
package com.traidable.app.dto.AGENCY.subagencycount;

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
    "toptier_code",
    "fiscal_year",
    "sub_agency_count",
    "office_count",
    "messages"
})
@Generated("jsonschema2pojo")
public class SubAgencyCountResponseDTO {

    @JsonProperty("toptier_code")
    private String toptierCode;
    @JsonProperty("fiscal_year")
    private Long fiscalYear;
    @JsonProperty("sub_agency_count")
    private Long subAgencyCount;
    @JsonProperty("office_count")
    private Long officeCount;
    @JsonProperty("messages")
    private List<Object> messages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("toptier_code")
    public String getToptierCode() {
        return toptierCode;
    }

    @JsonProperty("toptier_code")
    public void setToptierCode(String toptierCode) {
        this.toptierCode = toptierCode;
    }

    @JsonProperty("fiscal_year")
    public Long getFiscalYear() {
        return fiscalYear;
    }

    @JsonProperty("fiscal_year")
    public void setFiscalYear(Long fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @JsonProperty("sub_agency_count")
    public Long getSubAgencyCount() {
        return subAgencyCount;
    }

    @JsonProperty("sub_agency_count")
    public void setSubAgencyCount(Long subAgencyCount) {
        this.subAgencyCount = subAgencyCount;
    }

    @JsonProperty("office_count")
    public Long getOfficeCount() {
        return officeCount;
    }

    @JsonProperty("office_count")
    public void setOfficeCount(Long officeCount) {
        this.officeCount = officeCount;
    }

    @JsonProperty("messages")
    public List<Object> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Object> messages) {
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
