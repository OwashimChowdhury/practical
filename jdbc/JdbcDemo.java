package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
	
		
		try{  
			//register driver
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		//Creating connection
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/owashimdb","root","Owashim@1");  
		//Creating statement
		Statement stmt=con.createStatement();  
		//Executing queries
		ResultSet rs=stmt.executeQuery("select * from customer1");  
		while(rs.next())  
			
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		
		}catch(Exception e)
		{ System.out.println(e);}  
		
		}  
		 	
	}


