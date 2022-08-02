package exception;

public class MyCalculator {
	
	public static  long Power(int n,int p) {//static method
		
		 if (n<0 || p <0) {//if n and p is less than 0 then nthrow this exception
			 throw new ArithmeticException("n or p should not be negative");
		}
		 if(n==0 && p==0) {//if both are zero then throw this
			 throw new ArithmeticException("n or p should not be zero");
		 }
		 else	//else calculate n^p
		return (long)(Math.pow(n, p));
	}

	public static void main(String[] args) {
		
		System.out.println(Power(0,0));

	}

}
