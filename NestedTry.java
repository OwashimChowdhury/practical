package exception;
//author owashim chowdhury
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//outer try block
			try {//inner try block
				int i=50/0;//arithmatic exception logic
			}
			catch(ArithmeticException e) {//inner catch block
				System.out.println("arithmetic exception");
			}
		
		}
		catch(Exception e) {//outer catch block 
			System.out.println(e);
		}
		System.out.println("bye");

	}

}
