package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
  public static void main(String[]args) {
	  Map<Integer, String> hs = new HashMap<>();
	  
	  hs.put(1, "Delhi");
	  hs.put(2, "Nagar");
	  hs.put(3, "Hydrabad");
	  hs.put(4, "Pune");
	  
	  System.out.println(hs);
  }
}
