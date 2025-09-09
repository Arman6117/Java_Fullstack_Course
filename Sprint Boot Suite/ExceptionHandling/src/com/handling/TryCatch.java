package com.handling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {1,2,3,5};
      int res;
       try {
    	   int value = arr[0];
    	   try {
    		   res =value/0;
			
		} catch(ArithmeticException e) {
	    	   System.out.println("Divide by zero");
	       }
    	   
       } catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println("Invalid index");
       } finally {
    	   System.out.println("Exception hanlded");
       }
       
       System.out.println("Program end");
	}

}
