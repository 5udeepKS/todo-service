package com.sudeep.fullstackprojects.todo.controller;

import com.sudeep.fullstackprojects.todo.model.Todo;
import com.sudeep.fullstackprojects.todo.service.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
