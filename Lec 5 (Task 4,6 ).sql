CREATE TABLE Employee (
    id NUMBER PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age NUMBER
);


CREATE TABLE Phone (
    id NUMBER PRIMARY KEY,
    phoneNumber VARCHAR(20) NOT NULL,
    employee_id NUMBER UNIQUE, 
    CONSTRAINT employee_id_for
        FOREIGN KEY (employee_id) REFERENCES Employee (id) 
        );