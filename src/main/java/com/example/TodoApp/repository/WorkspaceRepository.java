package com.example.TodoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.TodoApp.entity.Workspace;
import com.example.TodoApp.request.WorkspaceRequest;
@EnableJpaRepositories
public interface WorkspaceRepository extends JpaRepository<Workspace ,Long>{


    long deleteByworkspaceName(String workspace_name);

    Workspace findByworkspaceName(String workspaceName);

    void save(WorkspaceRequest workspaceRequest);



}
