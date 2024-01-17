// package com.example.TodoApp.service.impl;

// import com.example.TodoApp.entity.Board;
// import com.example.TodoApp.entity.Workspace;
// import com.example.TodoApp.repository.BoardRepository;
// import com.example.TodoApp.repository.WorkspaceRepository;
// import com.example.TodoApp.request.BoardRequest;
// import com.example.TodoApp.service.BoardService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// @Service
// public class BoardServiceImpl implements BoardService {

//     @Autowired
//     private BoardRepository boardRepository;

//     @Autowired
//     private WorkspaceRepository workspaceRepository;

//     // @Override
//     // @Transactional
//     // public void addBoard(Long workspaceId, BoardRequest boardRequest) {
//     //     Workspace workspace = workspaceRepository.findById(workspaceId).orElse(null);
//     //     if (workspace != null) {
//     //         Board board = new Board();
//     //         mapBoardRequestToBoard(boardRequest, board);
//     //         board.setWorkspace(workspace);
//     //         boardRepository.save(board);
//     //     }
//     // }

//     @Override
//     public Board getBoard(Long workspaceId, Long boardId) {
//         // Assuming your BoardRepository has a method findByWorkspaceIdAndId
//         return boardRepository.findByWorkspaceIdAndId(workspaceId, boardId);
//     }

//     @Override
//     @Transactional
//     public void updateBoard(Long workspaceId, BoardRequest boardRequest, Long boardId) {
//         Board existingBoard = boardRepository.findByWorkspaceIdAndId(workspaceId, boardId);

//         if (existingBoard != null) {
//             mapBoardRequestToBoard(boardRequest, existingBoard);
//             boardRepository.save(existingBoard);
//         }
//     }

//     @Override
//     @Transactional
//     public void removeBoard(Long workspaceId, Long boardId) {
//         // Assuming your BoardRepository has a method deleteByWorkspaceIdAndId
//         boardRepository.deleteByWorkspaceIdAndId(workspaceId, boardId);
//     }

//     private void mapBoardRequestToBoard(BoardRequest boardRequest, Board board) {
//         board.setTitle(boardRequest.getTitle());
//         board.setDescription(boardRequest.getDescription());
//         board.setFavorite(boardRequest.isFavorite());
//         board.setArchive(boardRequest.isArchive());
//     }
// }
