# User Registration API
This project is a simple User Registration API built using Spring Boot and Hibernate JPA. It demonstrates the basic CRUD operations for user registration, including creating, reading, updating, and deleting user information.

# Prerequisites
Java 21.0.2
Maven 3.8.1+
MySQL
# Getting Started
Clone the repository
bash
Copy code
git clone https://github.com/am926786/restapi-java.git
cd user-registration-api
# Setup MySQL Database
Ensure MySQL is installed and running on your system.
Create a database named user:
sql

CREATE DATABASE user;
Update Application Properties
# Update the src/main/resources/application.properties file with your MySQL database configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/user_registration
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
# Build and Run the Application
# Build the project using Maven:

mvn clean install
# Run the application:

mvn spring-boot:run
The application will start and be available at http://localhost:8080.

# API Endpoints
The API provides the following endpoints:

Create a User
URL: /users
Method: POST
Request Body:

{
  "username": "john_doe",
  "password": "password123",
  "email": "john.doe@example.com"
}
Response:

{
  "id": 1,
  "username": "john_doe",
  "email": "john.doe@example.com"
}
Get All Users
URL: /users
Method: GET
Response:

[
  {
    "id": 1,
    "username": "john_doe",
    "email": "john.doe@example.com"
  }
]
Get a User by ID
URL: /users/{id}
Method: GET
Response:

{
  "id": 1,
  "username": "john_doe",
  "email": "john.doe@example.com"
}
Update a User
URL: /users/{id}
Method: PUT
Request Body:

{
  "username": "john_doe_updated",
  "password": "new_password123",
  "email": "john.doe.updated@example.com"
}
Response:

{
  "id": 1,
  "username": "john_doe_updated",
  "email": "john.doe.updated@example.com"
}
Delete a User
URL: /users/{id}
Method: DELETE
Response: 204 No Content
Troubleshooting
Common Issues
Unknown database 'root'

Ensure the database name in the application.properties file is correct and matches the name of your MySQL database.
Cannot invoke SqlExceptionHelper.convert

Check your MySQL server is running and the credentials in application.properties are correct.
