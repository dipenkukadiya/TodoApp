package com.example.TodoApp.request;

public class WorkspaceRequest {
    private String workspaceName;
    private String workspaceDescription;

    public WorkspaceRequest() {
    }

    public WorkspaceRequest(String workspaceName, String workspaceDescription) {
        this.workspaceName = workspaceName;
        this.workspaceDescription = workspaceDescription;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public String getWorkspaceDescription() {
        return workspaceDescription;
    }

    public void setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
    }

}
