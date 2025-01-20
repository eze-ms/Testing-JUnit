# Testing in Java with JUnit and AssertJ

This repository contains various exercises designed to practice and enhance skills in **JUnit** and **AssertJ** for testing in Java. Below are the exercises and their objectives:

---

## **Level 1: JUnit**

### **Exercise 1: Book Management**
Create a Java class to manage a collection of books in a library with the following functionalities:
- Add books to the collection.
- Retrieve the complete list of books.
- Get the title of a book by its position.
- Add a book at a specific position.
- Remove a book by its title.

#### **Tests to Implement:**
1. Verify that the book list is not null after creation.
2. Check the size of the list after adding multiple books.
3. Ensure a book is at the correct position.
4. Verify that there are no duplicate book titles in the list.
5. Retrieve the title of a book by its specific position.
6. Add and remove books and verify the effects on the list.
7. Ensure the list remains alphabetically ordered after adding or removing books.

---

### **Exercise 2: DNI Letter Calculation**
- Implement a `CalculoDni` class to calculate the DNI letter from a given number.
- Write a parameterized JUnit test to validate correct calculations for 10 predefined DNI numbers.

---

### **Exercise 3: ArrayIndexOutOfBoundsException**
- Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.
- Write a JUnit test to verify that the exception is thrown correctly.

---

## **Level 2: AssertJ**

### **Exercise 1: Integer Comparison**
- Write an assertion to demonstrate that two integer objects are equal.
- Write another assertion to demonstrate that they are not equal.

---

### **Exercise 2: Object References**
- Write an assertion to demonstrate that one object reference is the same as another.
- Write another assertion to demonstrate that they are different.

---

### **Exercise 3: Integer Array Comparison**
- Write an assertion to verify that two integer arrays are identical.

---

### **Exercise 4: ArrayList Assertions**
- Create an ArrayList containing multiple types of objects (create the objects as well).
- Write an assertion to verify the order of the objects in the list matches their insertion order.
- Verify that the list contains the objects in any order.
- Verify that an object is added to the list only once.
- Ensure that a specific object not added to the list is not present.

---

### **Exercise 5: Map Assertions**
- Create a map and verify that it contains one of the keys you added.

---

### **Exercise 6: ArrayIndexOutOfBoundsException with AssertJ**
- Trigger an `ArrayIndexOutOfBoundsException` in a class.
- Write an assertion to validate that the exception is thrown as expected.

---

### **Exercise 7: Optional Assertions**
- Create an empty `Optional` object.
- Write an assertion to verify that it is indeed empty.

---
