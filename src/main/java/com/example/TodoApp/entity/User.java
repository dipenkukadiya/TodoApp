package com.example.TodoApp.entity;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.example.TodoApp.security.MaskedPassword;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

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
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long userId;

    @Column(name = "user_name")
    private String Username;
    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private UserRole userRole;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    @JsonSerialize(using = MaskedPassword.class)
    private String password;

    @CreatedDate
    @Column(name = "created_date")
    private Date createdDate;
    
    @LastModifiedDate
    @Column(name = "updated_date")
    private Date updatedDate;

}
