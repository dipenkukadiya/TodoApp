package com.example.TodoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoApp.entity.Board;
import com.example.TodoApp.entity.Workspace;
import com.example.TodoApp.service.WorkspaceService;

@RestController
@RequestMapping("/workspace")
public class WorkspaceController {
    @Autowired
    WorkspaceService workspaceService;

    @PostMapping("/create")
    public ResponseEntity<Void> addWorkspace(@RequestBody Workspace workspace) {
        workspaceService.addWorkspace(workspace);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<Workspace> getWorkspaces() {
        return workspaceService.getWorkspaces();
    }
//------------------BY NAME WORKSPACE GETTING------------------------

    @GetMapping("/{workspaceName}")
    public Workspace getWorkspace(@PathVariable String workspaceName) {
        return workspaceService.getWorkspace(workspaceName);
    }

    @PutMapping("/{workspaceId}")
    public ResponseEntity<Void> updateWorkspace(@RequestBody Workspace workspace, @PathVariable Long workspaceId) {
        workspaceService.updateWorkspace(workspace, workspaceId);
        return ResponseEntity.ok().build();
    }
// -------------------BY NAME DELETE --------------------------------------

    @DeleteMapping("/{workspaceName}")
    public ResponseEntity<Void> removeWorkspace(@PathVariable String workspaceName) {
        workspaceService.removeWorkspace(workspaceName);
        return ResponseEntity.ok().build();
    }
    
    
    @PostMapping("/{workspaceId}/boards")
public ResponseEntity<Void> addBoardToWorkspace(@PathVariable Long workspaceId, @RequestBody Board board) {
    workspaceService.addBoard(workspaceId, board);
    return ResponseEntity.status(HttpStatus.CREATED).build();
}

}
