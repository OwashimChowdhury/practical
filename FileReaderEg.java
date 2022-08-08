package IOstream;


import java.io.FileReader;


public class FileReaderEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	

	FileReader obj1=new FileReader("E:\\java\\too.txt");//Reads text from character files using a default buffer size
	int i;
	while ((i=obj1.read())!=-1) {//while loop
		System.out.println((char)i);//print characters
	}
	
	obj1.close();

}
catch (Exception e) {
	System.out.println(e);
}
	}
}
