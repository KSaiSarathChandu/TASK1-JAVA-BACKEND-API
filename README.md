# TASK1-JAVA-BACKEND-API
Kaiburr TASK 1 JAVA Backend REST API Example 


# Task Manager API - Spring Boot & MongoDB  

## Overview  
This is a Java backend REST API built with Spring Boot and MongoDB. It provides CRUD operations for managing tasks and executing shell commands in a Kubernetes pod.  

## Features  
- Create, update, delete, and find tasks  
- Execute shell commands securely  
- Store execution history in MongoDB  

## Endpoints  
- **GET /tasks** → Fetch all tasks  
- **GET /tasks/{id}** → Fetch a task by ID  
- **PUT /tasks** → Create/Update a task  
- **DELETE /tasks/{id}** → Delete a task  
- **GET /tasks/findByName?name=xyz** → Search tasks by name  
- **PUT /tasks/{id}/execute** → Execute task command  

## Setup & Run  
1. Clone the repo:  
   ```sh
   git clone https://github.com/YOUR_GITHUB_USERNAME/TaskManager-SpringBoot-MongoDB.git
   cd TaskManager-SpringBoot-MongoDB
