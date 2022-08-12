package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedlistEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating linked list
		LinkedList<String> arr=new LinkedList<String>();
		arr.add("owsafcd");
		arr.add("owsa12345");
		arr.add("rahul"	);
		//traversing the elements in reverse order
		Iterator<String> itr=arr.descendingIterator();//iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
	}

}
}