package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Create Task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // Get All Tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Get Task by ID
    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable String id) {
        return taskService.getTaskById(id);
    }

    // Update Task
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task taskDetails) {
        return taskService.updateTask(id, taskDetails);
    }

    // Execute Task
    @PutMapping("/{id}/execute")
    public Task executeTask(@PathVariable String id) {
        return taskService.executeTask(id);
    }
    
 // Find Tasks by Name (Case Insensitive)
    @GetMapping("/findByName")
    public List<Task> findByName(@RequestParam String name) {
        return taskService.findByName(name);
    }


    // Delete Task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
    }
}
