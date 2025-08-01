# Camunda Zeebe Worker - Java Spring Boot

This repository contains a **Camunda 8 Worker** built with **Java and Spring Boot**, designed to handle external tasks from multiple BPMN processes in a modular and scalable way.

## 🚀 Features

- 🔄 Listens for tasks across multiple BPMN workflows in Camunda 8
- ✅ Dynamic task dispatching based on topic
- ♻️ Extensible architecture leveraging Spring annotations
- 🧪 Ready for unit and integration testing

## 📦 Requirements

- Java 17+
- Maven 3.8+
- Docker (optional, to run Camunda locally)
- Camunda 8 (Self-Managed or SaaS)

## ⚙️ Installation

```bash
git clone https://github.com/your_username/camunda-worker-springboot.git
cd camunda-worker-springboot
./mvnw clean install
