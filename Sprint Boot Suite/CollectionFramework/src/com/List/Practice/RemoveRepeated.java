package com.List.Practice;

import java.util.ArrayList;

public class RemoveRepeated {

	public static void main(String[] args) {
		 ArrayList<Integer> li = new ArrayList<>();
		  li.add(4);
		  li.add(1);
		  li.add(9);
		  li.add(4);
		  li.add(8);
		  li.add(0);
		  li.add(5);
		  li.add(1);
		  li.add(8);
		  li.add(6);
		  
		 ArrayList<Integer> result = new ArrayList<>();
		  for(int i: li) {
			  int count = 0;
			for(int j: li) {
				if(i == j) {
					count++;
				}
			}
			if(count  == 1) {
				result.add(i);
			}
		  }
		  System.out.println(result);
		   
	}

}
