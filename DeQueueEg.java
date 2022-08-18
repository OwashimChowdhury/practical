package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueEg {

	public static void main(String[] args) {

		Deque<String> deque=new ArrayDeque<String>();//A linear collection that supports element insertion and removal atboth ends
		//adding value
		deque.add("ram");
		deque.add("karan");
		deque.add("riya");
		deque.add("priya");
		deque.add("sam");
		deque.add("ajay");

		for(String str:deque) {//for each loop to print
			System.out.println(str);
		}
		deque.addFirst("shree");//add at first position
		deque.addLast("riya");//add at last position
System.out.println("new list:");
for(String str:deque) {
	System.out.println(str);//after adding result
}
deque.removeFirst();//remove first position
deque.removeLast();//remove last position
		
		System.out.println("after remove:");
		for(String str:deque) {
			System.out.println(str);//after remove result
		}

	}

}
