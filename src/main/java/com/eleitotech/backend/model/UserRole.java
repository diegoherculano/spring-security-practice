package com.eleitotech.backend.model;

public enum UserRole {
    ADMIN("admin"),
    CANDIDATE("candidate");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
