package com.sacral.lamda.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Validation {

    private boolean checkSumAssured;
    private boolean checkAgeLimit;
    private boolean checkAnnualIncome;
    private List<Double> allowedSumAssured;
    private List<Integer> allowedPolicyTenure;
    private boolean checkOTPAuthentication;
    private boolean checkSpouseEligibility;

    public Validation() {}

    public Validation(boolean checkSumAssured, boolean checkAgeLimit, boolean checkAnnualIncome, List<Double> allowedSumAssured, List<Integer> allowedPolicyTenure, boolean checkOTPAuthentication, boolean checkSpouseEligibility) {
        this.checkSumAssured = checkSumAssured;
        this.checkAgeLimit = checkAgeLimit;
        this.checkAnnualIncome = checkAnnualIncome;
        this.allowedSumAssured = allowedSumAssured;
        this.allowedPolicyTenure = allowedPolicyTenure;
        this.checkOTPAuthentication = checkOTPAuthentication;
        this.checkSpouseEligibility = checkSpouseEligibility;
    }

    public boolean isCheckSumAssured() {
        return checkSumAssured;
    }

    public void setCheckSumAssured(boolean checkSumAssured) {
        this.checkSumAssured = checkSumAssured;
    }

    public boolean isCheckAgeLimit() {
        return checkAgeLimit;
    }

    public void setCheckAgeLimit(boolean checkAgeLimit) {
        this.checkAgeLimit = checkAgeLimit;
    }

    public boolean isCheckAnnualIncome() {
        return checkAnnualIncome;
    }

    public void setCheckAnnualIncome(boolean checkAnnualIncome) {
        this.checkAnnualIncome = checkAnnualIncome;
    }

    public List<Double> getAllowedSumAssured() {
        return allowedSumAssured;
    }

    public void setAllowedSumAssured(List<Double> allowedSumAssured) {
        this.allowedSumAssured = allowedSumAssured;
    }

    public List<Integer> getAllowedPolicyTenure() {
        return allowedPolicyTenure;
    }

    public void setAllowedPolicyTenure(List<Integer> allowedPolicyTenure) {
        this.allowedPolicyTenure = allowedPolicyTenure;
    }

    public boolean isCheckOTPAuthentication() {
        return checkOTPAuthentication;
    }

    public void setCheckOTPAuthentication(boolean checkOTPAuthentication) {
        this.checkOTPAuthentication = checkOTPAuthentication;
    }

    public boolean isCheckSpouseEligibility() {
        return checkSpouseEligibility;
    }

    public void setCheckSpouseEligibility(boolean checkSpouseEligibility) {
        this.checkSpouseEligibility = checkSpouseEligibility;
    }
}