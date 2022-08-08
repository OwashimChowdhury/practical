package IOstream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream obj1=new FileOutputStream("E:\\java\\Sample1.txt");//Creates a file output stream to write to the file with thespecified name
FileOutputStream obj2=new FileOutputStream("E:\\java\\Sample2.txt");//Creates a file output stream to write to the file with thespecified name
ByteArrayOutputStream obj=new ByteArrayOutputStream();//for writing data to a File
obj.write(65);
obj.writeTo(obj1);//write in obj1
obj.writeTo(obj2);//write in obj2 
obj.close();
System.out.println("Done...");


	}

}
