// package com.example.TodoApp.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.TodoApp.entity.Board;
// import com.example.TodoApp.service.BoardService;
// import com.example.TodoApp.service.WorkspaceService;

// @RestController
// @RequestMapping("/boards/")
// public class BoardController {
//     @Autowired
//     BoardService boardService;
//     @Autowired
//     WorkspaceService workspaceService;
    
//     @PostMapping("/{workspace_id}/board")
//     public void addBoard(@PathVariable Long workspace_id,@RequestBody Board board) {
//         boardService.addBoard(workspace_id, board);

//     }
    
// }
