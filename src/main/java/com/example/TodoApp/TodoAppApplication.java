package com.example.TodoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.TodoApp.entity.Comment;
import com.example.TodoApp.entity.Todo;
import com.example.TodoApp.entity.User;
import com.example.TodoApp.entity.UserRole;
import com.example.TodoApp.repository.CommentRepository;
import com.example.TodoApp.repository.TodoRepository;
import com.example.TodoApp.repository.UserRepository;
import com.example.TodoApp.repository.UserRoleRepository;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {
	// @Autowired
	// private UserRepository userRepository;
	// @Autowired
	// private TodoRepository todoRepository;
	// @Autowired
	// private CommentRepository commentRepository;
	// @Autowired
	// private UserRoleRepository userRoleRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		Todo todo = new Todo();
		UserRole userRole = new UserRole();
		Comment comment = new Comment();
		todoRepository.save(todo);
		userRepository.save(user);
		userRoleRepository.save(userRole);
		commentRepository.save(comment);		

	}

}
