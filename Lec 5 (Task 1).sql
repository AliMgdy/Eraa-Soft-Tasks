CREATE TABLE	Player	(
id NUMBER CONSTRAINT player_id UNIQUE NOT NULL,
name varchar (100) CONSTRAINT player_name unique
);

CREATE TABLE	manager (
id NUMBER CONSTRAINT manager_id NOT NULL	,
name varchar (100),
salary NUMBER,
CONSTRAINT composite_id_name UNIQUE (id,name)
);

CREATE TABLE manager_2 (
id NUMBER PRIMARY KEY	,
name varchar (100),
age NUMBER
); 






