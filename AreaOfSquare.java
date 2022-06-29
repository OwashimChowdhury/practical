/*
@author:Owashim chowdhury
Java program to calculate Area Of square
*/
package Owas;

public class AreaOfSquare {
	int length;
	void put(int l) {
		
		length=l;	
	}
	void calculation() {
		
		System.out.println(length*length);	//calculation or logic
	}
	public static void main(String[] args) {
		
		AreaOfSquare s1=new AreaOfSquare();
		s1.put(5);  //calling
		s1.calculation(); //calling
	} 		//end of main method

}		//end of class
