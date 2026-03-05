# Palindrome Checker – Data Structures, OOPS & Design Patterns

## 👨‍💻 Author
**Risikesh Somnath T**  
📧 risisonu2006@gmail.com

---

## 📌 Project Description

This project is a structured practice session completed as part of my **placement training preparation**.

The objective was not just to check whether a string is a palindrome, but to explore and implement multiple algorithmic approaches, data structures, object-oriented principles, and design patterns while solving the same problem.

Each version (Use Case) demonstrates a different computational concept and architectural improvement.

---

## 🎯 What This Project Demonstrates

- Algorithm design
- Data structure comparison
- Space and time complexity analysis
- Object-Oriented Programming (OOPS)
- Design Patterns (Strategy Pattern)
- Runtime performance benchmarking

---

## 📚 Implemented Approaches

### 1️⃣ Two Pointer Technique
- In-place character comparison
- Time Complexity: O(n)
- Space Complexity: O(1)
- Most space-efficient approach

---

### 2️⃣ Stack-Based Approach (LIFO)
- Uses `push()` and `pop()`
- Demonstrates Last-In-First-Out behavior
- Time: O(n)
- Space: O(n)

---

### 3️⃣ Queue-Based Comparison (FIFO vs LIFO)
- Demonstrates behavioral difference between Stack and Queue
- Time: O(n)
- Space: O(n)

---

### 4️⃣ Deque-Based Approach
- Double-ended access
- Removes first and last directly
- Time: O(n)
- Space: O(n)

---

### 5️⃣ Singly Linked List Approach
- Fast and slow pointer technique
- In-place reversal of second half
- Time: O(n)
- Space: O(1)

---

### 6️⃣ Recursive Approach
- Uses call stack
- Base condition prevents infinite recursion
- Time: O(n)
- Space: O(n) due to call stack

---

### 7️⃣ String Preprocessing
- Ignores spaces and special characters
- Case-insensitive comparison
- Uses regular expressions

---

### 8️⃣ Encapsulation (OOPS)
- Created dedicated `PalindromeChecker` class
- Public `checkPalindrome()` method
- Internal logic hidden
- Demonstrates:
  - Encapsulation
  - Single Responsibility Principle

---

### 9️⃣ Strategy Pattern Implementation
- Defined `PalindromeStrategy` interface
- Implemented:
  - `StackStrategy`
  - `DequeStrategy`
  - `TwoPointerStrategy`
- Runtime algorithm selection
- Demonstrates:
  - Interface
  - Polymorphism
  - Strategy Pattern

---

### 🔟 Performance Benchmarking
- Uses `System.nanoTime()`
- Compares execution time of different strategies
- Demonstrates practical algorithm comparison

---

## 🧠 Key Concepts Covered

- Arrays
- Stack
- Queue
- Deque
- Singly Linked List
- Recursion
- Call Stack
- Encapsulation
- Polymorphism
- Strategy Pattern
- Runtime performance analysis

---

## ⚙️ How to Run

### Compile:

javac *.java
Run:
java PalindromeCheckerApp

## 📊 Learning Outcome

- This project strengthened my understanding of:

- Solving the same problem using different data structures

- Trade-offs between time and space complexity

- Clean code organization using OOPS

- Practical implementation of design patterns 

- Comparing algorithm performance in real execution

## 🚀 Purpose

- This repository is part of my placement training practice to strengthen:

- Data Structures & Algorithms

- Core Java concepts

- Object-Oriented Design

- Problem-solving skills

## 📩 Contact

If you would like to connect or discuss improvements:

- Risikesh Somnath T
- 📧 risisonu2006@gmail.com