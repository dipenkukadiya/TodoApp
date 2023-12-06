package com.example.TodoApp.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.sql.Date;

    @Entity
    @Data
    public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todo_id;

    private String task_name;
    private String discription;
    private String status;
    private Long assign_member_id;
    private Long created_user_id;
    private String assigned_date;

    @CreatedDate
    private Date created_date;
    @LastModifiedDate
    private Date updated_date;
    
    private String estimated_hours;
    private String start_date;
    private String end_date;
    
}
