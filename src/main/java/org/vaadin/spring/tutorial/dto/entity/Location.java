
package org.vaadin.spring.tutorial.dto.entity;

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
    "address_line1",
    "address_line2",
    "address_line3",
    "foreign_province",
    "city_name",
    "county_name",
    "state_code",
    "zip",
    "zip4",
    "foreign_postal_code",
    "country_name",
    "country_code",
    "congressional_code"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("address_line1")
    private String addressLine1;
    @JsonProperty("address_line2")
    private Object addressLine2;
    @JsonProperty("address_line3")
    private Object addressLine3;
    @JsonProperty("foreign_province")
    private Object foreignProvince;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("county_name")
    private Object countyName;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("zip4")
    private String zip4;
    @JsonProperty("foreign_postal_code")
    private Object foreignPostalCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("congressional_code")
    private String congressionalCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("foreign_province")
    public Object getForeignProvince() {
        return foreignProvince;
    }

    @JsonProperty("foreign_province")
    public void setForeignProvince(Object foreignProvince) {
        this.foreignProvince = foreignProvince;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("county_name")
    public Object getCountyName() {
        return countyName;
    }

    @JsonProperty("county_name")
    public void setCountyName(Object countyName) {
        this.countyName = countyName;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    @JsonProperty("zip4")
    public String getZip4() {
        return zip4;
    }

    @JsonProperty("zip4")
    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    @JsonProperty("foreign_postal_code")
    public Object getForeignPostalCode() {
        return foreignPostalCode;
    }

    @JsonProperty("foreign_postal_code")
    public void setForeignPostalCode(Object foreignPostalCode) {
        this.foreignPostalCode = foreignPostalCode;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("congressional_code")
    public String getCongressionalCode() {
        return congressionalCode;
    }

    @JsonProperty("congressional_code")
    public void setCongressionalCode(String congressionalCode) {
        this.congressionalCode = congressionalCode;
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
