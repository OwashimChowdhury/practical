package Owas;
public class AreaOfRectangle {

	int length;
	int width;
	void put(int l,int w) {
		
		length=l;
		width=w;
		
	}
	void calculation() {
		
		System.out.println(length*width);
		
		
	}
	

	public static void main(String[] args) {
		
		AreaOfRectangle s1=new AreaOfRectangle();
		s1.put(20,5);
		s1.calculation();
	}

}


