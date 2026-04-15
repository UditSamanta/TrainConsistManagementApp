# 🚂 Train Consist Management System (TCMS)
### App-Based Learning Using Core Java & Data Structures

## 🎯 Project Objective
This project is a deep dive into the design and implementation of a **Train Consist Management System**. It demonstrates how Core Java and fundamental data structures are applied to solve real-world railway operations challenges.

Rather than treating data structures as isolated theory, this system showcases how they enable:
* **Efficient Reordering:** Dynamic arrangement of coaches using linked structures.
* **Real-Time Consistency:** Maintaining integrity in coach composition and allocation.
* **Validation:** Preventing duplication or invalid configurations (e.g., ensuring engine placement).
* **Maintainability:** An adaptable architecture ready for changing operational needs.

---

## 💡 Learning Approach
The application is developed **incrementally**. Each use case introduces one new concept while reinforcing previous ones. Every design decision reflects how real-world systems evolve—from basic implementations to scalable architectures.

**Each stage highlights:**
1.  **Selection:** Why a specific data structure was chosen.
2.  **Problem Solving:** What operational railway problem it solves.
3.  **Refinement:** Identifying inefficiencies in basic logic and optimizing them.

---

## 🛠 Tech Stack & Core Concepts
* **Language:** Java (Core)
* **Data Structures:** * **Linked Lists:** For dynamic coach sequencing.
    * **Stacks/Queues:** For shunting and yard management logic.
    * **HashMaps:** For quick lookup of coach attributes.
* **Principles:** Object-Oriented Programming (OOP), Defensive Programming, and Deterministic Logic.

---

## 🚀 Key Features
* **Dynamic Consist Management:** Add, remove, or swap coaches in a train line-up.
* **Operational Validation:** Built-in rules to ensure safe and logical train configurations.
* **Console-Based Traceability:** All operations are deterministic, making the system easy to debug and audit.
* **Modular Design:** Minimal UI complexity to keep the focus entirely on core backend logic and data flow.

---

## 📂 Project Structure
```text
/src
├── model/        # Domain entities (Coach, Locomotive, Consist)
├── structure/    # Data Structure implementations (Lists, Maps, etc.)
├── service/      # Business logic and railway validation rules
└── Main.java     # Application entry point
