package com.example.TodoApp.controller;

import com.example.TodoApp.entity.Workspace;
import com.example.TodoApp.request.BoardRequest;
import com.example.TodoApp.request.WorkspaceRequest;
import com.example.TodoApp.service.WorkspaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workspace")
public class WorkspaceController {

    @Autowired
    private WorkspaceService workspaceService;

    @GetMapping("/all")
    public ResponseEntity<List<Workspace>> getWorkspaces() {
        List<Workspace> workspaces = workspaceService.getWorkspaces();
        return ResponseEntity.ok(workspaces);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> addWorkspace(@RequestBody WorkspaceRequest workspaceRequest) {
        workspaceService.addWorkspace(workspaceRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{workspaceName}")
    public ResponseEntity<Workspace> getWorkspace(@PathVariable String workspaceName) {
        Workspace workspace = workspaceService.getWorkspace(workspaceName);
        return ResponseEntity.ok(workspace);
    }

    @PutMapping("/update/{workspaceId}")
    public ResponseEntity<Void> updateWorkspace(@RequestBody WorkspaceRequest updatedWorkspace,
                                               @PathVariable Long workspaceId) {
        workspaceService.updateWorkspace(updatedWorkspace, workspaceId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/remove/{workspaceName}")
    public ResponseEntity<Void> removeWorkspace(@PathVariable String workspaceName) {
        workspaceService.removeWorkspace(workspaceName);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{workspaceId}/board/add")
    public ResponseEntity<Void> addBoard(@PathVariable Long workspaceId,
                                         @RequestBody BoardRequest boardRequest) {
        workspaceService.addBoard(workspaceId, boardRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
