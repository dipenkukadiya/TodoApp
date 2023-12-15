package com.example.TodoApp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApp.entity.User;
import com.example.TodoApp.repository.UserRepository;
import com.example.TodoApp.service.UserService;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
    return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
    return userRepository.findById(userId).get();
    }

    @Override
    public void addUser(User user) {
       userRepository.save(user);
    }

    @Override
    public void updateUser(User user, Long userId) {    
        userRepository.save(user);
    }

    @Override
    public void removeUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
