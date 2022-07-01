/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java Static method program
 */
package Owas;
 class Static {

		int id;	//instance variable
		String name;
		static String college="IMPS";	//Static variable
		
		Static(int i,String n){
			id=i;
			name=n;
		}
		static void change() {
			college="Techno india";
		}
		void display() {
			System.out.println(id+" "+ name +" "+college);	//print
		}
	}

	public class StaticMethod {

		public static void main(String[] args) {
			
			Static.change();
			Static s1=new Static(01,"owashim");
			s1.display();	//method calling		
	}	//end of main method
	
}		//end of class
