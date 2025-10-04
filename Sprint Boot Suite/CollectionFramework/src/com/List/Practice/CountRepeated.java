package com.List.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class CountRepeated {
  public static void main(String[]args) {
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
	  
	    Collections.sort(li, Collections.reverseOrder());
	  System.out.println(li);
    
	  Map<String, Integer> freq = new HashMap<>();
	  
	  for(String ele:li) {
		  System.out.println(freq.getOrDefault(ele,0));
		  freq.put(ele, freq.getOrDefault(ele,0)+1);
	  }
	  System.out.println(freq);
	  
//      Set<Entry<String, Integer>> entry = freq.entrySet();
//     System.out.println(entry);
      
      for(String keys: freq.keySet()) {
    	if(freq.get(keys) > 1) {
    		System.out.println(keys + " = " + freq.get(keys) );
    	}
      }
}
}
