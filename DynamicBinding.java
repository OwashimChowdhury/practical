/*
 * @author:Owashim chowdhury
 * java program of Dynamic Binding
 */
package Owas;
class Bind{
	 int cost=100;
}

class DynamicBinding extends Bind{
	 int cost=200;
	public static void main(String[] args) {
		DynamicBinding db =new DynamicBinding();
		System.out.println(db.cost);

	}

}
