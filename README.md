# 🏥 APU Medical Centre (AMC) - OODJ Project

This is a multi-user, GUI-based desktop application for managing a medical center. It was developed as the group coursework for the "Object-Oriented Development with Java (OODJ)" module (CT038-3-2-OODJ).

This project was built by **Group 11**:
* CHAN XIN QUAN (TP081941)
* CHEN ZHENG HAO (TP082375)
* KAEMON NG (TP082265)
* SAWRAW MADUB (TP081108)

The system provides four distinct roles (Manager, Staff, Doctor, and Customer), each with its own dedicated interface and functionalities.

## 🔑 Key Features by Role

### 1. Manager
* **User Management**: Full CRUD (Create, Read, Update, Delete) capabilities for user accounts (Manager, Staff, Doctor).
* **Report Generation**: Generates financial and operational reports, including total revenue, total appointments, and feedback summaries.
* **View System Data**: Can view all appointments and feedback data in the system.

### 2. Staff 
* **Customer Management**: Handles the "Create", "Read", "Update", and "Delete" (CRUD) operations for all customer accounts.
* **Appointment Booking**: Schedules new appointments for customers, including selecting a doctor, date, and time. Features auto-generation of Appointment IDs.
* **Payment & Receipt**: Collects payments for "Outstanding" appointments and generates receipts for "Completed" ones.

### 3. Doctor
* **Process Appointments**: Views assigned appointments and updates them with medical reviews/notes and service charges.
* **View History**: Accesses a complete history of all past appointments they have handled.
* **Profile Management**: Able to view and edit their own profile (username, password).

### 4. Customer
* **Appointment Management**: Allows customers to **Reschedule** or **Cancel** their own upcoming appointments.
* **View History**: Views a full history of all past and upcoming appointments, including doctor reviews and charges.
* **Submit Feedback**: Provides a facility to submit comments/feedback for both staff and doctors after an appointment.
* **Profile Management**: Able to view and edit their own profile.

## 💻 Tech Stack & Core Concepts
* **Language**: Java
* **Framework**: Java Swing (for GUI)
* **Data Storage**: Flat-File Database (File I/O using `.txt` files for users, appointments, and payments).
* **Core OOP Principles**: The project heavily utilizes OOP concepts including **Inheritance** (e.g., `User` parent class), **Encapsulation**, **Polymorphism** (e.g., `CRUD` and `Individual` interfaces), and **Abstraction**.

