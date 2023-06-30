package com.sacral.lamda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lamda.model.Spouse;
import com.sacral.lamda.service.SpouseService;

@RestController
@RequestMapping("/spouse")
public class SpouseController {

    @Autowired
    private SpouseService spouseService;

    @GetMapping("/findByCustId")
    public List<Spouse> findByCustId(@RequestParam long custId) {
        return spouseService.findByCustId(custId);
    }

    @GetMapping("/findByCustIdAndDobAndCrif")
    public List<Spouse> findByCustIdAndDobAndCrif(@RequestParam long custId, @RequestParam String dob, @RequestParam String crif) {
        return spouseService.findByCustIdAndDobAndCrif(custId, dob, crif);
    }

    @GetMapping("/findByCustIdAndNullCreditScore")
    public List<Spouse> findByCustIdAndNullCreditScore(@RequestParam long custId) {
        return spouseService.findByCustIdAndNullCreditScore(custId);
    }

    @GetMapping("/findByCustIdAndAgeRange")
    public List<Spouse> findByCustIdAndAgeRange(@RequestParam long custId, @RequestParam int minAge, @RequestParam int maxAge) {
        return spouseService.findByCustIdAndAgeRange(custId, minAge, maxAge);
    }

}