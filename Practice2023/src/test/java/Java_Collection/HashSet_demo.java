package Java_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_demo {
	//Difference between hashset and linked hashset is that in hashset insertion order is not preserved
	 //where in the linked hashset insertion order is preserved.

	public static void main(String[] args) 
	{
//		HashSet hs=new HashSet();
//		LinkedHashSet lhs= new LinkedHashSet();
//		
//		
//		hs.add(12);
//		hs.add("hellllo");
//		hs.add("java");
//		hs.add(12.525);
//		hs.add(null);
//	
//		
//		System.out.println(hs);
//		
//		hs.remove("java");
//		hs.remove(0);
//		System.out.println(hs);
//		
//		System.out.println(hs.size());
//		
//		System.out.println(hs.isEmpty());
//		
//		System.out.println(hs.contains(null));
//		
//		HashSet<Integer> hs1=new HashSet<Integer>();
//		hs1.add(11);
//		hs1.add(12);
//		hs1.add(15);
//		hs1.add(188);
//		hs1.add(18);
//		
//		
//		HashSet<Integer> hs2=new HashSet<Integer>();
//		hs2.add(11);
//		hs2.add(12);
//		hs2.add(51);
//		hs2.add(118);
//		hs2.add(550);
//		
//		
//		System.out.println(hs1);
//		System.out.println(hs2);
//		
//		System.out.println(hs1);
//		
//		//union
//		hs2.addAll(hs1);
//		System.out.println(hs2);
//		
//		
//		//intersection
//		hs2.retainAll(hs1);
//		System.out.println(hs2);
//		
//		hs2.removeAll(hs1);
//		System.out.println(hs1);
	
		
	//	HashSet hh=new HashSet();
		LinkedHashSet hh= new LinkedHashSet();
		
		hh.add(1);
		hh.add(2);
		hh.add(0);
		hh.add(4);
		hh.add(55);
		hh.add(6);
		
		System.out.println(hh);
		
		
		
	}

}
