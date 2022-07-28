package string;
//author owashim chowdhury
public class String123 {
	public static void my(){
		StringBuffer s=new StringBuffer("Hello");//declaring and initializing stringBuffer
		s.append("world");//append method
		System.out.println(s);
		s.insert(2, "riya");//insert the string in 2 index
		System.out.println(s);
		s.replace(1, 3, "java");//replace
		System.out.println(s);
		
		StringBuilder s1=new StringBuilder("world");
		s1.replace(1, 3, "java");//replace the 1&2 index
		System.out.println(s1);
		s1.delete(1, 3);//delete 1&2 index
		System.out.println(s1);
		s1.reverse();//reverse the string
		System.out.println(s1);
	}

	public static void main(String[] args) {
		my();//calling

	}

}
