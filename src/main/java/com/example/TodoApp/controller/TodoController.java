// package com.example.TodoApp.controller;


// // import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.TodoApp.entity.Todo;
// // import com.example.TodoApp.entity.User;
// import com.example.TodoApp.repository.TodoRepository;
// import com.example.TodoApp.repository.UserRepository;
// import com.example.TodoApp.request.AddTodoRequest;

// @RestController
// @RequestMapping("/todos/")
// public class TodoController {
//     private TodoRepository todoRepository;
//     // private UserRepository userRepository;

//    public TodoController(TodoRepository todoRepository , UserRepository userRepository) {
//         this.todoRepository = todoRepository;
//         // this.userRepository = userRepository;
//     }

//     @GetMapping("/{todoId}")
//     public Todo getTodoById(@PathVariable Long todoId) {
//         return todoRepository.findById(todoId).get();
//     }

//     @GetMapping
//     public Iterable<Todo> getAllTodos() {
//         return todoRepository.findAll();
//     }
//      @PostMapping("/{userId}/todos")
//     public Todo addTodo(@PathVariable Long userId,@RequestBody AddTodoRequest addTodoRequest) {
//         // User user = userRepository.findById(userId).get();
//         Todo todo = new Todo();
//         todo.setTaskname(addTodoRequest.getTaskname());
//         todo.setDiscription(addTodoRequest.getDiscription());
//         todo.setStatus(addTodoRequest.getStatus());
//         todo.setCreatedDate(addTodoRequest.getCreatedDate());
//         todo.setUpdatedDate(addTodoRequest.getUpdatedDate());
//         todo.setEstimatedHours(addTodoRequest.getEstimatedHours());
//         todo.setCreatedUserId(userId);
//        return todoRepository.save(todo);
//     }
// }

