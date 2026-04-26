# 🏦 Banking Application

A production-grade **RESTful Banking Backend** built with **Spring Boot**, **Hibernate ORM**, and **MySQL** — designed to handle core banking operations with data integrity and reliability.

---

## 📌 Features

| Module | Description |
|---|---|
| 🔐 Authentication | Secure user login and account access |
| 🏧 Account Management | Create and manage bank accounts |
| 💸 Fund Transfer | Transfer funds between accounts with transaction safety |
| 💰 Balance Enquiry | Real-time balance checking via REST API |
| 📋 Transaction History | Complete audit trail of all transactions |

---

## 🛠️ Tech Stack

- **Language:** Java 8+
- **Framework:** Spring Boot, Spring MVC
- **ORM:** Hibernate / JPA
- **Database:** MySQL
- **Testing:** JUnit, Postman
- **Build Tool:** Maven

---

## 🏗️ Architecture
Client (Postman / Frontend)
        ↓
  REST Controller Layer
        ↓
    Service Layer
        ↓
  Repository Layer (JPA)
        ↓
    MySQL Database


---

## 📡 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/account/create` | Create a new bank account |
| GET | `/api/account/{id}/balance` | Check account balance |
| POST | `/api/transfer` | Transfer funds between accounts |
| GET | `/api/transactions/{id}` | View transaction history |
| POST | `/api/auth/login` | User authentication |

---

## ⚙️ How to Run Locally

### Prerequisites
- Java 8 or above
- MySQL installed and running
- Maven

### Steps
# 1. Clone the repository
git clone https://github.com/Mohana247-svg/BankingAPP.git
cd BankingAPP

# 2. Create MySQL database
CREATE DATABASE banking_db;

# 3. Update application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=your_username
spring.datasource.password=your_password

# 4. Build and run
mvn spring-boot:run

****
---

## 🧪 Testing

All REST APIs tested using **Postman**.
JUnit test cases written to validate service layer logic and ensure zero data discrepancies during concurrent transactions.

---

## 📂 Project Structure
BankingAPP/
├── src/
│   └── main/
│       └── java/com/banking/
│           ├── controller/    # REST Controllers
│           ├── service/       # Business Logic
│           ├── repository/    # JPA Repositories
│           ├── model/         # Entity Classes
│           └── config/        # App Configuration
├── pom.xml
└── README.md
# 4.Build and run
mvn spring-boot:run
