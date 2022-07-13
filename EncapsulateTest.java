package Owas;

class EncapsulateStudent{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class EncapsulateTest {

	public static void main(String[] args) {
		EncapsulateStudent ec=new EncapsulateStudent();
		ec.setName("owashim");
		System.out.println(ec.getName());
	}

}
