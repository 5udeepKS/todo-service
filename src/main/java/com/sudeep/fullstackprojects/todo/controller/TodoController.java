package com.sudeep.fullstackprojects.todo.controller;

import com.sudeep.fullstackprojects.todo.model.Todo;
import com.sudeep.fullstackprojects.todo.service.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/tasks")
@RestController
@CrossOrigin("*")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todo")
	public List<Todo> getAllTask() {
		return this.todoService.getAllTask();
	}
	
	@PostMapping("/todo")
	public Todo addTask(@RequestBody Todo todo) {
		return this.todoService.setTask(todo);
	}
	
	@PutMapping("/todo/{id}")
	public ResponseEntity<Todo> updateTask(@PathVariable(value = "id") Long id ,@RequestBody Todo todo) {
		todo.setId(id);
		return ResponseEntity.ok(this.todoService.setTask(todo));
	}
	
	@DeleteMapping("/todo/{id}")
	public ResponseEntity<Boolean> deleteTask(@PathVariable(value="id") Long id) {
		this.todoService.deleteTask(id);
		return ResponseEntity.ok(true);
	}
}
