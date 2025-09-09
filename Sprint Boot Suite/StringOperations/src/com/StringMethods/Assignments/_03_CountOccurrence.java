package com.StringMethods.Assignments;

public class _03_CountOccurrence {
  public static void main(String[] args) {
	   String str = "Hello World";
	   int count = 0;
	   for(int i = 0; i < str.length(); i++) {
		   if(str.charAt(i) =='l') count++;
	   }
	   
	   System.out.println("Number of occurrences of l in string: " + count);
  }
}
