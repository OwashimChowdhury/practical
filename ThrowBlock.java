package exception;

public class ThrowBlock {
	public static void check(int age) {
		if (age<18) {//if age less than 18 the throw
			throw new ArithmeticException("not eligible");//it will throw the exception
		}
		else {
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(15);//calling

	}

}
