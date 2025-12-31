package com.blogsystem;

public class AuthService {

    public boolean authenticateUser(String email, String password) {
        return email != null && password != null;
    }

    public boolean validateCredentials(String email, String password) {
        return email.contains("@") && password.length() >= 6;
    }

    public String generateToken() {
        return "JWT_TOKEN_SAMPLE";
    }
}
