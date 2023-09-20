package com.sudeep.fullstackprojects.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Todo {

	@Id
	private Long id;
	private String task_name;
}
