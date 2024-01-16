package com.example.TodoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoApp.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole , Long> {
    
}
