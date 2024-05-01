package com.todo.tasks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.tasks.model.Tasks;
import com.todo.tasks.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;
  

    @PostMapping("/create")
    public ResponseEntity<String> createTask(@RequestBody Tasks task) {
        taskService.createTask(task);
        return ResponseEntity.ok("Task created successfully!");
    }

    @GetMapping("/folder/{folderName}")
    public List<Tasks> getTasksByFolder(@PathVariable String folderName) {
        return taskService.findTaskByFolder(folderName);
    }
}

