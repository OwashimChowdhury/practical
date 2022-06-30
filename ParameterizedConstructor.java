/*
@author:Owashim chowdhury
Java program of parameterized constructor
*/
package Owas;

public class ParameterizedConstructor {
	int id;
	String name;
	ParameterizedConstructor(int k, String s){		//creating constructor
		id=k;
		name=s;
	}
	
	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		ParameterizedConstructor rv=new ParameterizedConstructor(55,"Owashim");
		rv.display();		//called method
		
	} 
}		//end of class
