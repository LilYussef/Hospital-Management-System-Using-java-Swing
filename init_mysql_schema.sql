-- MySQL Hospital Management System Schema Initialization
-- Run this in phpMyAdmin or MySQL CLI as your chosen database user

-- DOCTOR table
CREATE TABLE doctor_details (
    id INT PRIMARY KEY,
    name VARCHAR(32),
    email VARCHAR(32),
    password VARCHAR(32),
    mobile VARCHAR(10),
    address VARCHAR(32),
    qualification VARCHAR(32),
    gender VARCHAR(10),
    bloodgroup VARCHAR(32),
    dateofjoining VARCHAR(15)
);

-- PATIENT table
CREATE TABLE patient(
    ID INT NOT NULL PRIMARY KEY,
    Name VARCHAR(30),
    Age INT,
    Gender VARCHAR(6),
    Address VARCHAR(50),
    District VARCHAR(25),
    Ph_no VARCHAR(10),
    Bloodgrp VARCHAR(5),
    Appointment DATE,
    Symptoms VARCHAR(100),
    Doctor VARCHAR(30)
);

-- DIAGNOSIS table
CREATE TABLE diagnosis(
    MedID INT NOT NULL PRIMARY KEY,
    Patientname VARCHAR(100),
    Diagnosis VARCHAR(100),
    Medicine VARCHAR(100),
    Quantity VARCHAR(100),
    Ward VARCHAR(4),
    ID INT NOT NULL,
    FOREIGN KEY (ID) REFERENCES patient(ID)
);

-- ROOM table
CREATE TABLE room(
    RoomID INT NOT NULL,
    roomtype VARCHAR(32),
    patientname VARCHAR(32),
    ad_date VARCHAR(32),
    ID INT NOT NULL,
    MedID INT NOT NULL,
    PRIMARY KEY (RoomID),
    FOREIGN KEY (MedID) REFERENCES diagnosis(MedID),
    FOREIGN KEY (ID) REFERENCES patient(ID)
);

-- MEDICINE table
CREATE TABLE medicine (
    medname VARCHAR(50) NOT NULL PRIMARY KEY,
    rupees INT NOT NULL
);
INSERT INTO medicine VALUES('Dolo',5);
INSERT INTO medicine VALUES('Paracetamol',3);
INSERT INTO medicine VALUES('Eldopher',2);
INSERT INTO medicine VALUES('Amlong',6);
INSERT INTO medicine VALUES('Erythromycin',10);
INSERT INTO medicine VALUES('Evion',3);
INSERT INTO medicine VALUES('Aciloc',1);
INSERT INTO medicine VALUES('Wysolene',4);
INSERT INTO medicine VALUES('Pantocid',9);
INSERT INTO medicine VALUES('Carnisure',15);
INSERT INTO medicine VALUES('Snepdol',7);
INSERT INTO medicine VALUES('Dulotin',9);
INSERT INTO medicine VALUES('Prothiaden',7);
INSERT INTO medicine VALUES('Gabarich',11);
INSERT INTO medicine VALUES('Deriphyllin',19);
INSERT INTO medicine VALUES('Vent',1);

-- PHARMACY table
CREATE TABLE pharmacy (
    billid INT NOT NULL PRIMARY KEY,
    id INT NOT NULL,
    bill INT,
    FOREIGN KEY (id) REFERENCES patient(ID)
);

-- ADMIN table
CREATE TABLE admin(
    id VARCHAR(10),
    name VARCHAR(15),
    email VARCHAR(25),
    password VARCHAR(15)
);
INSERT INTO admin(id,name,email,password) VALUES('123','Admin','admin1234','abc123'); 