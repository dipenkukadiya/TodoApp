package com.example.TodoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApp.entity.Todo;

import com.example.TodoApp.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getTodoById(Long todoId) {

        return todoRepository.findById(todoId).get();

    }

    @Override
    public void addTodo(Todo todo) {
        todoRepository.save(todo);

    }

    @Override
    public void updateTodo(Todo todo, Long todoId) {
        todoRepository.save(todo);
    }

    @Override
    public void removeTodo(Long todoId) {
        todoRepository.deleteById(todoId);
    }

}
