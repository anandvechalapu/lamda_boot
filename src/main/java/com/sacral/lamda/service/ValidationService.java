package com.sacral.lamda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.sacral.lamda.repository.ValidationRepository;

@Service
public class ValidationService {
	
	private ValidationRepository validationRepository;
	
	public ValidationService(ValidationRepository validationRepository) {
		this.validationRepository = validationRepository;
	}
	
	// Method to check minimum and maximum sum assured
    public boolean checkSumAssured(double amount) {
		return validationRepository.checkSumAssured(amount);
	}
	
	// Method to check minimum and maximum age limits 
    public boolean checkAgeLimit(int age) {
		return validationRepository.checkAgeLimit(age);
	}
	
	// Method to check annual income of the member
    public boolean checkAnnualIncome(int income) {
		return validationRepository.checkAnnualIncome(income);
	}
	
	// Method to display sum assured ranges
    public List<Double> getAllowedSumAssured() {
		return validationRepository.getAllowedSumAssured();
	}
	
	// Method to display policy tenure ranges
    public List<Integer> getAllowedPolicyTenure() {
		return validationRepository.getAllowedPolicyTenure();
	}
	
	// Method to check OTP authentication
    public boolean checkOTPAuthentication() {
		return validationRepository.checkOTPAuthentication();
	}
	
	// Method to check eligibility of the spouse
    public boolean checkSpouseEligibility() {
		return validationRepository.checkSpouseEligibility();
	}

}