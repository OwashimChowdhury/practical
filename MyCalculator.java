package exception;

public class MyCalculator {
	
	public static  long Power(int n,int p) {
		
		 if (n<0 || p <0) {
			 throw new ArithmeticException("n or p should not be negative");
		}
		 if(n==0 && p==0) {
			 throw new ArithmeticException("n or p should not be zero");
		 }
		 else
		return (long)(Math.pow(n, p));
	}

	public static void main(String[] args) {
		
		System.out.println(Power(0,0));

	}

}
