package com.mycode.practice.authnsystem.dao;

import com.mycode.practice.authnsystem.ResourceRoleActionMapping;

public interface ResourceRoleActionMappingDao {
    void addMapping(ResourceRoleActionMapping resourceRoleActionMapping);
    boolean checkMappingPresent(ResourceRoleActionMapping resourceRoleActionMapping);
}
