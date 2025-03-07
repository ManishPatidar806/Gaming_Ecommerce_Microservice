
# Gameingzone  (E-Commerce Platform for Gaming Products)

## Overview

This project is a microservices-based e-commerce platform designed for purchasing gaming products. Users can create accounts, view their purchase history, and manage their carts by adding or removing products. The platform also supports password recovery, account deletion, and a review system. Secure payments are enabled via Stripe integration.

## Features

- User authentication and account management (signup, login, password recovery, account deletion)
- Product catalog browsing and cart management
- Order history tracking
- User review system for products
- Secure online payments with Stripe
- Email verification via Spring Boot Starter Mail
- Cloud-based product image storage using Cloudinary
- Service monitoring and health checks with Codecentric Admin Server

## Tech Stack

### Frontend:

- React.js for the user interface
- Axios for API requests
- Flowbite for UI components

### Backend:

- Spring Boot for building microservices
- Spring Data JPA for database management
- Spring Security for authentication
- MySQL as the database
- Spring Boot Starter Mail for email notifications
- Cloudinary for storing product images

### Microservices Architecture:

- Spring Cloud Netflix Eureka for service registry
- FeignClient for inter-service communication
- Spring Cloud Gateway for API management
- Service Registry for microservice discovery and management
- Stripe for secure payments


## Microservices 

![Screenshot from 2025-03-06 22-05-34](https://github.com/user-attachments/assets/19084fff-01ad-4954-ae46-065220964abf)


## Microservices Structure

The system follows a microservices architecture, with multiple services communicating via FeignClient:

- **Authentication Service** - Manages user authentication and authorization
- **Product Service** - Handles product data and inventory
- **Cart-Order Service** - Manages shopping cart and order processing
- **Forgot-Password Service** - Provides password recovery functionality
- **Review Service** - Handles user reviews and ratings
- **Payment Service** - Integrates Stripe for secure payments

## System Workflow

- Users send requests via the API Gateway (Spring Cloud Gateway), which routes and filters API calls.
- The Service Registry (Netflix Eureka) registers and discovers services dynamically.
- Each microservice communicates using FeignClient for inter-service requests.
- Data is stored in a MySQL database and product images are managed via Cloudinary.
- Payments are securely processed using Stripe Payment Gateway.
- The system is monitored using Codecentric Admin Server to ensure service availability and health checks.

## Installation & Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/ecommerce-microservices.git
    ```
2. Navigate to the project directory and set up each microservice.
3. Configure the database in `application.properties`.
4. Start the Service Registry (Eureka Server) first.
5. Start the microservices one by one.
6. Start the API Gateway.

## Deployment

The microservices are deployed on Render, with a single instance running different services on separate ports.


## License

This project is open-source and available under the MIT License.
