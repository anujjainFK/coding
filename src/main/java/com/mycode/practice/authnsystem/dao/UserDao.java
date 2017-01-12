package com.mycode.practice.authnsystem.dao;

import com.mycode.practice.authnsystem.entities.Role;
import com.mycode.practice.authnsystem.entities.User;

public interface UserDao {
    void addUser(User user);
    User getUser(String userId);
    void addRoleToUser(Role role, User user);
    void removeRoleToUser(Role role, User user);
}
