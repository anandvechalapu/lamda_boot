package com.sacral.lamda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.lamda.repository.Login;
import com.sacral.lamda.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Optional<Login> findLoginByUsernameAndPassword(String username, String password) {
        return loginRepository.findLoginByUsernameAndPassword(username, password);
    }

    public boolean existsByUsername(String username) {
        return loginRepository.existsByUsername(username);
    }

    public boolean existsByPassword(String password) {
        return loginRepository.existsByPassword(password);
    }

    public void deleteByUsername(String username) {
        loginRepository.deleteByUsername(username);
    }
}