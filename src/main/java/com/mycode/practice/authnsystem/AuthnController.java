package com.mycode.practice.authnsystem;

import com.mycode.practice.authnsystem.entities.ActionType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthnController {

    private AuthService authService;

    @Autowired
    public AuthnController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String healthCheck() {
        return "Authn Service is running";
    }

    @RequestMapping(value = "/check_access", method = RequestMethod.GET)
    public boolean checkAccess(@RequestParam("user_id") String userId, @RequestParam("action_type") ActionType actionType,
        @RequestParam("resource_id") String resourceId) {
        return authService.checkAccess(userId, actionType, resourceId);
    }
}
