package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linked list no.1
		LinkedList<String> arr=new LinkedList<String>();
		arr.add("owsafcd");
		arr.add("owsa12345");
		//linked list no. 2
		LinkedList<String> arr1=new LinkedList<String>();
		arr.add("jkdjf");
		arr.add("kdjkj345");
		
		arr.addAll(1, arr1);//adding an element at specific position
		arr.addFirst("i am");//adding a element at first position
		arr.addLast("i am last");//adding at last position
		
		//removing specific elements from linkedlist
		arr.remove("owsafcd");
		//removing specific position elements from linkedlist
		arr.remove(1);
		//remove new elements
		arr.removeAll(arr1);
		//remove 1st element
		arr.removeFirst();
		//remove first occurance
		arr.removeFirstOccurrence("i am last");
		//remove all the elements
		arr.clear();	
Iterator<String> itr=arr.iterator();//iterator
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
