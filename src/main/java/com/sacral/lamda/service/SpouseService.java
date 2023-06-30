package com.sacral.lamda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.lamda.model.Spouse;
import com.sacral.lamda.repository.SpouseRepository;

@Service
public class SpouseService {

    @Autowired
    private SpouseRepository spouseRepository;

    public List<Spouse> findByCustId(long custId) {
        return spouseRepository.findByCustId(custId);
    }

    public List<Spouse> findByCustIdAndDobAndCrif(long custId, String dob, String crif) {
        return spouseRepository.findByCustIdAndDobAndCrif(custId, dob, crif);
    }

    public List<Spouse> findByCustIdAndNullCreditScore(long custId) {
        return spouseRepository.findByCustIdAndNullCreditScore(custId);
    }

    public List<Spouse> findByCustIdAndAgeRange(long custId, int minAge, int maxAge) {
        return spouseRepository.findByCustIdAndAgeRange(custId, minAge, maxAge);
    }

}