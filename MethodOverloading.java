/*
 * @author OWASHIM CHOWDHURY
 *  java program of Method overloading using Different Number of variable
 */
package Owas;
  class Addition{
	 static int add(int a,int b) {	//1st method
		return (a+b);  
	  }
	 static int add(int a,int b,int c) {	//2nd method
			return (a+b+c);  
		  }
  }
public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Addition.add(10,10));	//calling 
		System.out.println(Addition.add(10,10,15));
		
	}

}
