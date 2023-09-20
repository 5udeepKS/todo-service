package com.sudeep.fullstackprojects.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudeep.fullstackprojects.todo.model.Todo;
import com.sudeep.fullstackprojects.todo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;

	public List<Todo> getAllTask() {
		return this.todoRepository.findAll();
	}

	
}
