package com.todo.tasks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.tasks.model.Tasks;

@Service
public interface TaskService {
	public List<Tasks> findTaskByFolder(String taskFolderName);
	public List<Tasks> viewAllTasks();
	public Tasks createTask(Tasks task);
}
