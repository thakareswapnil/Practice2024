package Java_Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_demo {

	public static void main(String[] args) {
		
		LinkedList ls=new LinkedList();
		
		ls.add("swapnil");
		ls.add("thakare");
		ls.add(12);
		ls.add(10.25);
		ls.add("black");
		ls.add("cat");
		ls.add(750787);
		
		System.out.println(ls);
		
		//in removing the object from linkedlist we have to give index of the object which we have to remove 
		//
		
		
		ls.remove(2);
		System.out.println(ls);
		
		System.out.println(ls.size());
		
		System.out.println(ls.isEmpty());
		
		System.out.println(ls.contains(10.25));
		
		
		System.out.println(ls.get(5));
		
		ls.set(2,"helllo");
		System.out.println(ls);
		
		
		LinkedList ls1=new LinkedList();
		
		ls1.addAll(ls);
		System.out.println(ls1);
		
		
		ls1.removeAll(ls1);
		System.out.println(ls1);
		
		LinkedList <Integer >ls12=new LinkedList<Integer>();
		ls12.add(22);
		ls12.add(55);
		ls12.add(12);
		ls12.add(10);
		
		System.out.println(ls12);
		
		
		//sorting the linkedlist
		Collections.sort(ls12);
		
		System.out.println(ls12);
		
		
		//sorting the linkedlist in reverse order
		
		Collections.sort(ls12,Collections.reverseOrder());
		
		System.out.println(ls12);
		
		//shuffle the vlaue of linkedlist
		
		Collections.shuffle(ls12);
		
		
		System.out.println(ls12);
		
		
		//some other functions which is not present in the arraylist
		
		
		ls12.addFirst(0);
		ls12.addLast(100);
		
		System.out.println(ls12);
		
		
		System.out.println(ls12.getFirst());
		System.out.println(ls12.getLast());
		
		
		ls12.removeFirst();
		ls12.removeLast();
		
		System.out.println(ls12);
		
		
		
		
		
		
		
		
	}

}
