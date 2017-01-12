package com.mycode.practice.authnsystem.dao;

import com.mycode.practice.authnsystem.entities.Role;
import com.mycode.practice.authnsystem.entities.User;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private List<User> users;

    public UserDaoImpl() {
        this.users = new LinkedList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId))
                return user;
        }
        return null;
    }

    public void addRoleToUser(Role role, User user) {
        user.getRoles().add(role);
    }

    public void removeRoleToUser(Role role, User user) {
        user.getRoles().remove(role);
    }
}
