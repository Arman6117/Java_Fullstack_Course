package com.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackOperation {

	public static void main(String[] args) {
		/*
		 * LIFO -> Last In First Out
		 * FIFO -> First In First Out
		 * 
		 * Stack if following LIFO principle and it also class in java.
		 */
		/*
		Vector<Integer> v1=new Vector<>();
		
		v1.add(1);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		v1.add(7);
		//v1.add("Y1");
		
		System.out.println(v1);
		Integer sum=0;
		for(int i=0; i<v1.size(); i++) {
			sum+=(Integer)v1.get(i);
		}
		System.out.println(sum);
		*/
		/*
		ArrayList<String> v2=new ArrayList<String>();
		v2.add("Black");
		v2.add("Orange");
		
		Stack<String> s1=new Stack<>();
		
		s1.add("Red");
		s1.add("Yellow");
		s1.add("Blue");
		s1.addAll(v2);
		
		System.out.println(s1);
		
		System.out.println(s1.get(3));
		
		System.out.println(s1.contains("Orange"));
		
		System.out.println(	s1.remove("Yellow1"));
		
		//s1.clear();
		System.out.println(s1);
		
		s1.set(1, "Green");
		System.out.println(s1);
		*/
		Vector v1=new Vector(5);
		//System.out.println(v1.capacity());
		
		Stack<String> s2=new Stack<String>();
		
		s2.push("Orange");
		s2.push("Grey");
		s2.push("Blue");
		s2.push("Red");
		s2.push(null);
		
		//  public synchronized E peek();
		System.out.println(s2.peek());
		
		System.out.println(s2);
		//  public synchronized E pop();
		
//		System.out.println(s2.pop());
//		System.out.println(s2);
		
		//  public synchronized int search(java.lang.Object);
		System.out.println(s2.indexOf("Orange"));
		System.out.println(s2.search("Orange"));
		
		s2.clear();
		System.out.println(s2.isEmpty());
		System.out.println(s2.empty());
//		System.out.println(s2.capacity());
		
		
		
	}

}
/*
Compiled from "Stack.java"
public class java.util.Stack<E> extends java.util.Vector<E> {
  public java.util.Stack();
  public E push(E);
  public synchronized E pop();
  public synchronized E peek();
  public boolean empty();
  public synchronized int search(java.lang.Object);
}
*