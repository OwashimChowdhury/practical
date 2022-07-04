/*
 * @Author :owashim chowdhury
 * java program of final variable error
 */

package Owas;

public class FinalVariable {
	
	final int age=30;
	void run() {
		age=50;	//we can not reassign a final variable
		System.out.println("your age is:"+age);
	}

	public static void main(String[] args) {
		FinalVariable sc=new FinalVariable();
		sc.run();
	}	//end of main method

}		//end of class
