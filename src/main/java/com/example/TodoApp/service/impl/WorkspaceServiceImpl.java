package com.example.TodoApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApp.entity.Board;
import com.example.TodoApp.entity.Workspace;
import com.example.TodoApp.repository.BoardRepository;
import com.example.TodoApp.repository.WorkspaceRepository;
import com.example.TodoApp.request.BoardRequest;
import com.example.TodoApp.request.WorkspaceRequest;
import com.example.TodoApp.service.WorkspaceService;

import jakarta.transaction.Transactional;

@Service
public class WorkspaceServiceImpl implements WorkspaceService {
    @Autowired
    WorkspaceRepository workspaceRepository;

    @Autowired  // Add this annotation
    BoardRepository boardRepository;

    @Override
    public List<Workspace> getWorkspaces() {
        return workspaceRepository.findAll();
    }

    
    @Override
    public void addWorkspace(WorkspaceRequest workspaceRequest) {
        // Process and save the workspace request data, but don't treat it as an entity
        Workspace workspace = new Workspace();
        workspace.setWorkspaceName(workspaceRequest.getWorkspaceName());
        workspace.setWorkspaceDescription(workspaceRequest.getWorkspaceDescription());
        // Save workspace using repository
        workspaceRepository.save(workspace);
    }

    @Override
    public Workspace getWorkspace(String workspaceName) {
        return workspaceRepository.findByworkspaceName(workspaceName);
    }

    @Override
    public void updateWorkspace(WorkspaceRequest updatedWorkspace, Long workspaceId) {
        Workspace existingWorkspace = workspaceRepository.findById(workspaceId)
                .orElseThrow(() -> new RuntimeException("Workspace not found"));

        existingWorkspace.setWorkspaceName(updatedWorkspace.getWorkspaceName());
        existingWorkspace.setWorkspaceDescription(updatedWorkspace.getWorkspaceDescription());

        workspaceRepository.save(existingWorkspace);
    }

    @Override
    @Transactional
    public long removeWorkspace(String workspaceName) {
        return workspaceRepository.deleteByworkspaceName(workspaceName);
    }


    @Override
    public void addBoard(Long workspaceId, BoardRequest boardRequest) {
        Workspace workspace = workspaceRepository.findById(workspaceId).get();
        Board board = new Board();
        board.setTitle(boardRequest.getTitle());
        board.setDescription(boardRequest.getDescription());
        board.setArchive(boardRequest.isArchive());
        board.setFavorite(boardRequest.isFavorite());
        boardRepository.save(board);
        workspaceRepository.save(workspace);
    }

}
