
package com.traidable.app.dto.AGENCY.agencyoverview;

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
    "fiscal_year",
    "toptier_code",
    "name",
    "abbreviation",
    "agency_id",
    "icon_filename",
    "mission",
    "website",
    "congressional_justification_url",
    "about_agency_data",
    "subtier_agency_count",
    "def_codes",
    "messages"
})
@Generated("jsonschema2pojo")
public class AgencyOverviewResponseDTO {

    @JsonProperty("fiscal_year")
    private Long fiscalYear;
    @JsonProperty("toptier_code")
    private String toptierCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("agency_id")
    private Long agencyId;
    @JsonProperty("icon_filename")
    private String iconFilename;
    @JsonProperty("mission")
    private String mission;
    @JsonProperty("website")
    private String website;
    @JsonProperty("congressional_justification_url")
    private String congressionalJustificationUrl;
    @JsonProperty("about_agency_data")
    private Object aboutAgencyData;
    @JsonProperty("subtier_agency_count")
    private Long subtierAgencyCount;
    @JsonProperty("def_codes")
    private List<DefCode> defCodes = null;
    @JsonProperty("messages")
    private List<Object> messages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fiscal_year")
    public Long getFiscalYear() {
        return fiscalYear;
    }

    @JsonProperty("fiscal_year")
    public void setFiscalYear(Long fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @JsonProperty("toptier_code")
    public String getToptierCode() {
        return toptierCode;
    }

    @JsonProperty("toptier_code")
    public void setToptierCode(String toptierCode) {
        this.toptierCode = toptierCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("agency_id")
    public Long getAgencyId() {
        return agencyId;
    }

    @JsonProperty("agency_id")
    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    @JsonProperty("icon_filename")
    public String getIconFilename() {
        return iconFilename;
    }

    @JsonProperty("icon_filename")
    public void setIconFilename(String iconFilename) {
        this.iconFilename = iconFilename;
    }

    @JsonProperty("mission")
    public String getMission() {
        return mission;
    }

    @JsonProperty("mission")
    public void setMission(String mission) {
        this.mission = mission;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("congressional_justification_url")
    public String getCongressionalJustificationUrl() {
        return congressionalJustificationUrl;
    }

    @JsonProperty("congressional_justification_url")
    public void setCongressionalJustificationUrl(String congressionalJustificationUrl) {
        this.congressionalJustificationUrl = congressionalJustificationUrl;
    }

    @JsonProperty("about_agency_data")
    public Object getAboutAgencyData() {
        return aboutAgencyData;
    }

    @JsonProperty("about_agency_data")
    public void setAboutAgencyData(Object aboutAgencyData) {
        this.aboutAgencyData = aboutAgencyData;
    }

    @JsonProperty("subtier_agency_count")
    public Long getSubtierAgencyCount() {
        return subtierAgencyCount;
    }

    @JsonProperty("subtier_agency_count")
    public void setSubtierAgencyCount(Long subtierAgencyCount) {
        this.subtierAgencyCount = subtierAgencyCount;
    }

    @JsonProperty("def_codes")
    public List<DefCode> getDefCodes() {
        return defCodes;
    }

    @JsonProperty("def_codes")
    public void setDefCodes(List<DefCode> defCodes) {
        this.defCodes = defCodes;
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
