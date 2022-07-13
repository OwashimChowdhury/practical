package Owas;

abstract class AbstractClass1{
	AbstractClass1(){
		System.out.println("abstract is created");
	}
	abstract void run();
	
	void carspeed() {
		System.out.println("good speed");
	}
	
}
class Child123 extends  AbstractClass1{
	void run() {
		System.out.println("Owashim");
	}
	
	
}

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
