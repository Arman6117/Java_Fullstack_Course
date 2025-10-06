use NACS1;

create table department(
 dID int primary key,
 dName varchar(100)
);

INSERT INTO DEPARTMENT VALUES 
(1, 'HR'), 
(2, 'Finance'), 
(3, 'IT'), 
(4, 'Marketing');

CREATE TABLE NEW_EMPLOYEE (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    department_id INT,
    salary DECIMAL(10, 2),
    FOREIGN KEY (department_id) REFERENCES DEPARTMENT(dID)
);

INSERT INTO NEW_EMPLOYEE VALUES 
(101, 'Amitab', 1, 50000),
(102, 'Bobby', 2, 60000),
(103, 'Charlie', 3, 70000),
(104, 'David', NULL, 40000),
(105, 'Eva', 3, 75000),
(106, 'Frank', NULL, 45000);

SELECT * FROM NEW_EMPLOYEE;

drop table NEW_EMPLOYEE;


-- 1. INNER JOIN
-- -----------
-- Returns records with matching values in both tables.

SELECT e.name , d.dName
FROM NEW_EMPLOYEE e 
INNER JOIN DEPARTMENT d
ON e.department_id = d.dID;

-- 2. LEFT JOIN (or LEFT OUTER JOIN)
-- -------------------------------
-- Returns all records from left table (EMPLOYEE), 
-- and matched records from right table (DEPARTMENT). 
-- Non-matches show NULL.

SELECT e.name , d.dName
FROM NEW_EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON e.department_id= d.dID;

-- 3. RIGHT JOIN (or RIGHT OUTER JOIN)
-- --------------------------------
-- Returns all records from right table (DEPARTMENT), 
-- and matched records from left (EMPLOYEE). 
-- Non-matches show NULL.

SELECT e.name AS Employee , d.dName AS Department
FROM NEW_EMPLOYEE e
RIGHT JOIN DEPARTMENT d
ON e.department_id = d.dID;

-- 4. FULL JOIN (or FULL OUTER JOIN)
-- --------------------------------
-- Combines results of LEFT JOIN + RIGHT JOIN (all records from both tables).
--  Non-matches show NULL.

-- Not supported directly in MySQL – use UNION workaround:
SELECT e.name, d.dName
FROM NEW_EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON e.department_id = d.dID

UNION

SELECT e.name, d.dName
FROM NEW_EMPLOYEE e
RIGHT JOIN DEPARTMENT d
ON e.department_id = d.dID;


-- 5. SELF JOIN
-- Join a table with itself, useful for hierarchical relationships (e.g. employees with managers)

-- First, add manager_id to EMPLOYEE:

ALTER TABLE NEW_EMPLOYEE ADD manager_id INT;

UPDATE NEW_EMPLOYEE SET manager_id = 101 WHERE employee_id IN (102, 103);


SELECT e.name AS Employee, m.name AS Manager
FROM NEW_EMPLOYEE e
JOIN NEW_EMPLOYEE m
ON e.manager_id = m.employee_id;


-- Find employees who don’t belong to any department (LEFT JOIN + WHERE department IS NULL)
SELECT e.name
FROM NEW_EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON e.department_id = d.dID
WHERE d.dID IS NULL;



delete from  new_employee where employee_id= 101;



