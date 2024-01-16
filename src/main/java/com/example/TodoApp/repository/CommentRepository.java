package com.example.TodoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoApp.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment , Long> {
    
}
