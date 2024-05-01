package com.todo.tasks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.todo.tasks.model.Tasks;
import com.todo.tasks.model.User;

@Service
public interface UserService {
		
	public User addUser(User user);
	public Optional<User> checkUserAuth(Integer userId, String password);
	public List<Tasks> viewAllFolder();
	
	public List<Tasks> findTaskByFolder(String taskFolderName);
	
}
