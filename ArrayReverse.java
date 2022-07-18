/*
 * author:owashim chowdhury
 * java program to print array elements in reverse order
 */
package Array;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length:");	//taking array length from user
		int arraylength=sc.nextInt();	//assigning the value to arraylength variable
		int [] array=new int[arraylength];	//initializing an array
		System.out.println("enter the elements");	//taking array elements from keyboard
		for(int i=0;i<arraylength;i++) {//for loop to initialize the value index wise
			array[i]=sc.nextInt();
		}
		for (int i=arraylength-1;i>=0;i--) {// for loop to print the value index wise
			System.out.println(array[i]);//printing the array elements
		}
	}

}
