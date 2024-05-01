package com.todo.tasks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.todo.tasks.model.Tasks;
import com.todo.tasks.model.User;
import com.todo.tasks.repository.TaskRepo;
import com.todo.tasks.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	TaskRepo taskRepo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public Optional<User> checkUserAuth(Integer userId, String password) {
	    Optional<User> userOptional = userRepo.findById(userId);
	    if (userOptional.isPresent()) {
	        User user = userOptional.get();
	        if (user.getPassword().equals(password)) {
	            return Optional.of(user);
	        } else {
	            // Incorrect password
	            return Optional.empty();
	        }
	    } else {
	        // User not found
	        return Optional.empty();
	    }
	}



	@Override
	public List<Tasks> viewAllFolder() {
		// TODO Auto-generated method stub
		return taskRepo.findAll();
	}

	@Override
	public List<Tasks> findTaskByFolder(String taskFolderName) {
		// TODO Auto-generated method stub
		return taskRepo.findByTaskFolderName(taskFolderName);
	}

}
