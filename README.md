# Hospital-Management-System-Using-java-Swing

🏥 Hospital Management System - Java
A Java-based desktop application designed to help hospitals manage day-to-day operations more efficiently. This project demonstrates the core functionalities of a hospital system using Java Swing for the user interface and file handling for storing data (no database integration).
📌 Overview
The Hospital Management System allows admins and staff to handle patients, doctors, appointments, and billing within a simple and organized interface. It's a standalone application, ideal for small clinics, educational purposes, or Java GUI practice projects.
✅ Main Features
👨‍⚕️ Doctor Management
Add, view, and manage doctor profiles including specialty and availability.
🧑‍🤝‍🧑 Patient Registration
Register new patients, manage their medical records, and update personal information.
📅 Appointment Scheduling
Book appointments between doctors and patients with date and time selection.
💰 Billing System
Generate invoices for patient treatments, calculate total costs, and display payment summaries.
🖥️ Graphical User Interface (GUI)
Built using Java Swing for a user-friendly desktop experience.
📂 File-Based Data Storage
Data is stored in .txt files using standard Java I/O operations (no external database needed).
🛠️ Technologies Used
Java (JDK 8+)
Java Swing
Java AWT
File I/O (Text Files)
🗂️ Project Structure
Hospital-Management-Java/ │ ├── src/ │ ├── Main.java │ ├── Login.java │ ├── Dashboard.java │ ├── Patient.java │ ├── Doctor.java │ ├── Appointment.java │ ├── Billing.java │ └── ... (other helper classes) │ ├── data/ │ ├── patients.txt │ ├── doctors.txt │ ├── appointments.txt │ └── bills.txt │ └── README.md 
🚀 How to Run
Make sure you have Java JDK 8+ installed.
Compile all .java files in the src/ directory: javac *.java 
Run the main class: java Main 
The application will launch with a login screen.
📚 Use Cases
Ideal for beginner Java developers exploring desktop application development.
Can be used for academic projects, mini-projects, or GUI practice.
Easy to extend by integrating a database (like MySQL or SQLite) in the future.
📌 Notes
All data is stored in local .txt files, so restarting the application retains existing records.
No external libraries are required to run the project.
🙋‍♂️ Author & Contributions
This project was developed as a learning exercise to understand Java Swing, file handling, and basic hospital workflow modeling.
You are welcome to fork, modify, or improve the code for your own learning or use!
