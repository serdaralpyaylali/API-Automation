API Automation Framework
Project Overview

This project is a scalable and maintainable API test automation framework developed using modern testing practices. The framework is designed to validate RESTful services with a clean architecture, reusable components, and CI/CD integration readiness.

The main goal of this project is to demonstrate best practices in automated API testing, including test design, data-driven testing, and reporting.

Tech Stack

Java

Rest Assured

TestNG

Maven

Allure Reporting

Jackson / Gson (JSON Serialization)

Log4j / SLF4J (Logging)

Features

Layered and maintainable test architecture

Request / Response abstraction

Reusable API client utilities

Data-driven test support

Configurable environments

Centralized logging and reporting

CI/CD friendly structure

Parallel test execution support

Project Structure
API-Automation
│
├── src/test/java
│   ├── tests
│   ├── base
│   ├── clients
│   ├── models
│   ├── utils
│   └── config
│
├── src/test/resources
│   ├── testdata
│   └── config files
│
├── pom.xml
└── testng.xml

Test Scope

The framework supports testing for:

Functional API validation

Schema validation

Negative testing scenarios

Authentication and authorization testing

Response time validations

Data-driven endpoint testing

Getting Started
Prerequisites

Java 11+

Maven 3+

Git

Installation

Clone repository:

git clone https://github.com/your-username/API-Automation.git


Navigate to project directory:

cd API-Automation


Install dependencies:

mvn clean install

Running Tests

Run all tests:

mvn test


Run with TestNG suite:

mvn test -DsuiteXmlFile=testng.xml

Reporting

After test execution, Allure reports can be generated using:

allure serve target/allure-results

Configuration Management

Environment configurations are managed via property files located under:

resources/config


Different environments such as QA, Staging, and Production can be configured easily.

Logging

Logging is implemented to provide detailed request-response information and debugging support.

CI/CD Integration

The framework is designed to be integrated with:

Jenkins

GitHub Actions

GitLab CI

Documentation

Test Strategy → TEST_STRATEGY.md

Architecture Design → ARCHITECTURE.md

Definition of Done → DEFINITION_OF_DONE.md

Future Improvements

Contract testing integration

Dockerized execution

Performance test integration

Test data management service

OpenAPI schema driven test generation

Contribution

Contributions are welcome. Please follow project standards before submitting pull requests.

Author

Developed for demonstrating professional API test automation practices.
