# ❤️ BioBeats
### AI-Powered Smart Patient Monitoring System

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![React](https://img.shields.io/badge/React-18-blue)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED)
![Kafka](https://img.shields.io/badge/Kafka-Streaming-black)
![AI](https://img.shields.io/badge/AI-ECG%20Analysis-red)

---

# 🫀 Overview

BioBeats is an AI-powered distributed healthcare platform designed for intelligent cardiac monitoring and patient management.

The platform combines **IoT sensors**, **Artificial Intelligence**, **Microservices**, **Cloud-native technologies**, and **Real-Time Monitoring** into a scalable healthcare ecosystem capable of assisting healthcare professionals with ECG analysis, patient monitoring, report generation, and conversational medical assistance.

Unlike traditional monolithic healthcare applications, BioBeats adopts a distributed microservices architecture, allowing independent scalability, fault isolation, and modular deployment.

---

# 🎯 Objectives

- Real-time ECG monitoring
- AI-based ECG analysis
- IoT sensor integration
- Secure patient management
- Intelligent chatbot assistance
- Health report generation
- Scalable microservice architecture
- Cloud-native deployment

---

# 🏗 Complete Architecture

```text
                        +----------------------+
                        |     React Client     |
                        +----------+-----------+
                                   |
                                   |
                         HTTP / REST APIs
                                   |
                                   ▼
                     +---------------------------+
                     |     Spring Cloud Gateway  |
                     +------------+--------------+
                                  |
        --------------------------------------------------------
        |              |              |             |            |
        ▼              ▼              ▼             ▼            ▼

 Discovery      Main Service    Chatbot API   IoT Service   AI Service
 (Eureka)          │               │             │             │
                   │               │             │             │
                   ▼               ▼             ▼             ▼
             PostgreSQL       Gemini API     ESP32 Sensors   TensorFlow
                   │               │             │             │
                   └---------------┴-------------┴-------------┘
                                   │
                                   ▼
                            Health Reports
```

---

# 🏛 Microservice Architecture

```text
Frontend
      │
      ▼
Spring Cloud Gateway
      │
 ┌────┼────────────────────────────┐
 │    │        │        │          │
 ▼    ▼        ▼        ▼          ▼

Main Chatbot IoT AI Discovery

```

---

# ❤️ ECG AI Workflow

```text
Patient ECG
      │
      ▼
Preprocessing
      │
      ▼
Feature Extraction
      │
      ▼
Machine Learning Model
      │
      ▼
Prediction
      │
      ▼
Health Report
      │
      ▼
Doctor Dashboard
```

---

# 📡 IoT Data Flow

```text
ESP32

↓

Pulse Sensor

↓

Body Temperature

↓

REST API

↓

Spring Boot

↓

Database

↓

Dashboard

↓

Doctor
```

---

# 🤖 Chatbot Flow

```text
Patient Question

↓

Spring Boot Chat Service

↓

Gemini API

↓

Medical Response

↓

Patient
```

---

# 🐳 Docker Architecture

```text
               Docker Compose

         │

──────────────────────────────────────

 Gateway

 Main Service

 Chatbot Service

 AI Service

 IoT Service

 Discovery Server

 PostgreSQL

 Prometheus

 Grafana

──────────────────────────────────────
```

---

# 📂 Repository Structure

```text
BioBeats/

│

├── Frontend/

├── SmartCareServer/

│ ├── apigateway/

│ ├── chatbotbackend/

│ ├── discoveryserver/

│ ├── IOT_service/

│ ├── mainservice/

│ ├── vitalReports-AI/

│ ├── docker-compose.yml

│ └── README.md

```

---

# 🚀 Features

### Patient Management

- Secure Authentication
- Profile Management
- Patient Records

### ECG Analysis

- AI-powered ECG prediction
- Signal preprocessing
- Disease classification

### IoT Monitoring

- Pulse Rate
- Temperature
- Sensor Monitoring

### AI

- Health Report Generation
- ECG Prediction
- Intelligent Recommendations

### Chatbot

- Natural Language Understanding
- Medical Q&A
- Healthcare Assistance

### Monitoring

- Prometheus
- Grafana
- Spring Boot Actuator

---

# 🛠 Tech Stack

| Category | Technology |
|------------|----------------|
| Frontend | React, Vite |
| Backend | Spring Boot |
| API Gateway | Spring Cloud Gateway |
| Discovery | Eureka |
| Messaging | Kafka |
| AI | Python, TensorFlow |
| Database | PostgreSQL |
| Monitoring | Prometheus, Grafana |
| Container | Docker |
| Version Control | Git |

---

# 📊 Request Flow

```text
Client

↓

Gateway

↓

Authentication

↓

Microservice

↓

Database

↓

Response
```

---

# 🔐 Security

- Spring Security
- JWT Authentication
- API Gateway Routing
- Secure REST APIs

---

# 📈 Monitoring

- Prometheus Metrics
- Grafana Dashboards
- Health Checks
- JVM Monitoring
- CPU Monitoring
- Memory Monitoring

---

# ⚙ Installation

```bash
git clone https://github.com/Raj-tech-1/BioBeats.git

cd BioBeats
```

### Backend

```bash
cd SmartCareServer
docker-compose up
```

### Frontend

```bash
cd Frontend
npm install
npm run dev
```

---

# 📷 Screenshots

> Add screenshots here

- Login
- Dashboard
- ECG Analysis
- Reports
- Chatbot
- Monitoring Dashboard

---

# 🔮 Future Enhancements

- Wearable ECG Support
- Mobile Application
- Doctor Portal
- Cloud Deployment
- Kubernetes
- CI/CD Pipeline
- Deep Learning Models
- HL7/FHIR Integration

---

# 👨‍💻 Authors

**Saket Raj**

Computer Science Engineering

SJBIT Bangalore

---

# ⭐ Star this Repository

If you found this project useful, consider giving it a ⭐ on GitHub.
