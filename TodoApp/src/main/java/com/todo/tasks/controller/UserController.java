package com.todo.tasks.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.tasks.model.User;
import com.todo.tasks.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
     UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.ok("User created successfully!");
    }
    
    @GetMapping("/checkUserAuth/{userId}/{password}")
    public Optional<User> checkUserAuth(@PathVariable Integer userId,@PathVariable String password){
    	return userService.checkUserAuth(userId, password);
    }
}

