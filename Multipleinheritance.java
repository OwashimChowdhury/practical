/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java program of multiple Inheritance
 */
package Owas;

class Vehicle123{
	void run() {
		System.out.println("owashim");
	}
}
	class Num122 extends Vehicle123{	//child class of Vehicle123
		void features() {
			System.out.println("good");	
		}
	}
	class Bmw12 extends Num122{	//child class of Num122
		void speed() {
			System.out.println("200km/h");
		}
	}

public class Multipleinheritance {

	public static void main(String[] args) {
		Bmw12 sc1=new Bmw12();	//object of child class Bmw1 
		sc1.run();	//calling parentClass Method 
		sc1.features();	//calling Child class method
		sc1.speed();	//calling child class method
		

	}

}
