/*
 * @Author:OWASHIM CHOWDHURY
 * COPY CONSTRUCTOR JAVA PROGRAM
 */
package Owas;
class Copyconstructor1{
	private String name= "owashim";
	Copyconstructor1(String name){
		this.name=name;
	}
	Copyconstructor1(Copyconstructor1 c){
		this.name=c.getName();
		
	}
	public String getName() {
			return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}	
public class CopyConstructor {
	public static void main(String[]args) {
		
	Copyconstructor1 c1 =new Copyconstructor1("owashim");
	Copyconstructor1 cloneofc1=new Copyconstructor1(c1);	//copy
	c1.setName("rahul");
	
     System.out.println("student name is:"+ c1.getName());
   
     System.out.println("student name is:"+ cloneofc1.getName());    
}	//end of main method
}	//END OF CLASS
