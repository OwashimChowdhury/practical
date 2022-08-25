#creating a table
create table department(ID int,departmentName varchar(50),DeptSalary varchar(50));
#adding values
insert into departmrnt values(1,"EE",30000);
#adding values
insert into departmrnt values(2,"IT",40000);
#adding values
insert into departmrnt values(3,"ECE",30000);
#adding values
insert into departmrnt values(4,"CE",50000);
#adding values
insert into departmrnt values(5,"EEE",10000);
#adding new colum using alter
alter table department add(HOD varchar(50));
#updating values
update  department set departmentName="finance" where ID=5;
#deleting rows
delete from department where id=4;
#deleting all the records or values
truncate table department;
#deleting the table using Drop
drop table department;
