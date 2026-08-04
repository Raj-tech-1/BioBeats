# SmartCare Client 🚑 | React Frontend for Smart Patient Monitoring System

## Overview

**SmartCare Client** is the frontend application for the **Smart Patient Monitoring System**, developed using **React** and **Vite**. The application provides an intuitive interface for patients, healthcare professionals, and administrators to monitor health data, interact with AI-powered services, and manage patient information in real time.

The frontend communicates with the backend microservices through the **Spring Cloud API Gateway**, enabling secure and scalable access to healthcare services.

---

# Tech Stack

### Frontend

* React 18
* Vite
* JavaScript (ES6+)
* HTML5
* CSS3

### API Integration

* REST APIs
* Axios

### Backend Connectivity

* Spring Cloud API Gateway
* Spring Boot Microservices

---

# Features

* Responsive user interface
* Secure authentication workflow
* Patient dashboard
* Real-time health monitoring interface
* IoT sensor data visualization
* AI chatbot integration
* AI-generated vital reports
* REST API integration with backend microservices
* Modular component-based architecture
* Fast development using Vite Hot Module Replacement (HMR)

---

# Project Structure

```text
smartcare-client/
│
├── public/
├── src/
│   ├── assets/
│   ├── components/
│   ├── pages/
│   ├── services/
│   ├── hooks/
│   ├── utils/
│   ├── App.jsx
│   └── main.jsx
│
├── package.json
├── vite.config.js
└── README.md
```

---

# Installation

Install project dependencies:

```bash
npm install
```

---

# Running the Application

Start the development server:

```bash
npm run dev
```

Build for production:

```bash
npm run build
```

Preview the production build:

```bash
npm run preview
```

---

# Backend Integration

The frontend communicates with the backend through the API Gateway.

Example:

```text
http://localhost:8088
```

The gateway routes requests to the respective microservices, including:

* Authentication Service
* Patient Management Service
* IoT Service
* AI Chatbot Service
* Vital Reports Service

---

# Application Highlights

* Component-based React architecture
* Clean and reusable UI components
* Optimized development workflow using Vite
* RESTful API integration
* Responsive design across desktop and mobile devices
* Scalable folder structure for future feature expansion
* Easy integration with cloud-native backend services

---

# Future Enhancements

* Role-based dashboards
* Dark mode support
* Push notifications
* Real-time patient alerts using WebSockets
* Progressive Web App (PWA) support
* Offline data synchronization
* Multi-language support
* Advanced analytics dashboard

---

# Author

**Saket Raj**

Designed and developed the frontend of the **Smart Patient Monitoring System** using React and Vite. The application focuses on delivering a responsive user experience while seamlessly integrating with a Spring Boot microservices backend through a centralized API Gateway.
