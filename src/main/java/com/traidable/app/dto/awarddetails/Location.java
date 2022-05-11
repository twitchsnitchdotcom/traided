
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
    "location_country_code",
    "country_name",
    "state_code",
    "state_name",
    "city_name",
    "county_code",
    "county_name",
    "address_line1",
    "address_line2",
    "address_line3",
    "congressional_code",
    "zip4",
    "zip5",
    "foreign_postal_code",
    "foreign_province"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("location_country_code")
    private String locationCountryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("county_code")
    private String countyCode;
    @JsonProperty("county_name")
    private String countyName;
    @JsonProperty("address_line1")
    private String addressLine1;
    @JsonProperty("address_line2")
    private Object addressLine2;
    @JsonProperty("address_line3")
    private Object addressLine3;
    @JsonProperty("congressional_code")
    private String congressionalCode;
    @JsonProperty("zip4")
    private String zip4;
    @JsonProperty("zip5")
    private String zip5;
    @JsonProperty("foreign_postal_code")
    private Object foreignPostalCode;
    @JsonProperty("foreign_province")
    private Object foreignProvince;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("location_country_code")
    public String getLocationCountryCode() {
        return locationCountryCode;
    }

    @JsonProperty("location_country_code")
    public void setLocationCountryCode(String locationCountryCode) {
        this.locationCountryCode = locationCountryCode;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("state_name")
    public String getStateName() {
        return stateName;
    }

    @JsonProperty("state_name")
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("county_code")
    public String getCountyCode() {
        return countyCode;
    }

    @JsonProperty("county_code")
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    @JsonProperty("county_name")
    public String getCountyName() {
        return countyName;
    }

    @JsonProperty("county_name")
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @JsonProperty("address_line1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("address_line1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("address_line2")
    public Object getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("address_line2")
    public void setAddressLine2(Object addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("address_line3")
    public Object getAddressLine3() {
        return addressLine3;
    }

    @JsonProperty("address_line3")
    public void setAddressLine3(Object addressLine3) {
        this.addressLine3 = addressLine3;
    }

    @JsonProperty("congressional_code")
    public String getCongressionalCode() {
        return congressionalCode;
    }

    @JsonProperty("congressional_code")
    public void setCongressionalCode(String congressionalCode) {
        this.congressionalCode = congressionalCode;
    }

    @JsonProperty("zip4")
    public String getZip4() {
        return zip4;
    }

    @JsonProperty("zip4")
    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    @JsonProperty("zip5")
    public String getZip5() {
        return zip5;
    }

    @JsonProperty("zip5")
    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    @JsonProperty("foreign_postal_code")
    public Object getForeignPostalCode() {
        return foreignPostalCode;
    }

    @JsonProperty("foreign_postal_code")
    public void setForeignPostalCode(Object foreignPostalCode) {
        this.foreignPostalCode = foreignPostalCode;
    }

    @JsonProperty("foreign_province")
    public Object getForeignProvince() {
        return foreignProvince;
    }

    @JsonProperty("foreign_province")
    public void setForeignProvince(Object foreignProvince) {
        this.foreignProvince = foreignProvince;
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
