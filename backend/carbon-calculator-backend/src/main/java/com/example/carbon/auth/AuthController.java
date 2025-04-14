package com.example.carbon.auth;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        // In a real app, authenticate against DB and generate JWT
        if ("user".equals(request.getUsername()) && "pass".equals(request.getPassword())) {
            return "mock-jwt-token";
        }
        throw new RuntimeException("Invalid credentials");
    }

    @PostMapping("/register")
    public String register(@RequestBody LoginRequest request) {
        // In a real app, persist the user
        return "User registered (mock)";
    }
}