package com.example.TodoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoApp.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {
    
}
