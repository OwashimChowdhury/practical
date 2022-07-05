/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java program of Is A Inheritance
 */
package Owas;
class Inherit{
	int salary=30000;
}
public class Inheritanceisa extends Inherit{ //child class of Inherit
int bonus=1000;
	 public static void main(String[] args) {
		 
Inheritanceisa sc=new Inheritanceisa();	//object of child class
   System.out.println(sc.salary);
   System.out.println(sc.bonus);
		
	}	//end of main method
}	//end of class
