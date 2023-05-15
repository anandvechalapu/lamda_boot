package com.sacral.lamda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lamda.service.ValidationService;

@RestController
public class ValidationController {
	
	@Autowired
	ValidationService validationService;
	
	// Method to check minimum and maximum sum assured
    @PostMapping("/checkSumAssured")
	public boolean checkSumAssured(@RequestBody double amount) {
		return validationService.checkSumAssured(amount);
	}
	
	// Method to check minimum and maximum age limits 
    @PostMapping("/checkAgeLimit")
	public boolean checkAgeLimit(@RequestBody int age) {
		return validationService.checkAgeLimit(age);
	}
	
	// Method to check annual income of the member
    @PostMapping("/checkAnnualIncome")
	public boolean checkAnnualIncome(@RequestBody int income) {
		return validationService.checkAnnualIncome(income);
	}
	
	// Method to display sum assured ranges
    @GetMapping("/getAllowedSumAssured")
	public List<Double> getAllowedSumAssured() {
		return validationService.getAllowedSumAssured();
	}
	
	// Method to display policy tenure ranges
    @GetMapping("/getAllowedPolicyTenure")
	public List<Integer> getAllowedPolicyTenure() {
		return validationService.getAllowedPolicyTenure();
	}
	
	// Method to check OTP authentication
    @PostMapping("/checkOTPAuthentication")
	public boolean checkOTPAuthentication() {
		return validationService.checkOTPAuthentication();
	}
	
	// Method to check eligibility of the spouse
    @PostMapping("/checkSpouseEligibility")
	public boolean checkSpouseEligibility() {
		return validationService.checkSpouseEligibility();
	}

}