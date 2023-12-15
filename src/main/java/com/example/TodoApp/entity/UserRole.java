package com.example.TodoApp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserRole {
    @Id  @Column(name = "role_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_discription")
    private String roleDiscription;
    
}