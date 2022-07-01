/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * if we not use this keyword problem occurs.
 */

package Owas;
class Keyword1{
int id;
String name;
 Keyword1(int id,String name){		//CONSTRUCTOR
	id=id;	//without this keyword problem
	name=name;	//without this keyword problem
}

void display() {
	System.out.println(id+" "+ name);
}
}
 class ThisKeywordProblem {  //class

	public static void main(String[] args) { //main method starts
	     Keyword1 s1=new Keyword1(8,"owashim");  //object created
	     Keyword1 s2=new Keyword1(55,"Rahul");
			s1.display();  //calling method
			s2.display();	//calling method
		}	//end of main method
}		//end of class
