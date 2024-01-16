package com.example.TodoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoApp.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo ,Long>{
    
}
