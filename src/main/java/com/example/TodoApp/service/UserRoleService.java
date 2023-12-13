package com.example.TodoApp.service;

import java.util.List;
import com.example.TodoApp.entity.UserRole;

public interface UserRoleService {


    List<UserRole> getUserRole();
    UserRole getUserRoleById(Long userRoleId);
    void addUserRole(UserRole userRole);
    void updateUserRole(UserRole userRole,Long userRoleId);
    void removeUserRole(Long userRoleId);
    
}
