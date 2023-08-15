package com.eleitotech.backend.dto;

import com.eleitotech.backend.model.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
