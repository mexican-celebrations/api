package com.mexicancelebrations.api.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class LoginResponse {
    private String token;
    private Date timestamp;
    private String userId;
}
