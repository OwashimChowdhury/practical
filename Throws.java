package exception;

public class Throws {
	public static void display(int a) throws ArithmeticException{//throws block
		if(a>=0 && a<=35)//if a between 0 to 35 it will throw arithmetic exception
			throw new ArithmeticException("you are fail");
		else
			System.out.println("you are pass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
display(15);//calling
	}

}
