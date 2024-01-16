package com.example.TodoApp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApp.entity.UserRole;
import com.example.TodoApp.repository.UserRoleRepository;
import com.example.TodoApp.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService{
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> getUserRole() {
        return userRoleRepository.findAll();
       
    }

    @Override
    public UserRole getUserRoleById(Long userRoleId) {
        return userRoleRepository.findById(userRoleId).get();
    }

    @Override
    public void addUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
       
    }

    @Override
    public void updateUserRole(UserRole userRole, Long userRoleId) {
       userRoleRepository.save(userRole);
    }

    @Override
    public void removeUserRole(Long userRoleId) {
        userRoleRepository.deleteById(userRoleId);
    }
    
}
