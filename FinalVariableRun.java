/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java program of final variable
 */
package Owas;

public class FinalVariableRun {	//created a class
	
		
		final int age=30;  //final variable
		void run() {
			System.out.println("your age is:"+age);
		}

		public static void main(String[] args) {
			FinalVariableRun sc=new FinalVariableRun();	//creating object
			sc.run();	//calling method
		}

	}


