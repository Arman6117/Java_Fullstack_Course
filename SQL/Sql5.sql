show databases;
create database NACS1;
commit;

drop database NACS1;
rollback;
use NACS1;
show tables;

create table Student_Info(
	std_id int,
    std_name varchar(20),
    std_email varchar(30)
);

desc student_info;
select  * from student_info;

-- ADD Column in Table

alter table student_info ADD age smallint;
alter table student_info rename column age to std_age;
alter table student_info ADD constraint
 std_age check (std_age >=18);
 alter table student_info modify std_name varchar(30);
 
 insert into student_info values(
	101, "Micheal", "mj@gmail.com", 20
 );
 update student_info set std_name="Micheal Jackson" where std_id=101;
 
 SET SQL_SAFE_UPDATES = 0;

create table employee_info(
	emp_id int primary key,
    name varchar(30) not null,
    gender char(1),
    department varchar(20),
    designation varchar(20),
    salary decimal(10, 2),
	doj date
);
desc employee_info;
select * from employee_info;



insert into employee_info values
(101, 'John wick', 'M', 'IT', 'Software Engineer', 40000.00, '2024-04-09'),
(102, 'Anjali', 'F', 'HR', 'HR Executive', 40000.00, '2020-06-15'),
(103, 'Ravi Kumar', 'M', 'Finance', 'Accountant', 45000.00, '2022-01-20'),
(104, 'Sneha Reddy', 'F', 'IT', 'Team Lead', 75000.00, '2019-08-05'),
(105, 'Aman Verma', 'M', 'Sales', 'Sales Executive', 38000.00, '2021-11-01'),
(106, 'Priya Singh', 'F', 'Finance', 'Senior Accountant', 52000.00, '2018-12-11'),
(107, 'Vikram', 'M', 'IT', 'Software Engineer', 61000.00, '2023-04-19'),
(108, 'Rekha', 'F', 'Sales', 'Sales Manager', 70000.00, '2017-10-30');

select * from employee_info where salary >=50000;
select * from employee_info where salary <=50000;

select * from employee_info where department IN ('IT', 'SALES');
select * from employee_info where salary between 30000 and 50000;

select * from employee_info where name LIKE 'C%';
select * from employee_info where name LIKE '%k';
select * from employee_info where name LIKE '%Jo%';


select * from employee_info order by name asc;
select * from employee_info order by salary desc;

select * from employee_info order by salary desc limit 3;

select count(*) as employee_count from employee_info;

select avg(salary) as average_salary  from employee_info;

select max(salary) as max_salary  from employee_info;

select min(salary) as max_salary  from employee_info;

select sum(salary) as total_salaries  from employee_info;

select name, department, salary 
from employee_info e
where salary = (
	select max(salary) from employee_info
    where department = e.department
);