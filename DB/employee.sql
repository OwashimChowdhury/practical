use owashimdb;
#creating a table
create table employee(ID int,Name varchar(50),DeptSalary varchar(50));
#adding values
insert into employee values(1,"owashim",30000);
#adding values
insert into employee values(2,"rohit",40000);
#adding values
insert into employee values(3,"rahul",30000);
#adding values
insert into employee values(4,"raju",50000);
#adding values
insert into employee values(5,"sam",10000);
#adding new colum using alter
alter table employee add(HOD varchar(50));
#updating values
update  employee set departmentName="finance" where ID=5;
#deleting rows
delete from employee where id=4;
#deleting all the records or values
truncate table employee;
#deleting the table using Drop
drop table employee; 

