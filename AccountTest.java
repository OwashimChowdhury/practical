package Owas;


class Account{
	private String name;
	private String email;
	private long account_no;
	private double ammount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public long getAccountNo() {
		return account_no;
	}
	public void setAccountNo(long account_no) {
		this.account_no=account_no;
	}
	
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount=ammount;
	}
	
}
public class AccountTest {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.setName("owashim");
		ac.setEmail("chowdhury@gmail.com");
		ac.setAccountNo(657687890);
		ac.setAmmount(50000.0);
		System.out.println(ac.getName()+" "+ac.getEmail()+" "+ac.getAccountNo()+" "+ac.getAmmount());
	}

}
