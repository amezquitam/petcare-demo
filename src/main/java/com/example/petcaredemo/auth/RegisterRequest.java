package com.example.petcaredemo.auth;

public record RegisterRequest(String name, String email, String password, String phoneNumber) {
}
