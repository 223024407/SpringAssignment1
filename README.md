# Spring Assignment 1

This project is a Spring Boot application that manages course information for the Computer Science Department. It includes a REST API with full CRUD functionality (Create, Read, Update, Delete) and input validation, and static HTML page integration.

## *Endpoints
- GET /courses: Lists all courses
- POST /courses: Adds a new course
- PUT /courses: Updates a course
- PUT /courses/{id}: Updates a course with specified id.
- DELETE /courses: Deletes a course
- DELETE /courses/{id}: Deletes a course with the specified id.

## * Features

- Exposes HTTP endpoints using Spring Boot
- CRUD operations on course data
- Input validation using JSR-303 annotations
- Hosted on GitHub for collaboration

## *How to Run
1. Clone the repo
2. Run the application using your IDE or ./mvnw spring-boot:run
3. Visit:
    - http://localhost:8080/index.html
    - http://localhost:8080/courses (REST endpoint)


## *Group Members
- Owethu Dyasophi (223024407)
- [Add your teammates' names here]

This Spring Boot application exposes RESTful endpoints for managing university courses. It supports full CRUD operations using curl and includes static HTML pages for displaying Foundation, Undergraduate, and Honours course information. The project is hosted on GitHub and structured for easy testing and future extension.