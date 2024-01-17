package com.example.TodoApp.service;



import java.util.List;

import com.example.TodoApp.entity.Workspace;
import com.example.TodoApp.request.BoardRequest;
import com.example.TodoApp.request.WorkspaceRequest;

public interface WorkspaceService {
    
       List<Workspace> getWorkspaces();
       void addWorkspace(WorkspaceRequest workspaceRequest);
       Workspace getWorkspace(String workspace_name);
       void updateWorkspace(WorkspaceRequest workspaceRequest, Long workspaceId);
       long removeWorkspace(String workspace_name);
       void addBoard(Long workspaceId, BoardRequest boardRequest);

       
       


}
