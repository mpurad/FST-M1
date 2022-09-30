REM   Script: Activity2
REM   Activity2

CREATE TABLE salesman 
(salesman_id int primary key, 
salesman_name varchar(20), 
salesman_city varchar(20), 
commission int 
);

DESCRIBE salesman;


INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman VALUES(5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13);

INSERT INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

SELECT * FROM salesman;

