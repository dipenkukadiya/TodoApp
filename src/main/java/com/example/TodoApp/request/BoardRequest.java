package com.example.TodoApp.request;




public class BoardRequest {

    private String title;
    private String description;
    private boolean favorite;
    private boolean archive;
    

    
    public BoardRequest() {
    }
    public BoardRequest(String title, String description, boolean favorite, boolean archive) {
    this.title = title;
    this.description = description;
    this.favorite = favorite;
    this.archive = archive;
}
    public String getTitle() {
        return title;
    }
 public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
    public boolean isArchive() {
        return archive;
    }
    public void setArchive(boolean archive) {
        this.archive = archive;
    }
    

    
}

