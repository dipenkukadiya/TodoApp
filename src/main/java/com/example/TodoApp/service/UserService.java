package com.example.TodoApp.service;

import java.util.List;

import com.example.TodoApp.entity.User;

public interface UserService {
        List<User> getUsers();
        User getUserById(Long userId);
        void addUser(User user);
        void updateUser(User user,Long userId);
        void removeUser(Long userId);
    
}
