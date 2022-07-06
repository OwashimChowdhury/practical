/*
 * @author OWASHIM CHOWDHURY
 *  java program of Aggregation
 */
package Owas;

class Address {
	String city,state,country;
	 Address(String city,String state,String country){
		 this.city=city;
		 this.state=state;
		 this.country=country;
	 }
}
public class AggregationStudents {
 int id;
String name;
 Address address;
  AggregationStudents(int id, String name, Address address){
	 this.id=id;
	 this.name=name;
	 this.address=address;
 }
 void display() {
	 System.out.println(id+" "+name);
	 System.out.println(address.city+" "+address.state+" "+address.country); 
 }
	public static void main(String[] args) {
		Address ad=new Address("malda","WB","india");	//object of  Address class
		AggregationStudents sc=new AggregationStudents(12,"owashim",ad);	//object of Students class
		sc.display();
		
	}	//end of main method

}	//end of 
