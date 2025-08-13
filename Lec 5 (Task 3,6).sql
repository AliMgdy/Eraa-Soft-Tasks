CREATE TABLE Language (
id NUMBER PRIMARY key,
name varchar (100)
);


CREATE TABLE teacher (
id NUMBER PRIMARY key,
name varchar (100),
salary NUMBER,
language_id NUMBER	NOT NULL,
CONSTRAINT Lang_id FOREIGN KEY	(language_id) REFERENCES	 Language (id)
);


