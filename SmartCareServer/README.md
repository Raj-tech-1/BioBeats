# SmartCareServer 🚑 | Microservices-Based Smart Patient Monitoring Backend

## Overview

**SmartCareServer** is a cloud-native microservices backend developed for a **Smart Patient Monitoring System** that enables secure patient management, IoT sensor data processing, AI-powered health report generation, and chatbot-assisted healthcare support.

The system follows a **microservices architecture** using **Spring Boot**, with **Netflix Eureka** for service discovery, **Spring Cloud Gateway** for API routing, **Apache Kafka** for asynchronous communication, and **Docker Compose** for containerized deployment. Monitoring and observability are implemented using **Prometheus**, **Grafana**, and **Spring Boot Actuator**.

---

## Architecture

```
                        Client Applications
                               │
                               ▼
                     Spring Cloud Gateway
                               │
        ┌───────────────┬───────────────┬───────────────┐
        ▼               ▼               ▼               ▼
 Main Service      IoT Service     Chatbot Service   Vital Reports
        │               │               │               │
        └───────────────┴──────Kafka────┴───────────────┘
                               │
                        Eureka Discovery
                               │
                 Prometheus + Grafana Monitoring
```

Each microservice is independently deployable, registered with Eureka, and communicates through REST APIs and Kafka event streams.

---

# Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Cloud
* Spring Data JPA
* Spring Security
* Spring Boot Actuator
* Maven

### Microservices

* Netflix Eureka Server
* Spring Cloud Gateway
* Apache Kafka
* Zookeeper

### Databases

* MySQL
* PostgreSQL

### Monitoring

* Prometheus
* Grafana

### DevOps

* Docker
* Docker Compose

---

# Microservices

| Service               | Description                                              | Port |
| --------------------- | -------------------------------------------------------- | ---- |
| Discovery Server      | Eureka Service Registry                                  | 8761 |
| API Gateway           | Centralized API Routing & Request Forwarding             | 8088 |
| Main Service          | Patient Management, Authentication & Core Business Logic | 8080 |
| IoT Service           | Sensor Data Collection & Processing                      | 8082 |
| Chatbot Backend       | AI Chatbot APIs                                          | 8081 |
| Vital Reports Service | AI-Based Health Report Generation                        | 8083 |

---

# Infrastructure Services

| Service    | Port |
| ---------- | ---- |
| MySQL      | 3306 |
| PostgreSQL | 5432 |
| Kafka      | 9092 |
| Zookeeper  | 2181 |
| Prometheus | 9090 |
| Grafana    | 3001 |

---

# Key Features

* Microservices-based distributed architecture
* Centralized API Gateway for request routing
* Dynamic service registration and discovery using Eureka
* Event-driven communication using Apache Kafka
* Separate databases for independent services
* AI-powered vital report generation
* IoT sensor data ingestion and processing
* Healthcare chatbot backend integration
* Containerized deployment using Docker Compose
* Real-time monitoring with Prometheus and Grafana
* Health endpoints exposed through Spring Boot Actuator

---

# Service Communication

### Synchronous Communication

* REST APIs through Spring Cloud Gateway
* Service discovery handled by Eureka

### Asynchronous Communication

Apache Kafka is used for event-driven communication between services, enabling loose coupling and improved scalability for healthcare events and sensor updates.

---

# Monitoring & Observability

The project integrates Spring Boot Actuator with Prometheus for application metrics collection.

Metrics include:

* JVM Memory Usage
* CPU Utilization
* HTTP Request Statistics
* Application Health
* Service Availability

Grafana dashboards visualize these metrics for real-time system monitoring.

---

# Environment Configuration

Environment variables are managed through a root `.env` file.

Example:

```env
MYSQL_DATABASE=smartcare_db
MYSQL_ROOT_PASSWORD=********

POSTGRES_DB=sensordb
POSTGRES_USER=postgres
POSTGRES_PASSWORD=********

JWT_SECRET=********

GEMINI_API_KEY=********
```

Sensitive credentials are externalized to avoid hardcoding secrets inside the source code.

---

# Running the Project

### Build all services

```bash
mvn clean package -DskipTests
```

### Start all containers

```bash
docker compose up --build
```

### Run in detached mode

```bash
docker compose up -d --build
```

### Stop containers

```bash
docker compose down
```

### Remove containers and volumes

```bash
docker compose down -v
```

---

# Project Structure

```text
SmartCareServer
│
├── apigateway
├── discoveryserver
├── mainservice
├── iot-service
├── chatbotbackend
├── vitalreports
├── prometheus
│   └── prometheus.yml
├── docker-compose.yml
├── .env
└── README.md
```

---

# API Endpoints

| Service          | Base URL              |
| ---------------- | --------------------- |
| API Gateway      | http://localhost:8088 |
| Eureka Dashboard | http://localhost:8761 |
| Prometheus       | http://localhost:9090 |
| Grafana          | http://localhost:3001 |

---

# Future Improvements

* Kubernetes deployment
* Distributed tracing with Zipkin
* Centralized configuration using Spring Cloud Config
* JWT-based authentication across services
* CI/CD pipeline using GitHub Actions
* ELK Stack for centralized logging
* Redis caching layer
* OpenAPI/Swagger documentation
* Resilience4j for circuit breaking and fault tolerance

---

# Author

**Saket Raj**

Designed and developed the backend architecture for a distributed **Smart Patient Monitoring System** using Spring Boot Microservices. The project demonstrates scalable backend development, event-driven communication, containerized deployment, and production-ready monitoring using modern cloud-native technologies.
