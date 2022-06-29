package Owas;

public class AreaOfSquare {
	int length;
	void put(int l) {
		
		length=l;
		
	}
	void calculation() {
		
		System.out.println(length*length);
		
		
	}
	

	public static void main(String[] args) {
		
		AreaOfSquare s1=new AreaOfSquare();
		s1.put(5);
		s1.calculation();
	}

}
