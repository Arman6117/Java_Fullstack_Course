show databases;
create database NACS1;
commit;
drop database NACS1;
rollback;

use NACS1;
show tables;

create table Student(
 stdId int,
 name varchar(25),
 email varchar(30)
);
desc Student;
select * from Student;
insert into Student values(1,"Arman", "a.com");
alter table Student  add age smallint;
alter table Student rename column age to stdAge;
alter table Student add constraint
stdAge check (stdAge >= 16);
alter  table Student modify name varchar(30);
insert into Student values(2, "Neha", "n.com", 20);
update student_info set std_name="Micheal Jackson" where std_id=101;
 
 SET SQL_SAFE_UPDATES = 0;
