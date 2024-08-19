# Spring Boot Feign Client Project

## Overview

This Spring Boot application demonstrates the use of Spring Cloud OpenFeign to create a declarative web service client. It is designed to simplify the HTTP API integration of a Spring Boot application with external web services. By using annotations, Feign creates a dynamic implementation of the interface, which can then be used to seamlessly interact with the specified REST API.

## Purpose of Feign Client

Feign is an HTTP client binder developed by Netflix, integrated into Spring Cloud, which makes writing web service clients easier. The primary goal is to allow seamless integration between microservices. It provides a more abstract way of consuming RESTful services and automatically handles the request creation and response handling.

## Prerequisites

To get started with this project, you should have the following installed:
- JDK 17 or higher
- Maven 3.6 or higher
- Spring Boot 3.3.2
- An IDE of your choice (Eclipse, IntelliJ IDEA, etc.)

Ensure that your development environment is set up with JDK 17 and Maven.

## Dependencies

This project uses several key dependencies:
- **`Spring Boot Starter Web`**: Core starter, including auto-configuration support, logging and YAML.
- **`Spring Cloud Starter OpenFeign`**: Starter for building Feign clients.
- **`Lombok`**: Provides annotations to minimize boilerplate code in Java applications.
- **`Spring Boot Starter Test`**: Support for testing Spring Boot applications with libraries including JUnit, Hamcrest and Mockito.

## Web Service Client

The `WebServiceClient` interface is annotated with `@FeignClient`, targeting the `https://jsonplaceholder.typicode.com` API. It defines methods to interact with user and post resources:

- `getUsers()`: Fetches all users.
- `getUserById(int id)`: Fetches a user by ID.
- `createPost(Request request)`: Creates a new post.
- `deletePost(int id)`: Deletes a post by ID.

## Main Controller

The `FeignController` class handles incoming HTTP requests and utilizes the `WebServiceClient` to interact with the external API. It includes routes to:

- Retrieve all users or a single user by ID.
- Create and delete posts.

## Application Configuration

To enable Feign in the Spring Boot application, the `@EnableFeignClients` annotation must be added to the main application class. This annotation tells Spring Cloud to look for interfaces that declare they are Feign clients (using `@FeignClient`).

```java
@SpringBootApplication
@EnableFeignClients
public class SpringbootFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFeignClientApplication.class, args);
    }

}
```

This setup is crucial for ensuring that Spring Boot recognizes and registers your defined Feign clients so they can be autowired and used within your application services.

## Testing with Postman

To test the application with Postman:

1. Start the Spring Boot application.
2. Open Postman and configure requests to match the routes defined in the `FeignController`.
   - **Get Users**: GET `http://localhost:8080/feign/users`
   - **Get User by ID**: GET `http://localhost:8080/feign/users/{id}`
   - **Create Post**: POST `http://localhost:8080/feign/posts` 
    - **Request Body Example**: Provide a JSON payload as follows:
      ```json
      {
        "title": "Sample Title",
        "body": "This is a sample post body.",
        "userId": 1
      }
      ```
      Replace the fields in the JSON request with the actual data you wish to post.
    
   - **Delete Post**: DELETE `http://localhost:8080/feign/posts/{id}`

Replace `{id}` with the actual ID of the user or post you wish to interact with.

## Conclusion

This project serves as a practical demonstration of integrating Spring Boot with external APIs using Spring Cloud OpenFeign. By abstracting much of the HTTP communication, it allows developers to focus more on the business logic rather than the specifics of service communication.
