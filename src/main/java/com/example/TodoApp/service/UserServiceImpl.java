package com.example.TodoApp.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TodoApp.entity.User;


@Service
public class UserServiceImpl implements UserService{
    List<User> userlist = Arrays.asList(
       new User());

    @Override
    public List<User> getUsers() {
       return userlist;
    }

    @Override
    public User getUserById(Long userId) {
   return userlist.stream().filter(e -> e.userId == userId).findFirst().get();
    }

    @Override
    public void addUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addUser'");
    }

    @Override
    public void updateUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void removeUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeUser'");
    }


    
   
              

}
