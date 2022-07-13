/*
 * @author:owashim Chowdhury
 * java program of interface
 */
package Owas;
//creating an interface
interface A1{
	void display();
}
public class InterfaceTest implements A1{
public void display() {
	System.out.println("tik tik 12345");
}
	public static void main(String[] args) {
		//creating object
		InterfaceTest it=new InterfaceTest();
		it.display();
	}
}
