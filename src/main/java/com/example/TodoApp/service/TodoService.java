package com.example.TodoApp.service;

import java.util.List;

import com.example.TodoApp.entity.Todo;

public interface TodoService {

    List<Todo> getTodos();
    Todo getTodoById(Long todoId);
    void addTodo(Todo todo);
    void updateTodo(Todo todo,Long todoId);
    void removeTodo(Long todoId);
    
    
}
