package com.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);

         lhs.addFirst(0);
         lhs.addLast(50);
        System.out.println(lhs);
        lhs.removeFirst();
        lhs.removeLast();
        System.out.println(lhs);
        
        System.out.println(lhs.getFirst());
        System.out.println(lhs.getLast());
        

	}

}
