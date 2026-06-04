# Tax Calculator System

A command-line based Java application developed to calculate different types of taxes and leasing payments. This system simplifies complex tax calculations and provides an easy-to-use menu-driven interface.

## 📌 Project Overview

This project was developed using Java as a CLI (Command Line Interface) application. It allows users to calculate taxes under multiple categories and perform leasing-related calculations with input validation.

## 🚀 Features

### 1. Withholding Tax
Includes three categories:

- **Rent Tax**
  - 10% tax for payments above Rs.100,000
  - No tax below Rs.100,000

- **Bank Interest Tax**
  - 5% tax on annual bank interest

- **Dividend Tax**
  - 14% tax for dividends above Rs.100,000
  - No tax below Rs.100,000

### 2. Payable Tax
Calculates monthly payable tax based on salary brackets.

### 3. Income Tax
Calculates annual income tax using progressive tax rates.

### 4. Social Security Contribution Levy (SSCL) Tax
Calculates:

- Sale Tax (2.5%)
- VAT (15%)
- Total SSCL Tax

### 5. Leasing Payment System

#### Calculate Monthly Installment
Calculate monthly lease payments using leasing formulas.

#### Search Leasing Categories
Displays installment plans for:

- 3 Years
- 4 Years
- 5 Years

#### Find Leasing Amount
Calculates maximum leasing amount based on:

- Monthly payment
- Interest rate
- Years

---

## 🛠 Technologies Used

- Java
- Scanner Class
- Command Line Interface (CLI)
- Object-Oriented Programming Concepts

---

## 📂 Project Structure

```text
Tax-Calculator-System/
│
├── TaxCalculator.java
├── README.md
```

---

## ⚙️ Installation & Run

### Clone Repository

```bash
git clone <repository-link>
```

### Compile Program

```bash
javac TaxCalculator.java
```

### Run Program

```bash
java TaxCalculator
```

---

## ✅ Input Validation

The system validates:

- Negative values are not accepted
- Taxable amounts must be valid
- Interest rates must be greater than 0
- Leasing years cannot exceed 5 years

---

## 🧮 Formula Used

### Monthly Leasing Installment Formula

Monthly Installment:

```
A × i / (1 − (1 / (1+i)^n))
```

Where:

- `A` = Lease Amount
- `i` = Annual Interest / 12
- `n` = Number of Months

---

## 📸 System Modules

- Home Page Menu
- Withholding Tax Menu
- Payable Tax Calculator
- Income Tax Calculator
- SSCL Tax Calculator
- Leasing Payment Menu

---

## 🎯 Learning Outcomes

- Java Programming
- CLI Application Development
- Input Validation
- Mathematical Calculations
- Menu-Driven Systems
- Problem Solving

---

## 👩‍💻 Author

**Chathurani Thuduwage**

Institute of Computer Engineering Technology
