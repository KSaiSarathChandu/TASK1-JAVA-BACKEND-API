package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.model.TaskExecution;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Create Task
 // Create Task
    public Task createTask(Task task) {
        if (task.getName() == null || task.getOwner() == null || task.getCommand() == null) {
            throw new IllegalArgumentException("Task name, owner, and command are required!");
        }
        return taskRepository.save(task);
    }

    public List<Task> findByName(String name) {
        return taskRepository.findByNameContainingIgnoreCase(name);
    }


    // Get All Tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get Task by ID
    public Optional<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    // Update Task
    public Task updateTask(String id, Task taskDetails) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setName(taskDetails.getName());
            task.setOwner(taskDetails.getOwner());
            task.setCommand(taskDetails.getCommand());
            task.setTaskExecutions(taskDetails.getTaskExecutions());
            return taskRepository.save(task);
        } else {
            throw new RuntimeException("Task with ID " + id + " not found!");
        }
    }

    // Execute Task (Simulated)
    public Task executeTask(String id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();

            // Simulate execution
            TaskExecution execution = new TaskExecution(
                LocalDateTime.now(),
                LocalDateTime.now().plusSeconds(5), 
                "Simulated output of command: " + task.getCommand()
            );

            // Add execution to task
            task.getTaskExecutions().add(execution);
            return taskRepository.save(task);
        } else {
            throw new RuntimeException("Task with ID " + id + " not found!");
        }
    }

    // Delete Task
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }
}
