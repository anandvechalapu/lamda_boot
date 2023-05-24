package com.sacral.lamda.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lamda.repository.Login;
import com.sacral.lamda.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/{username}/{password}")
    public Optional<Login> findLoginByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
        return loginService.findLoginByUsernameAndPassword(username, password);
    }

    @GetMapping("/username/{username}")
    public boolean existsByUsername(@PathVariable String username) {
        return loginService.existsByUsername(username);
    }

    @GetMapping("/password/{password}")
    public boolean existsByPassword(@PathVariable String password) {
        return loginService.existsByPassword(password);
    }

    @PostMapping("/delete/{username}")
    public void deleteByUsername(@PathVariable String username) {
        loginService.deleteByUsername(username);
    }
}