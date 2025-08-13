CREATE TABLE doctor (
id NUMBER PRIMARY KEY ,
name varchar (100),
salary NUMBER
);


CREATE  TABLE patient (
id NUMBER PRIMARY KEY,
name varchar (100),
age number
);

CREATE TABLE doctors_patients (
doctor_id NUMBER,
patient_id NUMBER	,
CONSTRAINT doctor_id_for FOREIGN KEY (doctor_id) REFERENCES doctor (id),
CONSTRAINT patient_id_for FOREIGN KEY (patient_id) REFERENCES patient (id),
CONSTRAINT composite_id_un unique (doctor_id,patient_id)
);


