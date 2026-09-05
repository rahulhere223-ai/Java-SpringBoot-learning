# Java-SpringBoot-learning
🚀 Java Spring Boot — Week 1

Backend Engineering Journey | Week 1 Completed ✅

This repository documents my Week 1 preparation and hands-on learning of Java Spring Boot, with a focus on understanding backend fundamentals through implementation, API testing, debugging, and building a small REST API.

The goal of this week was not just to learn Spring Boot syntax, but to understand how a backend application is structured and how a request flows through the application.

🎯 Week 1 Goal

Build a strong foundation in:

Spring Boot fundamentals
REST API development
HTTP methods
Layered architecture
Dependency Injection
Maven
JSON request/response handling
API testing with Postman
Database connectivity fundamentals
Debugging Spring Boot applications
📚 Topics Covered
1. Spring Boot Fundamentals

Learned:

What Spring Framework is
What Spring Boot is
Why Spring Boot is used for backend development
Spring Boot project structure
@SpringBootApplication
Application startup
Embedded server concept
Spring Boot configuration
2. Maven

Learned the fundamentals of Maven and how it manages a Spring Boot project.

Topics:

pom.xml
Dependencies
Maven lifecycle
Maven Wrapper
Running Spring Boot applications
Dependency management
3. REST APIs

Built and tested REST APIs using Spring Boot.

Covered:

REST architecture
Resources
Endpoints
HTTP methods
Request/Response cycle
JSON
HTTP status codes
HTTP Methods
Method	Purpose
GET	Retrieve data
POST	Create data
PUT	Update data
DELETE	Delete data
4. Spring Controllers

Learned how controllers handle incoming HTTP requests.

Important concepts:

@RestController
@RequestMapping
@GetMapping
@PostMapping
@PutMapping
@DeleteMapping

Also practiced:

Path Variables
Request Parameters
Request Body
Returning JSON responses
5. Dependency Injection

Learned the core Spring concept of Dependency Injection (DI).

Understanding:

IoC (Inversion of Control)
Dependency Injection
Spring Beans
Constructor-based dependency injection
@Service
@Autowired

The goal was to understand why Spring manages objects instead of manually creating everything using new.

🏗️ Layered Architecture

One of the most important concepts learned during Week 1.

The backend was structured into different layers:

Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository / Database
Controller

Responsible for handling HTTP requests.

Service

Contains business logic.

Repository

Responsible for interacting with the database.

This separation makes the application:

Easier to maintain
Easier to test
Easier to scale
More organized
🧪 Postman API Testing

Used Postman to test REST APIs manually.

Practiced:

GET requests
POST requests
PUT requests
DELETE requests
Sending JSON request bodies
Checking HTTP status codes
Testing API responses
Debugging incorrect requests
🗄️ Database & JDBC Fundamentals

Also explored the fundamentals of connecting a Spring Boot application with a database.

Learned:

Database connectivity
JDBC fundamentals
SQL interaction from backend
Connection configuration
The role of a database in a backend application

This provided the foundation for moving into JPA/Hibernate in Week 2.

🛠️ Mini Project — Product Management API

As part of Week 1, I worked on a small Product Management REST API.

Features
Create product
Get products
Get product by ID
Update product
Delete product
Architecture
Client / Postman
       │
       ▼
 REST Controller
       │
       ▼
 Service Layer
       │
       ▼
 Repository / Database

The project helped me understand how different Spring Boot components work together instead of learning them individually.

🐛 Debugging & Problem Solving

A major part of this week was not only writing code but also debugging real problems.

Worked with:

Maven errors
Spring Boot startup issues
Port-related problems
Dependency issues
Java configuration
Request/response errors
API testing issues
Debugging using logs

This was especially useful because backend development involves understanding and fixing problems, not just writing code.

🧠 Key Learnings

After completing Week 1, I can now explain:

What Spring Boot actually does
How a Spring Boot application starts
How HTTP requests reach a controller
How controllers communicate with services
Why layered architecture is useful
How dependency injection works
How REST APIs are designed
How APIs are tested using Postman
How Maven manages dependencies
How backend applications interact with databases
How to debug common Spring Boot problems
📈 Week 1 Outcome

Status: ✅ COMPLETED

Area	Status
Spring Boot Fundamentals	✅
Maven	✅
REST APIs	✅
Controllers	✅
HTTP Methods	✅
JSON	✅
Dependency Injection	✅
Service Layer	✅
Layered Architecture	✅
Postman	✅
Database Fundamentals	✅
Debugging	✅
Mini Project	✅
Revision
