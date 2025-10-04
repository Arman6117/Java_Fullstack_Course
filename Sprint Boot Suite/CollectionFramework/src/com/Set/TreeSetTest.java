package com.Set;


import java.util.TreeSet;

public class TreeSetTest {

	
	public static void main(String[] args) {
		
		//Stored in sorting order
		TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(91);
        ts.add(30);
        ts.add(10);
        System.out.println(ts.subSet(1, 31));
        System.out.println(ts);
	}

}
