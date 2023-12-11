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
    private Long todoId;

    private String taskname;
    private String discription;
    private String status;
    private Long assignMemberId;
    private Long createdUserId;
    private String assignedDate;
    private String estimatedHours;
    private String startDate;
    private String endDate;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date updatedDate;
    
    
}
