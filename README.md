# Selenium Web Automation Practice Framework

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://www.java.com)
[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat&logo=selenium&logoColor=white)](https://selenium.dev)
[![Cucumber](https://img.shields.io/badge/Cucumber-BDD-23D96C?style=flat&logo=cucumber&logoColor=white)](https://cucumber.io)
[![TestNG](https://img.shields.io/badge/TestNG-FF6C37?style=flat)](https://testng.org)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)](https://maven.apache.org)
[![CI](https://img.shields.io/badge/CI-GitHub%20Actions-2088FF?style=flat&logo=githubactions&logoColor=white)](https://github.com/Maiitarek/AutomationPractice/actions)

A structured Selenium WebDriver automation framework built with Java, Cucumber BDD, and TestNG. Targets a demo e-commerce web application to demonstrate real-world automation patterns used in production QA environments.

---

## Table of contents

- [Overview](#overview)
- [Tech stack](#tech-stack)
- [Framework architecture](#framework-architecture)
- [Folder structure](#folder-structure)
- [Prerequisites](#prerequisites)
- [How to run](#how-to-run)
- [Test scenarios covered](#test-scenarios-covered)
- [Test reporting](#test-reporting)
- [CI/CD](#cicd)

---

## Overview

This framework demonstrates production-grade Selenium automation practices including:

- **Page Object Model (POM)** for maintainable, reusable UI interaction code
- **BDD with Cucumber** for human-readable test scenarios
- **TestNG** for test execution, grouping, and parallel run configuration
- **Maven** for dependency management and build lifecycle
- **GitHub Actions** CI pipeline that runs tests on every push

---

## Tech stack

| Layer | Technology |
|---|---|
| Language | Java 11+ |
| Browser automation | Selenium WebDriver 4.x |
| BDD framework | Cucumber 7.x |
| Test runner | TestNG |
| Build tool | Maven |
| Reporting | Allure / Cucumber HTML |
| Browser driver mgmt | WebDriverManager |

---

## Framework architecture

```
┌─────────────────────────────────────────────────────┐
│               Feature Files (.feature)              │
│           Written in plain Gherkin syntax            │
└──────────────────────┬──────────────────────────────┘
                       │
┌──────────────────────▼──────────────────────────────┐
│                 Step Definitions                     │
│       Binds Gherkin steps to Java action methods     │
└──────────┬──────────────────────────────────────────┘
           │
┌──────────▼──────────────────────────────────────────┐
│                  Page Objects                        │
│   One class per page — locators + interaction methods│
└──────────┬──────────────────────────────────────────┘
           │
┌──────────▼──────────────────────────────────────────┐
│               Base Page / Base Test                  │
│    Driver init, waits, common actions, teardown      │
└─────────────────────────────────────────────────────┘
```

---

## Folder structure

```
AutomationPractice/
├── src/
│   └── test/
│       ├── java/
│       │   ├── pages/              # Page Object classes
│       │   ├── stepDefinitions/    # Cucumber step definitions
│       │   ├── hooks/              # Before/After test hooks
│       │   ├── runners/            # TestNG Cucumber runner classes
│       │   └── utils/              # Driver manager, config reader, helpers
│       └── resources/
│           ├── features/           # Gherkin .feature files
│           └── config.properties   # Base URL, browser, timeout settings
├── pom.xml
└── README.md
```

---

## Prerequisites

| Requirement | Version |
|---|---|
| Java JDK | 11 or higher |
| Maven | 3.6+ |
| Chrome / Firefox | Latest |

> WebDriverManager handles browser driver downloads automatically — no manual ChromeDriver setup needed.

---

## How to run

**Clone the repository**
```bash
git clone https://github.com/Maiitarek/AutomationPractice.git
cd AutomationPractice
```

**Run all tests**
```bash
mvn clean test
```

**Run by tag**
```bash
mvn clean test -Dcucumber.filter.tags="@smoke"
mvn clean test -Dcucumber.filter.tags="@regression"
```

**Run headless (CI mode)**
```bash
mvn clean test -Dheadless=true
```

---

## Test scenarios covered

| Module | Scenarios |
|---|---|
| Authentication | Login (valid/invalid), logout, session persistence |
| Product search | Keyword search, filters, sorting |
| Shopping cart | Add/remove items, quantity update, price validation |
| Checkout | Address form, payment (test mode), order confirmation |
| User account | Profile update, order history |

---

## Test reporting

Cucumber HTML report generated at:
```
target/cucumber-reports/cucumber.html
```

---

## CI/CD

GitHub Actions runs the full test suite on every push to `main`.  
See [`.github/workflows/test.yml`](.github/workflows/test.yml).

---

## Author

**Mai Ibrahim** — Senior SDET / QA Engineer  
[LinkedIn](https://www.linkedin.com/in/mai-tarek/) · [GitHub](https://github.com/maiitarek)
