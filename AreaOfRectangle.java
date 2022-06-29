/*
@author:Owashim chowdhury
Java program to calculate Area Of Rectangle
*/
package Owas;
public class AreaOfRectangle {

	int length;
	int width;
	void put(int l ,int w) {   //creating method
		
		length=l;
		width=w;
		
	}
	void calculation() {
		
		System.out.println(length*width);   //calculation
	}
	
	public static void main(String[] args) {
		
		AreaOfRectangle s1=new AreaOfRectangle();  //creating object
		s1.put(20,5);     //calling 
		s1.calculation();	//calling
	} 	//end of main method

}		//end of class


