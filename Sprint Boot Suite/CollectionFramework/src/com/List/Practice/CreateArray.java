package com.List.Practice;

import java.util.ArrayList;

public class CreateArray {
  public static void main(String[] args) {
	  ArrayList<String> li = new ArrayList<>();
	  li.add("Baby");
	  li.add("Soap");
	  li.add("Ball");
	  li.add("Baby");
	  li.add("Baby");
	  li.add("Shampoo");
	  li.add("Ball");
	  li.add("Chalk");
	  li.add("Makeup");
	  
	  String[] arr = new String[li.size()];
	  for(int i = 0; i < li.size(); i++) {
		  arr[i] = li.get(i);
	  }
	  for(String ele:arr) {
		  
		  System.out.print(ele + " " );
	  }
  }
}
