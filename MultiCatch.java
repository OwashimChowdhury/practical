package Owas;

public class MultiCatch {
	
	
	public void show() {
	
		try {
			int i=50/0;   				//no.1
			System.out.println(i);
			
			int arr[]=new int[3]; 		//no.2
			arr[4]=12;
		}
		//multiple catch block
		catch(ArithmeticException e)//arithmetic exception for no.1
		{
			System.out.println(e);
		}
		catch(Exception e)		//for no.2
		{
			System.out.println(e);
		}
	
	}

	public static void main(String[] args) {
		MultiCatch m=new MultiCatch();
	m.show();//calling

	}

}
