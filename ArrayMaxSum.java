/*
 * author:owashim chowdhury
 * java program to print max,min,sum,average from an array
 */
package Array;

import java.util.Scanner;

public class ArrayMaxSum {

	public static void main(String[] args) {
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length:");	//taking array length from user
		int arraylength=sc.nextInt();
		int [] array=new int[arraylength];	//initializing array
		System.out.println("enter the elements");	//taking values of array from user
		for(int i=0;i<arraylength;i++) {	//for loop[ to store the values
			array[i]=sc.nextInt();
		}
		int max=array[0];
		for (int i=0;i<array.length;i++) {
			if (max<array[i]) {	//logic
				max=array[i];}
		}
		System.out.println("maximum number is: "+max);	//printing the maximum value
		
		//sum of the array elements
		int sum=0;
		for (int i=0;i<array.length;i++) {
			sum=sum+array[i];	//logic
		}
		System.out.println("sum is:"+sum);//printing the sum of elements
		
		//minimum number in the array
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if (min>array[i]) {	//logic
				min=array[i];}
		}
		System.out.println("minimum number is:"+min);//printing minimum number
		
		//average of the array elements
		double avg=sum/arraylength;	//logic
		System.out.println("avg is:"+avg);	//printing average of array elements
		
	}
}
