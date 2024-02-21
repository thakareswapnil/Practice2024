package Java_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_demo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		// to add element
		al.add("swapnil");
		al.add("thakare");
		al.add(12);
		al.add(10.25);
		al.add("black");
		al.add("cat");
		al.add(750787);

		System.out.println(al);

		// add with index number

		al.add(2, "machhinddra");
		al.add(8, "hello");

		System.out.println(al);

		//
		al.remove("black");
		al.remove("5");

		System.out.println(al);

		// size of array
		System.out.println(al.size());

		// to retrive the value
		System.out.println(al.get(2));

		// to change the value
		al.set(2, "jaihind");
		System.out.println(al);

		// check the given value is present inthe arraylist or not and gives true and
		// false value
		System.out.println(al.contains("swapnil"));

		// is empty
		System.out.println(al.isEmpty());

		// to copy all value

		ArrayList duplicate = new ArrayList();

		duplicate.addAll(al);
		System.out.println(duplicate);

		// remove all

		duplicate.removeAll(duplicate);
		System.out.println(duplicate);

		// sort the arraylist using sort function

		ArrayList<Integer> al1 = new <Integer> ArrayList();

		// to add element
		al1.add(22);
		al1.add(55);
		al1.add(12);
		al1.add(10);
		
		Collections.sort(al1);
		
		System.out.println(al1);
		
		
		//sort in reverse order
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
		Collections.shuffle(al1);
		System.out.println(al1);
		System.out.println("**************************");
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		
		for(Integer a:al1)
		{
			System.out.println(a);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
