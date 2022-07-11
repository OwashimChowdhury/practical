/*
 * @author:Owashim chowdhury
 * java program of abstract class 
 */
package Owas;

abstract class Abstract { //parent class
	abstract void run();
}
	public class AbstractClass extends Abstract{	//child class
		void run() {	//method
			System.out.println("running mode is on");
		}
	
	public static void main(String[] args) {
		AbstractClass ch =new AbstractClass();	//object of AbstractClass
		ch.run();	//calling run method
	}
	}	//end of class


