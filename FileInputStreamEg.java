package IOstream;

	import java.io.FileInputStream;

	public class FileInputStreamEg {	//main class
		
		

		public static void main(String[] args) { //main method
			try {
				FileInputStream obj = new FileInputStream("E:\\java\\text.txt");
				int i = obj.read();
				System.out.println(((char)i));
				//while loop
				int j = 0;
				while((j=obj.read())!=-1) {
					System.out.println(((char)j));	//print the value of the file
				}
				
				
				obj.close();			//closing the file
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
	
}
}