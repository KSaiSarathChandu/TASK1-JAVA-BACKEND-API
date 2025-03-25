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

2. Install Dependencies:
   ```sh
   mvn clean install

3. Start the MongoDB server (if not running):
   ```sh
   mongod --dbpath /your/mongodb/data/path

4. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run

5. The server should now be running at:
   ```sh
   http://localhost:8080

## Screenshots  

### 1. GET all tasks  
Fetch all tasks from the database.  
![GET all tasks](screenshots/GET_method.jpg)  

### 2. GET task by ID  
Fetch a specific task by its ID.  
![GET task by ID](screenshots/GET_Task_by_ID.png)  

### 3. GET task not found  
Response when a task with a given ID does not exist.  
![GET task not found](screenshots/GET_not_found.png)  

### 4. PUT (Create/Update Task)  
Send a JSON payload to create or update a task.  
![PUT Task](screenshots/POST_method.png)  

### 5. DELETE a task  
Delete a task by ID.  
![DELETE Task](screenshots/DELETE_method.png)  

### 6. Search tasks by name  
Find tasks based on a name search query.  
![GET task by NAME](screenshots/GET_task_by_NAME.png)  

### 7. Execute a task command  
Run a shell command for a task execution.  
![PUT Task Execution](screenshots/PUT_Task_Execute.png)  






