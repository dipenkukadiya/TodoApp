package com.example.TodoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoApp.entity.Board;

public interface BoardRepository extends JpaRepository<Board,Long>{
    
}
