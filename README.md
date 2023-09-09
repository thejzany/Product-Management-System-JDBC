# Product Management System using JDBC

The JDBC-Based Product Management System is a Java application that enables businesses to manage customer and product details, storing them in a MySQL database. This project adheres to modern system design principles, employing concepts like Data Access Objects (DAOs), Data Transfer Objects (DTOs), Services, Controllers, and Configuration helpers.


## Introduction

The JDBC-Based Product Management System simplifies the process of managing customer and product data, providing CRUD (Create, Read, Update, Delete) operations for efficient data manipulation. It emphasizes robust data validation, error handling, and separation of concerns through a well-structured architecture.

## Features

- **Customer and Product Operations:** Perform Create, Read, Update, and Delete operations for both customer and product data.
- **Robust Error Handling:** Comprehensive error handling to ensure data integrity and system stability.
- **Layered Architecture:** Separation of concerns using DAOs, DTOs, Services, Controllers, and Configuration helpers.
- **Database Integration:** Utilizes MySQL for efficient and reliable data storage.
- **Configurable Settings:** Easily configure the database connection via helper classes.

## System Design

The system follows a layered architecture:

- **Data Access Objects (DAOs):** Handle database interaction, SQL queries, and database connections.
- **Data Transfer Objects (DTOs):** Simple Java objects for data transfer between layers.
- **Services:** Contain business logic and interact with DAOs for database operations.
- **Controllers:** Manage HTTP requests, validate input, and invoke services to process requests.
- **Configuration (Helper):** Manage database connection configuration and other application-wide settings.

## Technologies Used

- Java 
- JDBC for database connectivity
- MySQL for database management
- Git for version control



