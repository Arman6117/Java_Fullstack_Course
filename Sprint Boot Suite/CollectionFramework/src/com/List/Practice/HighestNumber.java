package com.List.Practice;

import java.util.ArrayList;

public class HighestNumber {
  public static void main(String[] args) {
	  ArrayList<Integer> li = new ArrayList<>();
	  li.add(4);
	  li.add(7);
	  li.add(8);
	  li.add(4);
	  li.add(4);
	  li.add(4);
	  li.add(8);
	  li.add(1);
	  
	  int count = 0;
	  int prevCount = 0;
	  int ele = li.get(count);
	  for(int i = 1; i < li.size(); i++) {
		  if(li.get(i) == li.get(i-1)) {
			  prevCount = count;
			  count++;
		  }
		  count = 1;
		  if(count > prevCount) {
			  ele = li.get(i);
		  }
	  }
	  System.out.println(ele);
	   
  }
}
