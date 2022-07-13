package Assignment;

import java.util.Scanner;

class Encapsulation{
	public static void main(String[] args) {
		
	
	String name;
	long userId;
	long password;
	int sub1,sub2,sub3,sub4,sub5;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a name:");
	name=sc.nextLine();
	System.out.println("Enter userId:");
	 userId=sc.nextInt();
	System.out.println("Enter password:");
	password=sc.nextInt();
	System.out.println("Enter sub1:");
	sub1=sc.nextInt();
	System.out.println("Enter sub2:");
	sub2=sc.nextInt();
	System.out.println("Enter sub3:");
	 sub3=sc.nextInt();
	System.out.println("Enter sub4:");
	sub4=sc.nextInt();
	System.out.println("Enter subm5:");
	 sub5 =sc.nextInt();
	
	
	Encap en=new Encap();
	en.setName(name);
	en.setuserId(userId);
	en.setPassword(password);
	System.out.println("Name:"+en.getName()+" "+en.getUserid()+" "+en.getpassword());
	en.calculate(sub1, sub2, sub3, sub4, sub5);
	System.out.println(en.percentage+" "+en.total);
	
	}
	    
}

 class  Encap {
	
	private String Name;
	private long userId;
	private long password ;
	int total, percentage;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name=name;
	}
	
	public long getUserid() {
		return userId;
	}
	public void setuserId(long userId) {
		this.userId=userId;
	}
	public long getpassword() {
		return password ;
	}
	public void setPassword(long password) {
		this.password=password;
	}
	
	public double getPercentage() {
		
		return percentage;
	}
	

	public void calculate(int sub1,int sub2,int sub3,int sub4,int sub5) {
			total=(sub1+sub2+sub3+sub4+sub5);
			percentage =total/5;
		} 
 }
