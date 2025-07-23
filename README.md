# JavaTodoListApplication

Elegant Todo List web application built with Spring Boot, H2 database, JPA, and a modern Tailwind CSS frontend.

## Features

- Add, edit, delete, and mark tasks as completed
- Filter tasks by all, active, or completed
- Responsive and stylish UI with Tailwind CSS
- RESTful API for todo list management
- In-memory H2 database for easy setup

## Getting Started

### Prerequisites

- Java 17+
- Maven

### Running the Application

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/JavaTodoListApplication.git
    cd JavaTodoListApplication
    ```

2. Build and run:
    ```sh
    ./mvnw spring-boot:run
    ```

3. Open [http://localhost:8080](http://localhost:8080) in your browser.

### API Endpoints

- `GET /` - List all todos
- `POST /create` - Create a new todo
- `PATCH /update/{id}` - Update a todo
- `GET /get/{id}` - Get a todo by ID
- `DELETE /delete/{id}` - Delete a todo
- `GET /completed` - List completed todos

### Database

Uses H2 in-memory database. Access the H2 console at [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
Default JDBC URL: `jdbc:h2:mem:tododb`

## Project Structure

- `src/main/java/com/uevo/JavaTodoListApplication/` - Java source code
- `src/main/resources/static/index.html` - Frontend UI
- `src/main/resources/application.yml` - Spring Boot configuration

## License

This project is licensed under the Apache License 2.0.