show databases;

create database employeedb;

use employeedb;

show tables;

create table employee(id int auto_increment primary key, name varchar(20), gender enum('M','F'), age int, salary float);

insert into employee values(100, 'Rohan', 'M', 33, 61000.83);
insert into employee values(101, 'Ramesh', 'M', 27, 45000.83),(102, 'Wargo', 'M', 39, 84000.62),(103, 'Koyel', 'F', 31, 54000.10);

select * from employee;