package com.example.TodoApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApp.entity.Board;
import com.example.TodoApp.entity.Workspace;
import com.example.TodoApp.repository.BoardRepository;
import com.example.TodoApp.repository.WorkspaceRepository;
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
    public void addWorkspace(Workspace workspace) {
        workspaceRepository.save(workspace);
    }

    @Override
    public Workspace getWorkspace(String workspaceName) {
        return workspaceRepository.findByworkspaceName(workspaceName);
    }

    @Override
    public void updateWorkspace(Workspace updatedWorkspace, Long workspaceId) {
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
    @Transactional
    public void addBoard(Long workspaceId, Board board) {
        Workspace workspace = workspaceRepository.findById(workspaceId).get();
        Board boardd = new Board();  
        workspace.getBoardlist().add(boardd);
        boardRepository.save(boardd);      
        workspaceRepository.save(workspace);

    
    }
}
// user.getTodolist().add(todo);
//         todoRepository.save(todo);
//         userRepository.save(use
