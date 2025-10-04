package com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		//Store on basis of hash code
		hs.add(10);
//		System.out.println("Hash Code:10 " + hs.hashCode());
		hs.add(50);
//		System.out.println("Hash Code:50 " + hs.hashCode());
		hs.add(20);
//		System.out.println("Hash Code:20 " + hs.hashCode());
		hs.add(30);
//		System.out.println("Hash Code:30 " + hs.hashCode());
		hs.add(40);
//		System.out.println("Hash Code:40 " + hs.hashCode());
		hs.add(40);
		//hs.cleaar()
		System.out.println(hs.size());
		System.out.println(hs.contains(10));
		
		
		
		Iterator<Integer> ii = hs.iterator();
	     System.out.println("Fetching data with iterator: ");
		 while(ii.hasNext()) {
			 System.out.print(ii.next() + " ");
		 }
		 System.out.println();
		 
		 System.out.println("Fetching data with for each: ");
		 for(Integer x : hs) {
			 System.out.print(x + " ");
		 }
		 System.out.println();
		System.out.println(hs);

	}

}
