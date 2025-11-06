# Java Assignment 10 – Inheritance and Polymorphism

A Java console application that demonstrates **inheritance**, **method overriding**, and **polymorphism**.  
This assignment builds on previous lessons in object-oriented programming, showing how base and derived classes interact through shared behaviors and specialized functionality.

---

## Assignment Overview

### Description
The program defines a class hierarchy that models a real-world relationship using inheritance.  
A base class (parent) defines general fields and methods, while one or more derived classes (children) extend or override those members to provide unique behavior.  
The main method creates instances of these subclasses and uses polymorphism to call overridden methods dynamically.

### Features
- Implements a parent class with shared attributes and methods.  
- Creates derived classes that extend the parent and override certain methods.  
- Demonstrates polymorphism through base-type references calling subclass methods.  
- May include constructor chaining using the `super` keyword.  
- Uses `ArrayList` or arrays to store multiple subclass objects and process them uniformly.

### Learning Objectives
- Understand inheritance and how it promotes code reusability.  
- Learn method overriding and the `@Override` annotation.  
- Apply polymorphism to handle multiple object types using a common interface.  
- Reinforce constructor chaining and super-class relationships.

### Files
- `Nazario_Assignment10.java` (example filename) — driver program containing `main()`.  
- Additional class files such as `BaseClass.java`, `SubClassA.java`, `SubClassB.java`, etc.

---

## Program Structure
1. **Base Class Definition** – Declares common fields and shared behaviors.  
2. **Derived Class Definitions** – Extend the base class and override or add methods.  
3. **Main Program Execution** –  
   - Instantiates subclass objects.  
   - Calls methods through base-type references.  
   - Demonstrates polymorphic behavior and method overriding.  
4. **Output Phase** – Displays results illustrating inheritance and runtime binding.

---

## How to Compile and Run

### Requirements
- Java Development Kit (JDK) 17 or newer

### Command Line Instructions
```bash
javac *.java
java Nazario_Assignment10
