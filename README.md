# Event-Driven Microservices using Kafka (Spring Boot)

## 📌 Overview

This project demonstrates communication between microservices using
Apache Kafka instead of REST.

It consists of: - **Order Service (Producer)** → Sends order events -
**Payment Service (Consumer)** → Processes order events

------------------------------------------------------------------------

## 🧩 Architecture

Client → Order Service → Kafka → Payment Service

------------------------------------------------------------------------

## 🔄 Kafka Flow

1.  Client sends POST request to Order Service
2.  Order Service creates OrderEvent
3.  Event is serialized to JSON
4.  Kafka stores event in topic (order-topic)
5.  Payment Service listens using @KafkaListener
6.  JSON is deserialized into OrderEvent
7.  Payment processing is done
8.  Offset is committed

------------------------------------------------------------------------

## ⚙️ Technologies

-   Spring Boot
-   Spring Kafka
-   REST API
-   JSON Serialization

------------------------------------------------------------------------

## ▶️ How to Run

### 1. Start Kafka using Docker


 docker run -p 9092:9092 apache/kafka

### 2. Run Services

-   Start Payment Service
-   Start Order Service

### 3. Test API

    POST http://localhost:8080/orders

------------------------------------------------------------------------

## 💡 Key Features

-   Asynchronous communication
-   Loose coupling
-   Fault tolerance
-   Scalability

------------------------------------------------------------------------


