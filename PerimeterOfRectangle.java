/*
@author:Owashim chowdhury
Java program to calculate perimeter of rectangle
*/
package Owas;

public class PerimeterOfRectangle {
	
		int length;
		int width;
		void put(int l, int w) {
			
			length=l;
			width=w;
		}
		void calculation() {
			
			System.out.println(2*(length+width));	//logic
			
		}
		
		public static void main(String[] args) {
			
			PerimeterOfRectangle s1=new PerimeterOfRectangle();	//object initialization
			s1.put(10,5);		//method calling
			
			s1.calculation();		//method calling
		}	//end of main method

	}	//end of class
	

