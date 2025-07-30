# 🏥 Hospital Management System - Java

A Java-based desktop application designed to help hospitals manage day-to-day operations more efficiently. This project demonstrates the core functionalities of a hospital system using Java Swing for the user interface and file handling for storing data (with database integration).

## 📌 Overview

The Hospital Management System allows admins and staff to handle patients, doctors, appointments, and billing within a simple and organized interface. It's a standalone application, ideal for small clinics, educational purposes, or Java GUI practice projects.

## ✅ Main Features

- **👨‍⚕️ Doctor Management**: Add, view, and manage doctor profiles including specialty and availability.
- **🧑‍🤝‍🧑 Patient Registration**: Register new patients, manage their medical records, and update personal information.
- **📅 Appointment Scheduling**: Book appointments between doctors and patients with date and time selection.
- **💰 Billing System**: Generate invoices for patient treatments, calculate total costs, and display payment summaries.
- **🖥️ Graphical User Interface (GUI)**: Built using Java Swing for a user-friendly desktop experience.
- **📂 File-Based Data Storage**: Data is stored in .txt files using standard Java I/O operations (no external database needed).

## 🛠️ Technologies Used

- **Java (JDK 8+)**: Core programming language
- **Java Swing**: GUI framework for desktop interface
- **Java AWT**: Additional GUI components
- **File I/O**: Text file-based data persistence

## 🗂️ Project Structure

```
├── LICENSE
├── README.md
├── build.xml
├── build
    ├── built-jar.properties.txt
    └── database
    │   └── DatabaseOperation.class
├── hospital-management-system-main.iml
├── img
    ├── admin
    │   ├── BACKF.jpg
    │   ├── adfront.jpg
    │   ├── admin.jpg
    │   ├── b2.png
    │   ├── ddelete.jpg
    │   ├── del.jpg
    │   ├── docregis.jpg
    │   ├── doctor.jpg
    │   ├── doctor.png
    │   ├── dupdate.png
    │   ├── hmis-logo.png
    │   ├── img2.jpg
    │   ├── logo.png
    │   ├── p.png
    │   ├── patdel.jpg
    │   ├── patient.jpg
    │   ├── patient1.jpg
    │   ├── pharmacy.png
    │   ├── rooms.png
    │   ├── updateform1.jpg
    │   ├── view.png
    │   └── viewform1.png
    ├── diagnosis
    │   ├── back.png
    │   ├── l.png
    │   ├── logo.png
    │   └── search.png
    ├── doctor
    │   ├── 1.png
    │   ├── Login.jpg
    │   ├── back.png
    │   ├── clear2.png
    │   ├── diagnosis.jpg
    │   ├── patient.jpg
    │   ├── submit.png
    │   └── view.jpg
    ├── option
    │   ├── diagnosis.png
    │   ├── logo.png
    │   ├── mail.png
    │   ├── ph.png
    │   ├── register.png
    │   └── view.png
    └── pharmacy
    │   ├── back.png
    │   ├── bg.png
    │   ├── bill.png
    │   ├── gbill.png
    │   ├── logo.png
    │   └── search.png
├── init_mysql_schema.sql
├── lib
    ├── itextpdf-5.5.13.jar
    ├── javax.mail-1.6.2.jar
    ├── jcalendar-1.4.jar
    ├── mysql-connector-java-8.3.0.jar
    └── ojdbc6-11.2.0.4.jar
├── nbproject
    ├── build-impl.xml
    ├── genfiles.properties.txt
    ├── private
    │   ├── private.properties.txt
    │   └── private.xml
    ├── project.properties.txt
    └── project.xml
└── src
    ├── Doctor
        ├── Appointments.java
        ├── LoginForm.java
        ├── Page.java
        ├── Patdiag.java
        ├── Update.java
        └── View.java
    ├── Patient
        ├── PDetails.java
        ├── PatUpdate.java
        ├── PatientDiagnosis.java
        ├── PatientOption.java
        ├── PatientReg.java
        ├── PatientView.java
        └── ViewDetails.java
    ├── Pharmacy
        ├── Billing.java
        ├── Pharmacy.java
        └── PharmacyID.java
    ├── admin
        ├── Admin.java
        ├── Docdelete.java
        ├── PatUpdate.java
        ├── Regd.java
        ├── Rooms.java
        ├── Update.java
        ├── View.java
        ├── ViewDetails.java
        ├── Viewdoc.java
        ├── adminpage.java
        ├── docpage.java
        ├── docupdate.java
        ├── patdelete.java
        ├── patpage.java
        ├── patview.java
        └── updateid.java
    ├── database
        └── DatabaseOperation.java
    └── homepage
        ├── aboutpage.java
        ├── contactpage.java
        ├── homepage.java
        └── mail.java
```

## 🚀 How to Run

### Prerequisites
- Java JDK 8+ installed on your system

### Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/hospital-management-java.git
   cd hospital-management-java

   ## 🌐 Socials:
[![Discord](https://img.shields.io/badge/Discord-%237289DA.svg?logo=discord&logoColor=white)](https://discord.gg/.lilyussef) [![Facebook](https://img.shields.io/badge/Facebook-%231877F2.svg?logo=Facebook&logoColor=white)](https://facebook.com/YussefXHelmy) [![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/yossef_hilmey) [![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/yussef-ahmed-3bb294343) [![Stack Overflow](https://img.shields.io/badge/-Stackoverflow-FE7A16?logo=stack-overflow&logoColor=white)](https://stackoverflow.com/users/29765489) [![TikTok](https://img.shields.io/badge/TikTok-%23000000.svg?logo=TikTok&logoColor=white)](https://tiktok.com/@yussefahmed_) [![X](https://img.shields.io/badge/X-black.svg?logo=X&logoColor=white)](https://x.com/@YussefHilmey) [![Codepen](https://img.shields.io/badge/Codepen-000000?logo=codepen&logoColor=white)](https://codepen.io/@lilratt) [![email](https://img.shields.io/badge/Email-D14836?logo=gmail&logoColor=white)](mailto:yussefhilmey@outlook.com) 

# 💻 Tech Stack:
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![Dart](https://img.shields.io/badge/dart-%230175C2.svg?style=for-the-badge&logo=dart&logoColor=white) ![C](https://img.shields.io/badge/c-%2300599C.svg?style=for-the-badge&logo=c&logoColor=white) ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=for-the-badge&logo=c%2B%2B&logoColor=white) ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E) ![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54) ![PHP](https://img.shields.io/badge/php-%23777BB4.svg?style=for-the-badge&logo=php&logoColor=white) ![Ruby](https://img.shields.io/badge/ruby-%23CC342D.svg?style=for-the-badge&logo=ruby&logoColor=white) ![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white) ![Swift](https://img.shields.io/badge/swift-F54A2A?style=for-the-badge&logo=swift&logoColor=white) ![Netlify](https://img.shields.io/badge/netlify-%23000000.svg?style=for-the-badge&logo=netlify&logoColor=#00C7B7) ![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white) ![Google Cloud](https://img.shields.io/badge/GoogleCloud-%234285F4.svg?style=for-the-badge&logo=google-cloud&logoColor=white) ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white) ![Django](https://img.shields.io/badge/django-%23092E20.svg?style=for-the-badge&logo=django&logoColor=white) ![Flask](https://img.shields.io/badge/flask-%23000.svg?style=for-the-badge&logo=flask&logoColor=white) ![Flutter](https://img.shields.io/badge/Flutter-%2302569B.svg?style=for-the-badge&logo=Flutter&logoColor=white) ![NodeJS](https://img.shields.io/badge/node.js-6DA55F?style=for-the-badge&logo=node.js&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) ![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white) ![Canva](https://img.shields.io/badge/Canva-%2300C4CC.svg?style=for-the-badge&logo=Canva&logoColor=white) ![Adobe XD](https://img.shields.io/badge/Adobe%20XD-470137?style=for-the-badge&logo=Adobe%20XD&logoColor=#FF61F6) ![NumPy](https://img.shields.io/badge/numpy-%23013243.svg?style=for-the-badge&logo=numpy&logoColor=white) ![Pandas](https://img.shields.io/badge/pandas-%23150458.svg?style=for-the-badge&logo=pandas&logoColor=white) ![GitLab](https://img.shields.io/badge/gitlab-%23181717.svg?style=for-the-badge&logo=gitlab&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) ![Cisco](https://img.shields.io/badge/cisco-%23049fd9.svg?style=for-the-badge&logo=cisco&logoColor=black) ![Arduino](https://img.shields.io/badge/-Arduino-00979D?style=for-the-badge&logo=Arduino&logoColor=white) ![Portfolio](https://img.shields.io/badge/Portfolio-%23000000.svg?style=for-the-badge&logo=firefox&logoColor=#FF7139)
# 📊 GitHub Stats:
![](https://github-readme-stats.vercel.app/api?username=LilRatt&theme=dark&hide_border=false&include_all_commits=false&count_private=false)<br/>
![](https://github-readme-streak-stats.herokuapp.com/?user=LilRatt&theme=dark&hide_border=false)<br/>
![](https://github-readme-stats.vercel.app/api/top-langs/?username=LilRatt&theme=dark&hide_border=false&include_all_commits=false&count_private=false&layout=compact)

## 🏆 GitHub Trophies
![](https://github-profile-trophy.vercel.app/?username=LilRatt&theme=radical&no-frame=false&no-bg=true&margin-w=4)

---
[![](https://visitcount.itsvg.in/api?id=LilRatt&icon=0&color=0)](https://visitcount.itsvg.in)
