/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java program of Herical Inheritance
 */
package Owas;
	class Vehicle12{	//parent class
		void run() {
			System.out.println("owashim");
		}
	}
		class Num12 extends Vehicle12{	//child class of Vehicle12 
			void features() {
				System.out.println("good");	
			}
		}
		class Bmw1 extends Vehicle12{	//child class of Vehicle12
			void speed() {
				System.out.println("200km/h");
			}
		}

	public class Hericalinheritance {

		public static void main(String[] args) {
			Bmw1 sc2=new Bmw1();	//object of Bmw1 Child class
			sc2.run();	//calling parentClass method
			sc2.speed();	//calling child class method
		}

	}
