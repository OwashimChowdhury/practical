/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * STATIC VARIABLE JAVA PROGRAM
 */
package Owas;

class Staticvariable{
	int id;
	String name;
	static String college="IMPS";
	
	Staticvariable(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+ name +" "+college);	//print 
	}
}

public class StaticKeyword {

	public static void main(String[] args) {	//MAIN METHOD STARTS
		//object creation
		Staticvariable s1=new Staticvariable(01,"owashim");
		s1.display();	//calling display() method
				
	}	//end of main method
}		//end of class
