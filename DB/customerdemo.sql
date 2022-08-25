use owashimdb;
create table CUSTOMERdemo(
cust_id varchar(15),
Fname varchar(15),
Lname varchar(15),
Area char(2),
Phone numeric(10),
DOB date,
Payment numeric(6,2)
);
insert into customerdemo values('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50);
insert into customerdemo values('A02','Vandana','Ray','MU',5560379,'1987-12-20',1000.75);
insert into customerdemo values('A03','Pramada','Jauguste','DA',4560389,'1967-07-25',500.00);
insert into customerdemo values('A04','Basu','Navindi','BA',6125401,'1956-02-04',860.00);
insert into customerdemo values('A05','Ravi','Shridhar','NA',null,'1989-02-15',500.50);
insert into customerdemo values('A06','Rukmini','Aiyer','GH',5125274,'1987-07-23',1500.50);

# Display the data of the created table.
select*from customerdemo;
#4. Insert a row which will accept system date.
alter table customerdemo add(Systemdate date);
#5. Display the data in the table.
select*from customerdemo;
#6. Update the phone numbers of customer A02 and A04.
update customer set Phone = 8564723 where cust_id ='A02';
update customer set Phone = 6987354 where cust_id ='A04';
#7. Update the date of birth of customer A03 and A05.
update customerdemo set DOB = '1980-07-20' where cust_id ='A03';
update customerdemo set DOB = '1990-08-14' where cust_id ='A05';
#. Display the updated table.
select*from customerdemo;
#9. Delete 2 rows from the table for customers A01 and A05.
delete from customerdemo where cust_id = 'A01';
delete from customerdemo where cust_id = 'A05';
#10. Delete all the rows from the table.
delete from customerdemo;
#. Insert 5 records according to your own wish.
insert into customerdemo values('A01','owashim','chowdhury','SA',6125467,'1986-01-15',800.50);
insert into customerdemo values('A02','riya','Ray','MU',5560379,'1987-12-20',1000.75);
insert into customerdemo values('A03','tom','Jauguste','DA',4560389,'1967-07-25',500.00);
insert into customerdemo values('A04','tomy','Navindi','BA',6125401,'1956-02-04',860.00);
insert into customerdemo values('A05','tony','Shridhar','NA',null,'1989-02-15',500.50);
insert into customerdemo values('A06','raja','Aiyer','GH',5125274,'1987-07-23',1500.50);
#12. Update one record based on any criteria according to your own wish.
update customerdemo set Phone = 12345623 where cust_id = 'A01';
#13. Delete any 1 record from the table based on particular criteria.
delete from customerdemo where Area = 'BA'; 
