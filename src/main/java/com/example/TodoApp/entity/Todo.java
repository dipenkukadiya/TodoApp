package com.example.TodoApp.entity;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

    @Entity
    @Data
    public class Todo {
    @Id @Column(name = "todo_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;
    @Column(name = "task_name")
    private String taskname;
    @Column(name = "discription")
    private String discription;
    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "assigned_member_id")
    private User assignMemberBy;

    @ManyToOne
    @JoinColumn(name = "created_user_id")
    private User createdUserBy;

    @Column(name = "assigned_date")
    private String assignedDate;
    @Column(name = "estimated_hours")
    private String estimatedHours;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;
    @CreatedDate @Column(name = "created_date")
    private Date createdDate;
    @LastModifiedDate @Column(name = "updated_date")
    private Date updatedDate;
    
    
    
}
