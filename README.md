# 🚀 Mini Scrum Management API

RESTful backend API built with Spring Boot to manage users, tasks, and sprints following Scrum principles.

This project focuses on implementing real business rules around sprint lifecycle management and task state transitions — going beyond a simple CRUD application.

---

## 📌 Overview

The API allows managing:

- Users
- Tasks
- Sprints

While enforcing strict business constraints such as:

- Only one ACTIVE sprint at a time
- Tasks restricted by sprint status
- Automatic backlog reassignment on sprint closure

---

## 🚀 Features

- User management
- Task creation and assignment
- Sprint lifecycle management (`PLANNED → ACTIVE → CLOSED`)
- Only one ACTIVE sprint allowed at a time
- Tasks can only be added to PLANNED sprints
- When closing a sprint:
  - DONE tasks remain in the sprint
  - Unfinished tasks return to backlog
- Dedicated PATCH endpoint for status updates
- Pagination and filtering support
- Global exception handling
- Unit tests for core business logic

---

## 🧠 Business Rules Implemented

- Only one sprint can be ACTIVE simultaneously.
- Tasks cannot be assigned to CLOSED sprints.
- Tasks from CLOSED sprints cannot be modified.
- Sprint cannot be closed unless it is ACTIVE.
- On sprint closure, unfinished tasks automatically return to backlog.

---

## 🛠 Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- JUnit 5
- Mockito

---

## 🏗 Architecture

The project follows a layered architecture:

- Controller layer – REST endpoints
- Service layer – Business logic and validations
- Repository layer – Data access (JPA)
- DTO mapping – Entity separation from API contracts
- Global exception handling – Centralized error management

---

## 🧪 Testing

Unit tests cover:

- Sprint state transitions
- Active sprint uniqueness
- Sprint closing behavior
- Task backlog reassignment logic

Testing stack:

- JUnit 5
- Mockito

---

## ▶ How to Run

### 1. Configure MySQL database

Create a database in MySQL.

### 2. Update `application.properties`

Configure your database credentials:

    spring.datasource.url=jdbc:mysql://localhost:3306/your_db
    spring.datasource.username=your_user
    spring.datasource.password=your_password
    
### 3. Build and run the application

    mvn clean install
    mvn spring-boot:run

The API will start on the default Spring Boot port (8080).

---

## 🔮 Possible Improvements

- JWT authentication
- Role-based access
- Dockerization
- CI/CD pipeline
- Integration tests

---

## 👨‍💻 Author

Developed as a backend portfolio project to demonstrate business rule implementation, clean architecture, and unit testing using Spring Boot.

---
