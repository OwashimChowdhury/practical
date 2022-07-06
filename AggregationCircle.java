/*
 * @author OWASHIM CHOWDHURY
 *  Java program of aggregation.
 */
package Owas;

class Aggregation{
	int square(int n) {
		return n*n;
	}
}
public class AggregationCircle {
	Aggregation ag;
	double pi=3.14;
	double area (int radius) {
		ag =new Aggregation();
		int psquare=ag.square(radius);
		return pi*psquare;
	}
	public static void main(String[] args) {
		
AggregationCircle c=new AggregationCircle();	//object
double result=c.area(5);
System.out.println(result);

	}	//end of main method

}	//end of class
