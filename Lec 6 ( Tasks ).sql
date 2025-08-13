-----  1. CHECK Constraint -------
CREATE TABLE Employeess (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    age NUMBER CONSTRAINT chk_employees_age CHECK (age >= 18)
);


CREATE TABLE Staff (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    salary NUMBER CONSTRAINT chk_staff_salary CHECK (salary BETWEEN 3000 AND 10000)
);

ALTER TABLE Products
ADD CONSTRAINT chk_products_price CHECK (price > 0);


CREATE TABLE Students (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    grade CHAR(1) CONSTRAINT chk_students_grade CHECK (grade IN ('A', 'B', 'C', 'D', 'E', 'F'))
);

-------- 2. Adding Constraints via ALTER TABLE --------

ALTER TABLE Customers
MODIFY email CONSTRAINT nn_customers_email NOT NULL;

ALTER TABLE Users	ADD CONSTRAINT un_user UNIQUE	(username);

ALTER TABLE Orders ADD CONSTRAINT customer_id_for FOREIGN KEY (customer_id) REFERENCES	Customers(id);

ALTER TABLE Accounts ADD CONSTRAINT check_balance CHECK (balance >= 0);

ALTER TABLE Departments ADD CONSTRAINT pk_departments PRIMARY KEY (dept_id);

-------- 3. Dropping (Removing) Constraints -------

ALTER TABLE Employees DROP CONSTRAINT chk_salary;

ALTER TABLE Users DROP CONSTRAINT uq_users_email;

ALTER TABLE Products DROP PRIMARY KEY;

ALTER TABLE Orders DROP CONSTRAINT fk_order_customer;

ALTER TABLE Contacts MODIFY phone NULL;

---------  4. Renaming Constraints --------

ALTER TABLE Students RENAME CONSTRAINT chk_age TO check_min_age;

ALTER TABLE Employees RENAME CONSTRAINT fk_emp_dept TO fk_employee_department;

ALTER TABLE Users RENAME CONSTRAINT users_pkey TO pk_users_id;

ALTER TABLE Users RENAME CONSTRAINT uq_users_username TO uk_user_name;

---------  5. Disabling Constraints --------

ALTER TABLE Orders DISABLE CONSTRAINT fk_customer_order;

ALTER TABLE Products DISABLE ALL CONSTRAINTS;

ALTER TABLE Accounts DISABLE CONSTRAINT chk_accounts_balance;

ALTER TABLE Departments DISABLE CONSTRAINT pk_departments;

ALTER TABLE table_name DISABLE ALL CONSTRAINTS;
---- after inserting data ----
ALTER TABLE table_name ENABLE ALL CONSTRAINTS;


-------- 6. Enabling Constraints -------

ALTER TABLE ORDERS  ENABLE CONSTRAINT fk_customer_order;

ALTER TABLE Products ENABLE ALL CONSTRAINTS;

ALTER TABLE Staff ENABLE CONSTRAINT chk_staff_salary;

ALTER TABLE Departments ENABLE CONSTRAINT pk_departments;


----------- How do you enable a constraint only if it's currently disabled? ---------
SELECT constraint_name, status
FROM user_constraints
WHERE table_name = 'ORDERS'
  AND constraint_name = 'FK_CUSTOMER_ORDER';

ALTER TABLE Orders
ENABLE CONSTRAINT fk_customer_order;