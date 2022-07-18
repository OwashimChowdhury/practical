/*
 * author:owashim chowdhury
 * java program to print sum of odd no.s of an array
 */
package Array;

import java.util.Scanner;

public class ArrayOddNoSum {

	public static void main(String[] args) {
		//creating a Scanner class object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length:");//taking array length from user
		int arraylength=sc.nextInt();//storing the value to arraylenth variable
		int arr[]=new int[arraylength];//declaring an array
		System.out.println("enter array values:");//taking the values of array from user
		for (int i=0;i<arr.length;i++) {//for loop to store the values index wise
			arr[i]=sc.nextInt();
		}
		int oddno=0;
		for(int i=0;i<arr.length;i++) {//for loop to find odd numbers
			if (arr[i]%2!=0)//logic to find odd no.
				oddno=oddno+arr[i];//sum o f odd no.s
		}
		System.out.println("sum of odd no. is:"+oddno);//printing the sum of odd numbers
		
	}

}
