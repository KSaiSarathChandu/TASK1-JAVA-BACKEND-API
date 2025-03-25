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
 ![image](https://github.com/user-attachments/assets/54c20971-ec49-479e-869a-9a99ba67cd65)
 

### 2. GET task by ID  
Fetch a specific task by its ID.  
  ![image](https://github.com/user-attachments/assets/870b0b45-1f04-46da-9af2-240b51f30891)


### 3. GET task not found  
Response when a task with a given ID does not exist.  
  ![image](https://github.com/user-attachments/assets/6e2e2a0b-3a91-4b2b-b302-b539902b0736)


### 4. POST method  
Send a JSON payload to create or update a task.  
![image](https://github.com/user-attachments/assets/6e4c0f66-98e5-468e-9e5e-e0223e2a05c0)



### 5. DELETE a task  
Delete a task by ID.  
 ![image](https://github.com/user-attachments/assets/f6b27b45-22a7-40b5-9a61-575b3b4f5364)


### 6. Search tasks by name  
Find tasks based on a name search query.  
![image](https://github.com/user-attachments/assets/b260ff19-533b-4b04-8882-ae7a489ce45d)


### 7. Execute a task command  
Run a shell command for a task execution.  
![image](https://github.com/user-attachments/assets/6b9580a9-881b-4c6e-b285-23ea212d5309)






