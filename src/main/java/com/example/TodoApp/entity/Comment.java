package com.example.TodoApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


@Entity
@Data
public class Comment {
    @Id @Column(name = "comment_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    
    @ManyToOne
    @JoinColumn(name = "todo_id")
    private Todo todo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @Column(name = "comment_content")
    private String commentContent;

    @CreatedDate @Column(name = "created_date")
    private Date createdDate;
    
    @LastModifiedDate @Column(name = "updated_date")
    private Date updatedDate;
}