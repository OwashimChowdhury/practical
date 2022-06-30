/*
@author:Owashim chowdhury
Java program of  Default constuctor
*/
package Owas;

public class Defaultcons {
	String name;
	Defaultcons(){
		System.out.println("cons called");
		name="owashim";
	}
	

	public static void main(String[] args) {
		Defaultcons rv=new Defaultcons();
		System.out.println(rv.name);	//called

	}

}		//end of class
