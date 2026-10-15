# BioBeats — Distributed Healthcare and ECG Analysis Platform

BioBeats is a healthcare platform designed to support patient workflows, IoT sensor monitoring, vital analysis and ECG-based classification.

## Technology Stack

- **Frontend:** React
- **Backend:** Java 17, Spring Boot, Spring Cloud Gateway
- **Service Discovery:** Eureka
- **Databases:** MySQL and PostgreSQL
- **ECG Analysis:** Python, TensorFlow/Keras
- **DevOps and Monitoring:** Docker, Docker Compose, Prometheus and GitHub Actions
- **Chatbot Integration:** Gemini API

## Architecture Overview

The React frontend communicates with backend services through Spring Cloud Gateway. Eureka supports service discovery between services.

The core application service handles healthcare workflows, while the IoT service manages sensor-related data. The vital-report workflow includes ECG processing and a Python-based model inference component.

## ECG Analysis Workflow

1. Read and preprocess ECG signal data.
2. Detect R-peaks and extract beat windows.
3. Pass the processed signal windows to a Keras CNN.
4. Return the model output to the application workflow.

## Limitations and Future Improvements

- Strengthen automated testing and validation.
- Improve configuration and secret management.
- Evaluate the ECG model using appropriate metrics and documented test data.
- Improve monitoring, error handling and service reliability.


