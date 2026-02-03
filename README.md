# API Test Automation Framework

This repository contains a scalable and maintainable **API Test Automation Framework** built using **Java, Rest Assured, TestNG, and Maven**.

The framework is designed following best practices such as modular structure, reusable components, and environment-based configuration.

---

## 🚀 Tech Stack

- Java
- Rest Assured
- TestNG
- Maven
- Jackson / Gson (JSON parsing)
- Allure Report (optional)
- GitHub Actions (CI ready)

---

## 📁 Project Structure

API-Automation
│
├── src
│ ├── main
│ │ ├── java
│ │ │ ├── config
│ │ │ ├── models
│ │ │ ├── services
│ │ │ ├── utils
│ │
│ ├── test
│ │ ├── java
│ │ │ ├── tests
│ │ │ ├── base
│
├── testng.xml
├── pom.xml
├── README.md


---

## ⚙️ Framework Features

- Reusable request specification
- Environment-based configuration
- POJO model usage for request/response
- Centralized base test structure
- Clean service layer abstraction
- TestNG suite execution support
- Reporting integration ready
- CI/CD friendly design

---

## 🧪 Test Design Approach

- Positive test scenarios
- Negative test scenarios
- Schema validation
- Response body validation
- Status code verification
- Header validation

---

## ▶️ How To Run Tests

### Run all tests

mvn clean test


---

### Run specific TestNG suite

mvn test -DsuiteXmlFile=testng.xml


---

### Run tests from IDE

- Run test classes directly
- Run TestNG suite file
- Run individual test methods

---

## 🌍 Environment Configuration

Configuration values such as base URL, authentication details, and environment parameters are stored in configuration files.

This allows:

- Running tests across multiple environments
- Easy configuration management
- Separation of test logic and environment data

---

## 📊 Reporting

The framework supports test reporting integrations such as:

- TestNG Reports
- Allure Reports (optional integration)

---

## 🔄 CI/CD Integration

The project is designed to run seamlessly in CI pipelines.

Example execution:

mvn clean test


The framework can be integrated into:

- GitHub Actions
- Jenkins
- GitLab CI
- Azure DevOps

---

## 📌 Design Principles

- Maintainability
- Readability
- Reusability
- Scalability
- Clean architecture

---

## 👤 Author

Serdar  
QA Engineer – Test Automation  

📫 LinkedIn  
https://www.linkedin.com/in/serdaralpyaylali/

📫 Email  
serdaralpyaylali@gmail.com
