package com.example.TodoApp.service;



import java.util.List;

import com.example.TodoApp.entity.Board;
import com.example.TodoApp.entity.Workspace;

public interface WorkspaceService {
    
       List<Workspace> getWorkspaces();
       void addWorkspace(Workspace workspace);
       Workspace getWorkspace(String workspace_name);
       void updateWorkspace(Workspace workspace, Long workspaceId);
       long removeWorkspace(String workspace_name);
       void addBoard(Long workspace_id,Board board);



}
