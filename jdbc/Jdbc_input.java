package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_input {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("emter Fname:");
		String Fname=sc.next();
		System.out.println("emter Lname:");
		String Lname=sc.next();
		System.out.println("emter cust_id:");
		String cust_id=sc.next();

		
	
		
		try{  
			//register driver
		Class.forName("com.mysql.jdbc.Driver"); 
		//Creating connection
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/owashimdb","root","Owashim@1");  
		//Creating statement
	     PreparedStatement stm;  
		//Executing queries
		String sql="insert into customer1 values(?,?,?)";
		stm=con.prepareStatement(sql);
		stm.setString(2, Fname);
		stm.setString(3, Lname);
		stm.setString(1, cust_id);
        stm.execute();
		  con.close();
		}catch(Exception e)
		{ System.out.println(e);}  
		
		}  
		 	
	}
