/*
 * @author:Owashim chowdhury
 * java program of polymorphism
 */
package Owas;

class Drawing{
	void shape(){
		System.out.println("draw a shape");
	}
}
class Circle extends Drawing{
	void shape() {
		System.out.println("shape is circular");
	}
}
class Triangle extends Drawing{
	void shape() {
		System.out.println("shape is triangular with 3 sides");
	}
}
class Square  extends Drawing{
	void shape() {
		System.out.println("shape is square, with 4 sides");
	}
}

public class ShapeDetails {

	public static void main(String[] args) {
		//creating objects
		Drawing cc=new Circle();
		Drawing cc1=new Triangle();
		Drawing cc2=new Square();
		cc.shape();		//calling 
		cc1.shape();	//calling 
		cc2.shape();	//calling 
	}

}
