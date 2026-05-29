# 📚 Study Assistant — Java OOP MVP

A console-based Study Assistant application built with Java,
demonstrating all four core Object-Oriented Programming principles.

> Built by: Ashenaf & Dagmawi | BITS College | 2026

---

## 🚀 How to Compile and Run

```bash
# Step 1 - Compile all files
javac *.java

# Step 2 - Run the app
java Main
```

---

## 💡 What the App Does

```
================================
   Welcome to Study Assistant   
================================
1. Add Study Task
2. Add Assignment
3. View All Tasks
4. Mark Task Complete
5. Get a Study Tip
6. Exit
```

- ✅ Add study tasks with subject
- ✅ Add assignments with due dates
- ✅ View all your tasks
- ✅ Mark tasks as complete
- ✅ Get random study tips

---

## 🏗️ Project Structure

```
study-assistance/
├── Task.java           ← Base class (Encapsulation)
├── StudyTask.java      ← Extends Task (Inheritance)
├── AssigmentTask.java  ← Extends Task (Inheritance)
├── Assistant.java      ← Manages tasks (Polymorphism)
└── Main.java           ← Entry point (User interface)
```

---

## 🎯 OOP Concepts Demonstrated

### 1. Classes & Objects — `Task.java`
```java
// Class with attributes and methods
public class Task {
    private String title;        // attribute
    private boolean isCompleted; // attribute
}
// Object created in Main.java
Assistant assistant = new Assistant();
```

### 2. Encapsulation — `Task.java`
```java
// Private fields - data hidden from outside
private String title;
private boolean isCompleted;

// Public getter - controlled access
public String getTitle() {
    return title;
}

// Public method - controlled modification
public void markComplete() {
    isCompleted = true;
}
```

### 3. Inheritance — `StudyTask.java` & `AssigmentTask.java`
```java
// StudyTask IS-A Task (Single Inheritance)
public class StudyTask extends Task {
    public StudyTask(String title, String subject) {
        super(title); // calls parent constructor
    }
}

// AssigmentTask IS-A Task (Hierarchical Inheritance)
public class AssigmentTask extends Task {
    public AssigmentTask(String title, String subject, String dueDate) {
        super(title);
    }
}
```

### 4. Polymorphism — `Assistant.java` & subclasses

**Method Overriding (Runtime Polymorphism):**
```java
// Parent Task has show()
public void show() {
    System.out.println("Task: " + title);
}

// StudyTask overrides show()
@Override
public void show() {
    System.out.println("Study Task: " + getTitle() + " | Subject: " + subject);
}

// AssigmentTask overrides show()
@Override
public void show() {
    System.out.println("Assignment: " + getTitle() + " | Due: " + dueDate);
}
```

**Method Overloading (Compile-time Polymorphism):**
```java
// Same method name, different parameters
public void addTask(String title, String subject) { }
public void addTask(String title, String subject, String dueDate) { }
```

---

## 👥 Team Contributions

| File | Author | Concept |
|------|--------|---------|
| Task.java | Ashenaf | Encapsulation |
| AssigmentTask.java | Ashenaf | Inheritance |
| Main.java | Ashenaf | Entry point |
| StudyTask.java | Dagmawi | Inheritance |
| Assistant.java | Dagmawi | Polymorphism |
| README.md | Dagmawi | Documentation |

---

*BITS College — Object Oriented Programming Course | 2026*