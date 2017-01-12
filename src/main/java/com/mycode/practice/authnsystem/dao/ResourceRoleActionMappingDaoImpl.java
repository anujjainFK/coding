package com.mycode.practice.authnsystem.dao;

import com.mycode.practice.authnsystem.ResourceRoleActionMapping;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class ResourceRoleActionMappingDaoImpl implements ResourceRoleActionMappingDao {
    private List<ResourceRoleActionMapping> resourceRoleActionMappings;

    public ResourceRoleActionMappingDaoImpl() {
        this.resourceRoleActionMappings = new LinkedList<ResourceRoleActionMapping>();
    }

    public void addMapping(ResourceRoleActionMapping resourceRoleActionMapping) {
        this.resourceRoleActionMappings.add(resourceRoleActionMapping);
    }

    public boolean checkMappingPresent(ResourceRoleActionMapping resourceRoleActionMapping) {
        return resourceRoleActionMappings.contains(resourceRoleActionMapping);
    }
}
