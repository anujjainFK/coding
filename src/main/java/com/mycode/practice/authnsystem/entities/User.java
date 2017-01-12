package com.mycode.practice.authnsystem.entities;

import java.util.List;

import lombok.Data;

@Data
public class User {
    private String name;
    private String userId;
    private List<Role> roles;
}
