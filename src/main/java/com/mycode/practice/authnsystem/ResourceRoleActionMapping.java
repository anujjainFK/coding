package com.mycode.practice.authnsystem;

import com.mycode.practice.authnsystem.entities.ActionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceRoleActionMapping {
    private String roleId;
    private ActionType actionType;
    private String resourceId;
}
