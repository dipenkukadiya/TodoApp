package com.example.TodoApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "workspace_id")
    // private Workspace workspace;

    @Column(name = "board_title")
    private String title;

    @Column(name = "board_description")
    private String description;

    @Column(name = "is_favorite")
    private Boolean favorite;

    @Column(name = "is_archive")
    private Boolean archive;

   
}
