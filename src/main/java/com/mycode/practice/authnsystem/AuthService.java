package com.mycode.practice.authnsystem;

import com.mycode.practice.authnsystem.dao.ResourceRoleActionMappingDao;
import com.mycode.practice.authnsystem.dao.UserDao;
import com.mycode.practice.authnsystem.entities.ActionType;
import com.mycode.practice.authnsystem.entities.Role;
import com.mycode.practice.authnsystem.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private UserDao userDao;
    private ResourceRoleActionMappingDao resourceRoleActionMappingDao;

    @Autowired
    public AuthService(ResourceRoleActionMappingDao resourceRoleActionMappingDao, UserDao userDao) {
        this.userDao = userDao;
        this.resourceRoleActionMappingDao = resourceRoleActionMappingDao;
    }

    public boolean checkAccess(String userId, ActionType actionType, String resourceId) {
        User user = userDao.getUser(userId);
        if (user == null || user.getRoles() == null)
            return false;
        for (Role role : user.getRoles()) {
            if (resourceRoleActionMappingDao.checkMappingPresent(new ResourceRoleActionMapping(role.getRoleId(), actionType, resourceId))) {
                return true;
            }
        }
        return false;
    }
}
