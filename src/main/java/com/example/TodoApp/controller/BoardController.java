// package com.example.TodoApp.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import com.example.TodoApp.entity.Board;
// import com.example.TodoApp.request.BoardRequest;
// import com.example.TodoApp.service.BoardService;

// @RestController
// @RequestMapping("/workspace/{workspaceId}/board")
// public class BoardController {

//     @Autowired
//     private BoardService boardService;

//     @PostMapping("/add")
//     public ResponseEntity<Void> addBoard(@PathVariable Long workspaceId, @RequestBody BoardRequest boardRequest) {
//         boardService.addBoard(workspaceId, boardRequest);
//         return ResponseEntity.status(HttpStatus.CREATED).build();
//     }

//     @GetMapping("/{boardId}")
//     public ResponseEntity<Board> getBoard(@PathVariable Long workspaceId, @PathVariable Long boardId) {
//         Board board = boardService.getBoard(workspaceId, boardId);
//         return ResponseEntity.ok(board);
//     }

//     @PutMapping("/{boardId}")
//     public ResponseEntity<Void> updateBoard(@PathVariable Long workspaceId, @PathVariable Long boardId,
//                                             @RequestBody BoardRequest updatedBoard) {
//         boardService.updateBoard(workspaceId, updatedBoard, boardId);
//         return ResponseEntity.ok().build();
//     }

//     @DeleteMapping("/{boardId}")
//     public ResponseEntity<Void> removeBoard(@PathVariable Long workspaceId, @PathVariable Long boardId) {
//         boardService.removeBoard(workspaceId, boardId);
//         return ResponseEntity.ok().build();
//     }
// }
