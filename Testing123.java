/*
 * @author:Owashim chowdhury
 * java program of polymorphism
 */
package Owas;

class Allanimal{
	void foodHabit() {
		System.out.println("all");
	}
}
class Lion extends Allanimal{
	void foodHabit() {
		System.out.println("meat");
	}
}
class Sheep extends Allanimal{
	void foodHabit() {
		System.out.println("grass");
	}
}
public class Testing123 {

	public static void main(String[] args) {
		//creating object
		Allanimal 	a1=new Lion();
		a1.foodHabit();	//calling
		Allanimal 	a2=new Sheep();
		a2.foodHabit();		//calling
	}
}
