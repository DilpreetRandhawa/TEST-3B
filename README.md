# Dilpreet's Pizza Ordering System

## Overview

This is a JavaFX-based desktop application for managing pizza orders. It allows users to enter customer details, choose pizza sizes and toppings, calculate total bills (including HST), and perform CRUD operations (Create, Read, Update, Delete) on pizza orders stored in a MySQL database.

## Features

- JavaFX GUI with input fields for customer name, mobile number, pizza size, and number of toppings
- Pizza size selection (XL, L, M, S)
- Dynamic total bill calculation based on size and toppings (with 15% HST)
- CRUD operations: Add, view, update, and delete pizza orders
- TableView to display all pizza orders
- MySQL database integration using JDBC
- DAO and ORM patterns for data access
- JUnit testing for billing logic

## Technologies Used

- Java 17+
- JavaFX
- MySQL
- JDBC
- JUnit 5
- MVC Architecture
- DAO Pattern

## Bill Calculation Logic

- **Pizza Base Prices:**
  - XL: $15.00
  - L: $12.00
  - M: $10.00
  - S: $8.00
- **Topping:** $1.50 each
- **Tax:** 15% HST on the subtotal

**Formula:**  
`Total = (Base Price + (Toppings × 1.50)) × 1.15`

**Example:**  
An XL pizza with 2 toppings:  
`(15 + 3) × 1.15 = $20.70`

## Database Schema

**Table:** `pizza_orders`

| Field Name      | Data Type     |
|-----------------|---------------|
| id              | INT (PK, AI)  |
| customer_name   | VARCHAR(100)  |
| mobile_number   | VARCHAR(15)   |
| pizza_size      | VARCHAR(2)    |
| toppings        | INT           |
| total_bill      | DECIMAL(10,2) |

## How to Run

1. Import the project in your IDE (e.g., IntelliJ IDEA, Eclipse)
2. Ensure JavaFX is configured
3. Create the database and table using the provided SQL script
4. Update DB connection settings in `PizzaOrderDAO.java`
5. Run the `Main.java` file to launch the application

## JUnit Testing

Located in `test/BillCalculatorTest.java`, this class tests the correctness of the bill calculation for different pizza sizes and topping combinations.

Example test:
```java
@Test
void testXLWith2Toppings() {
    double result = BillCalculator.calculate("XL", 2);
    assertEquals(20.7, result, 0.01);
}
