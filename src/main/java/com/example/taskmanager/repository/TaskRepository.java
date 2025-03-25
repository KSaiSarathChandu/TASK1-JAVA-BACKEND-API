package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
//public interface TaskRepository extends MongoRepository<Task, String> {
    // Find tasks by name
  //  List<Task> findByName(String name);
//}


public interface TaskRepository extends MongoRepository<Task, String> {
    List<Task> findByNameContainingIgnoreCase(String name);
}



