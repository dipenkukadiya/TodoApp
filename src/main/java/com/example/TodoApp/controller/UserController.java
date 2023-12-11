package com.example.TodoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoApp.entity.User;
import com.example.TodoApp.repository.UserRepository;
import com.example.TodoApp.service.UserService;

@RestController
// @RequestMapping("/users/")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Autowired
    UserService userService;

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome  users";
    }

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @RequestMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

}
// @GetMapping("/{userId}")
// public User getUserById(@PathVariable Long userId) {
// return userRepository.findById(userId).get();
// }

// @GetMapping
// public Iterable<User> getUsers() {
// return userRepository.findAll();
// }

// @PostMapping
// public User addUser(@RequestBody AddUserRequest userRequest) {
// User user = new User();
// user.setFirstname(userRequest.getFirstname());
// user.setLastname(userRequest.getLastname());
// user.setEmail(userRequest.getEmail());
// user.setPassword(userRequest.getPassword());
// user.setCreatedDate(userRequest.getCreatedDate());
// user.setUpdatedDate(userRequest.getUpdatedDate());

// return userRepository.save(user);
// }
// }

// @DeleteMapping("/{userId}")
// public void deleteUser(@PathVariable Long userId) {
// User user = userRepository.findById(userId).get();
// userRepository.delete(user);
// }
