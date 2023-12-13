package com.example.TodoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoApp.entity.UserRole;
import com.example.TodoApp.service.UserRoleService;

@RestController
@RequestMapping("/usersRole/")
public class UserRoleController {

    @Autowired
    UserRoleService userRoleService;

    @GetMapping
    public List<UserRole> getUserRoles() {
        return userRoleService.getUserRole();
    }

    @GetMapping("/{userRoleId}")
    public UserRole getUserRoleById(@PathVariable Long userRoleId) {
        return userRoleService.getUserRoleById(userRoleId);
    }

    @PostMapping
    public void addUserRole(@RequestBody UserRole userRole) {
        userRoleService.addUserRole(userRole);

    }

    @DeleteMapping("/{userRoleId}")
    public void removeUserRole(@PathVariable Long userRoleId) {
        userRoleService.removeUserRole(userRoleId);
    }

    @PutMapping("/{userRoleId}")
    public void updateUserRole(@RequestBody UserRole userRole, @PathVariable Long userRoleId) {
        userRoleService.updateUserRole(userRole, userRoleId);
    }
}

