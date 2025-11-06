# COP2251 – Java Assignment 10

## Summary
This set of programs practices object-oriented modeling and collection handling alongside string utilities. It includes a `Fastfood` data class, a `Meal` container backed by `ArrayList<Fastfood>`, a driver to exercise the meal API, and small utilities that demonstrate string and set-style operations.

## Program Behavior
- Fastfood / Meal / MealTester  
  - `Fastfood` is a model class with fields such as restaurant name, food name, price, and quantity, and a formatted `toString()`.  
  - `Meal` maintains an `ArrayList<Fastfood>` to represent a grouped order. Typical operations include adding items, computing totals, and printing the contents.  
  - `MealTester` constructs a `Meal`, adds one or more `Fastfood` items, and prints a report of the items and summarized values.

- StringSet / StringSetTester  
  - `StringSet` provides a small set-like container for strings (backed by a collection), supporting operations such as insertion and membership checks.  
  - `StringSetTester` demonstrates typical usage (populate, query, and display).

- StringTester  
  - Demonstrates general string operations (creation, concatenation, comparisons, and common methods) and prints results to the console.

## Key Concepts Demonstrated
- Object Modeling: Separating data (`Fastfood`) from aggregation (`Meal`) and interaction (test drivers).  
- Collections: Managing a dynamic `ArrayList<Fastfood>` and simple set-style logic for strings.  
- Encapsulation and APIs: Providing methods on classes to add items, compute totals, and format output.  
- String Utilities: Practicing common string operations and comparisons.  
- Packages and Module: All sources are under `package nazario10` with a `module-info.java`.

## How to Compile and Run
Requirements:
- Java Development Kit (JDK) 17 or later
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, or VS Code)

Commands (from the `nazario10/src` directory):
javac -d ../out module-info.java nazario10/Fastfood.java nazario10/Meal.java nazario10/MealTester.java nazario10/StringSet.java nazario10/StringSetTester.java nazario10/StringTester.java  
java -cp ../out nazario10.MealTester  
java -cp ../out nazario10.StringSetTester  
java -cp ../out nazario10.StringTester
