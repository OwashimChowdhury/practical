package IOstream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte []arr= {65,86,66,76};//array
ByteArrayInputStream obj=new ByteArrayInputStream(arr);//A ByteArrayInputStream containsan internal buffer that contains bytes thatmay be read from the stream.  


int i=0;
while ((i=obj.read())!=-1) {//logic
	char ch=((char )i);
	System.out.println("ascii character "+i+ " value is"+ch);//print ascii character
}	}

}

