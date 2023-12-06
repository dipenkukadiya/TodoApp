package com.example.TodoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.TodoApp.entity.Todo;
import com.example.TodoApp.entity.User;
import com.example.TodoApp.repository.TodoRepository;
import com.example.TodoApp.repository.UserRepository;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		Todo todo = new Todo();
		todoRepository.save(todo);
		userRepository.save(user);

	}

}
