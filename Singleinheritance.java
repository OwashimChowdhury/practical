/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java program of Single Inheritance
 */
package Owas;

class Vehicle{	//parent class
	void run() {
		System.out.println("Audi");
	}
}
	class Num extends Vehicle{	//child class
		void features() {
			System.out.println("Super car");	
		}
	}

public class Singleinheritance {

	public static void main(String[] args) {	//main method
		Num sc=new Num();	//object of child class
		sc.run();	//calling parent class
		sc.features();	//calling child class
	}	//end of main method
}	//end of class
