
package com.traidable.app.dto.REFERENCE.submissionperiod;

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
    "period_start_date",
    "period_end_date",
    "submission_start_date",
    "submission_due_date",
    "certification_due_date",
    "submission_reveal_date",
    "submission_fiscal_year",
    "submission_fiscal_quarter",
    "submission_fiscal_month",
    "is_quarter"
})
@Generated("jsonschema2pojo")
public class AvailablePeriod {

    @JsonProperty("period_start_date")
    private String periodStartDate;
    @JsonProperty("period_end_date")
    private String periodEndDate;
    @JsonProperty("submission_start_date")
    private String submissionStartDate;
    @JsonProperty("submission_due_date")
    private String submissionDueDate;
    @JsonProperty("certification_due_date")
    private String certificationDueDate;
    @JsonProperty("submission_reveal_date")
    private String submissionRevealDate;
    @JsonProperty("submission_fiscal_year")
    private Long submissionFiscalYear;
    @JsonProperty("submission_fiscal_quarter")
    private Long submissionFiscalQuarter;
    @JsonProperty("submission_fiscal_month")
    private Long submissionFiscalMonth;
    @JsonProperty("is_quarter")
    private Boolean isQuarter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("period_start_date")
    public String getPeriodStartDate() {
        return periodStartDate;
    }

    @JsonProperty("period_start_date")
    public void setPeriodStartDate(String periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    @JsonProperty("period_end_date")
    public String getPeriodEndDate() {
        return periodEndDate;
    }

    @JsonProperty("period_end_date")
    public void setPeriodEndDate(String periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    @JsonProperty("submission_start_date")
    public String getSubmissionStartDate() {
        return submissionStartDate;
    }

    @JsonProperty("submission_start_date")
    public void setSubmissionStartDate(String submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    @JsonProperty("submission_due_date")
    public String getSubmissionDueDate() {
        return submissionDueDate;
    }

    @JsonProperty("submission_due_date")
    public void setSubmissionDueDate(String submissionDueDate) {
        this.submissionDueDate = submissionDueDate;
    }

    @JsonProperty("certification_due_date")
    public String getCertificationDueDate() {
        return certificationDueDate;
    }

    @JsonProperty("certification_due_date")
    public void setCertificationDueDate(String certificationDueDate) {
        this.certificationDueDate = certificationDueDate;
    }

    @JsonProperty("submission_reveal_date")
    public String getSubmissionRevealDate() {
        return submissionRevealDate;
    }

    @JsonProperty("submission_reveal_date")
    public void setSubmissionRevealDate(String submissionRevealDate) {
        this.submissionRevealDate = submissionRevealDate;
    }

    @JsonProperty("submission_fiscal_year")
    public Long getSubmissionFiscalYear() {
        return submissionFiscalYear;
    }

    @JsonProperty("submission_fiscal_year")
    public void setSubmissionFiscalYear(Long submissionFiscalYear) {
        this.submissionFiscalYear = submissionFiscalYear;
    }

    @JsonProperty("submission_fiscal_quarter")
    public Long getSubmissionFiscalQuarter() {
        return submissionFiscalQuarter;
    }

    @JsonProperty("submission_fiscal_quarter")
    public void setSubmissionFiscalQuarter(Long submissionFiscalQuarter) {
        this.submissionFiscalQuarter = submissionFiscalQuarter;
    }

    @JsonProperty("submission_fiscal_month")
    public Long getSubmissionFiscalMonth() {
        return submissionFiscalMonth;
    }

    @JsonProperty("submission_fiscal_month")
    public void setSubmissionFiscalMonth(Long submissionFiscalMonth) {
        this.submissionFiscalMonth = submissionFiscalMonth;
    }

    @JsonProperty("is_quarter")
    public Boolean getIsQuarter() {
        return isQuarter;
    }

    @JsonProperty("is_quarter")
    public void setIsQuarter(Boolean isQuarter) {
        this.isQuarter = isQuarter;
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
