/*
 * @author OWASHIM CHOWDHURY
 *  java program of Method overloading using Different data type
 */
package Owas;

class Addition1{
	 static int add(int a,int b) {	//method 1, int data type
		return (a+b);  
	  }
	static double add(double a,double b) {	//method 2, double data type
			return (a+b);  
		  }
}
public class MethodOverloadingUsingDataType {

	public static void main(String[] args) {
		System.out.println(Addition1.add(10,10));
		System.out.println(Addition1.add(10,10.5));
		
	}	//end of main method
}	//end of class

