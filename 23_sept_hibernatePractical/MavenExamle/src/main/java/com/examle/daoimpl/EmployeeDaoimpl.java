package com.examle.daoimpl;



import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.examle.config.HibernateUtil;
import com.examle.dao.EmployeeDao;
import com.examle.entity.Employee;

public class EmployeeDaoimpl implements EmployeeDao {
	@SuppressWarnings("static-access")
	//object of session
	Session session=new HibernateUtil().getSessionFactory().openSession();
	//object of transaction
	Transaction t = session.beginTransaction();
	Scanner sc=new Scanner(System.in);
	@SuppressWarnings("deprecation")
	@Override
	//method to add employee
	public void addEmployee() {
		String n,e,a;
		long p;
		double s;
		System.out.println("Enter  name: ");
		n=sc.next();
		System.out.println("Enter email:");
		e=sc.next();
		System.out.println("Enter address:");
		a=sc.next();
		System.out.println("Enter phone no.");
		p=sc.nextLong();
		System.out.println("Enter salary:");
		s=sc.nextDouble();
		
		Employee ee=new Employee();
		ee.setEname(n);
		ee.setEmail(e);
		ee.setEphone(p);
		ee.setSalary(s);
		ee.setAddr(a);
		session.save(ee);//save the session
		t.commit();//permanently save
		System.out.println("inserted successfully");
		
		

	}

	@Override
	//method to fetch employee
	public void fetchEmployee() {
		int id;
		System.out.println("Enter id:");
		id=sc.nextInt();
		Employee em=session.get(Employee.class, id);
		//printing the details
		System.out.println(em.getEname()+" "+em.getEmail()+" "+em.getAddr()+" "+em.getEphone()+" "+em.getSalary());
		
	}

	@SuppressWarnings("deprecation")
	@Override
	//method to update employee
	public void updateEmployee() {
		int id;
		System.out.println("Enter id:");
		id=sc.nextInt();
		Employee em=session.get(Employee.class, id);
		System.out.println("enter new phone no.");
		long pp=sc.nextLong();
		em.setEphone(pp);
		session.update(em);//updating
		t.commit();//permanently save
		System.out.println("updated successfully");
	}

	@SuppressWarnings("deprecation")
	@Override
	//method to delete employee
	public void deleteEmployee() {
		int id;
		System.out.println("Enter id:");
		id=sc.nextInt();
		Employee em=session.get(Employee.class, id);
		session.delete(em);//deleting
		t.commit();//permanently save
		System.out.println("deleted");
		
	}

}
