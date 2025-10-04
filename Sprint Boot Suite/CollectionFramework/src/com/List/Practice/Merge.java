package com.List.Practice;

import java.util.ArrayList;

public class Merge {
  public static void main(String[] args) {
	  ArrayList<Integer> li1 = new ArrayList<Integer>();
	  ArrayList<Integer> li2 = new ArrayList<Integer>();
	  
	  li1.add(1);
	  li1.add(2);
	  li1.add(3);
	  li1.add(4);
	  
	  li2.add(5);
	  li2.add(6);
	  
	  li1.addAll(li2);
	  
	  System.out.println(li1);
  }
}
