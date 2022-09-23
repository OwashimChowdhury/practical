package com.examle;

import java.util.Scanner;

import com.examle.dao.EmployeeDao;
import com.examle.daoimpl.EmployeeDaoimpl;

public class App 
{
    public static void main( String[] args )
    {
    	//scanner object
    Scanner sc=new Scanner(System.in);
    
    EmployeeDao emp=new EmployeeDaoimpl();
    char ch;
    //do while loop
	do {
	System.out.println("PRESS 1 for add  \nPRESS 2 for display  \nPRESS 3 for update \nPRESS 4 for delete \nPRESS 5 for Exit");
		//switch case
	System.out.println("enter choice:");
    int press=sc.nextInt();
    switch(press) {
    case 1:emp.addEmployee();//to add employee
    break;
    case 2:emp.fetchEmployee();//to fetch employee
    break;
    case 3:emp.updateEmployee();//to update phone 
    break;
    case 4:emp.deleteEmployee();//to delete employee from db
    break;
    case 5:System.exit(0);
    break;
    default: System.out.println("invalid choice");
    }
    System.out.println("do you want to continue? Y/N");
    ch=sc.next().charAt(0);
    }while(ch=='Y' || ch=='y');//condition
	System.out.println("thankyou.....");
    }//end of main method
   
}//end of class
