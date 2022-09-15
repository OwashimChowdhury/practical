package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_inputDemo {
	public static void main(String[] args) {
		
	
	try{  
		//register driver
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	//Creating connection
	Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/owashimdb","root","Owashim@1");  
	//Creating statement
	Statement stmt=con.createStatement();  
	//Executing queries
	stmt.executeUpdate("insert into customer1 values(50,'asd','chowdhury')");
	System.out.println("inserted succesfully");
	
	con.close();
	}catch(Exception e)
	{ System.out.println(e);}  
	
	}  
}
