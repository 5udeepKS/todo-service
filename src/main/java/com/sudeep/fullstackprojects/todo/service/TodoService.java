package com.sudeep.fullstackprojects.todo.service;

import java.util.List;
import java.util.Optional;

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

	public Todo setTask(Todo todo) {
		return this.todoRepository.save(todo);
	}

	public void deleteTask(Long id) {
		this.todoRepository.deleteById(id);
	}

//	public Optional<Todo> updateTask(Long id, Todo todo) {
//		Optional<Todo> updatedTodo = this.todoRepository.findById(id);
//		updatedTodo.get().setId(todo.getId());
//		updatedTodo.get().setTask_name(todo.getTask_name());
//		this.todoRepository.save(updatedTodo);
//		
//		return updatedTodo;
//	}

	
}
