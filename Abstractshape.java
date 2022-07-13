/*
 * @author:Owashim chowdhury
 * java program of abstract class 
 */
package Owas;

abstract class Drawing1{
	abstract void shape();	//abstract method
	
}
//creating child class
 class Circle1 extends Drawing1{
	void shape() {
		System.out.println("shape is circular");
	}
}
class Triangle1 extends Drawing1{
	void shape() {
		System.out.println("shape is triangular with 3 sides");
	}
}
class Square1  extends Drawing1{
	void shape() {
		System.out.println("shape is square type with 4 sides");
	}
}

public class Abstractshape {

	public static void main(String[] args) {
		Drawing1 cc=new Circle1();
		cc.shape();	//calling cycle class method
		
	}	//end of main method
}	//end of class
