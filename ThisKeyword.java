/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java program of this keyword
 */
package Owas;
 class Keyword{
int id;
String name;

Keyword(int id,String name){
	this.id=id;
	this.name=name;
}

void display() {
	System.out.println(id+" "+ name);
}
}	//end of 'Keyword' class
public class ThisKeyword {
	public static void main(String[] args) {
		//object creation
     Keyword s1=new Keyword(9,"owashim");
     Keyword s2=new Keyword(55,"Rahul");
		s1.display();
		s2.display();
	}	//end of main method
}		//end of class
