#Usercenter Backend
This is the backend component of the Usercenter project, responsible for managing user accounts and authentication.

##Features
User registration: Allows users to create new accounts by providing their email address and password.
User login: Allows registered users to authenticate themselves and obtain access to protected resources.
User profile: Provides endpoints to manage user profiles, including updating user information and retrieving user details.
Access control: Implements role-based access control to restrict certain operations to authorized users only.
##Technologies Used
Java: The programming language used for developing the backend.
Spring Boot: The framework used for building the backend application.
MySQL: The relational database used for storing user data.
Hibernate: The object-relational mapping (ORM) library for database interaction.
JSON Web Tokens (JWT): Used for user authentication and authorization.
Maven: The build automation tool for managing dependencies and building the project.
Docker: Enables containerization of the backend application for easy deployment.
Getting Started
Prerequisites
Before running the application, make sure you have the following prerequisites:

Java Development Kit (JDK) installed
MySQL server installed and running
Docker installed (optional)
Configuration
Clone the repository:

bash
Copy code
git clone https://github.com/XunQAQ/usercenter_backend.git
Configure the database connection:

Open src/main/resources/application.properties file.
Update the database URL, username, and password according to your MySQL configuration.
Build the project:

bash
Copy code
./mvnw clean package
Running the Application
You can run the application using the following command:

bash
Copy code
./mvnw spring-boot:run
The application will start on the default port 8080.

##API Documentation
Once the application is up and running, you can access the API documentation at:

bash
Copy code
http://localhost:8080/swagger-ui.html
The API documentation provides detailed information about the available endpoints, request/response formats, and authentication requirements.

##Deployment
For deployment, you can use the Docker image. First, build the Docker image:

bash
Copy code
docker build -t usercenter-backend .
Then, run the Docker container:

bash
Copy code
docker run -p 8080:8080 usercenter-backend
The application will be accessible on port 8080 of your Docker host.

##Contributing
If you would like to contribute to this project, you can follow these steps:

Fork the repository.
Create a new branch for your feature/bug fix.
Make your changes and commit them.
Push the changes to your forked repository.
