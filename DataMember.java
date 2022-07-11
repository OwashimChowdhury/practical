/*
 * @author:Owashim chowdhury
 * java program of data member
 */
package Owas;

class Member{
	 int carspeed=50;
}

public class DataMember extends Member{
	
	int carspeed=80;
	
	public static void main(String[] args) {
		DataMember db =new DataMember();
		System.out.println(db.carspeed);
	
	}
}
