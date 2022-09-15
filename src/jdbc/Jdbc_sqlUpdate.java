package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_sqlUpdate {
public static void main(String[] args) {
	
		
		try{  
			//register driver
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		//Creating connection
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/owashimdb","root","Owashim@1");  
		//Creating statement
		Statement stmt=con.createStatement();  
		//Executing queries
		stmt.executeUpdate("update customer1 set Lname='qwer' where cust_id='A02'");
		stmt.executeUpdate("delete from customer1 where cust_id='A01'");

		
		ResultSet rs=stmt.executeQuery("select balance from bank where id=1");  
		while(rs.next())  
			
		System.out.println(rs.getLong(1));  
		con.close();  
		
		}catch(Exception e)
		{ System.out.println(e);}  
		
		} 
}
