package com.todo.tasks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.tasks.model.Tasks;
import com.todo.tasks.repository.TaskRepo;

@Service
public class TaskServiceImpl implements TaskService{
	    private final TaskRepo taskRepository;

	    @Autowired
	    public TaskServiceImpl(TaskRepo taskRepository) {
	        this.taskRepository = taskRepository;
	    }

	    @Override
	    public List<Tasks> findTaskByFolder(String taskFolderName) {
	        return taskRepository.findByTaskFolderName(taskFolderName);
	    }

	    @Override
	    public List<Tasks> viewAllTasks() {
	        return taskRepository.findAll();
	    }
	    @Override
	    public Tasks createTask(Tasks task) {
	        return taskRepository.save(task);
	    }


}
