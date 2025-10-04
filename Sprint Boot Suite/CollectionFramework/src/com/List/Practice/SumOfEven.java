package com.List.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEven {
  public static void main (String[] args) {
	  ArrayList<Integer> li = new ArrayList<Integer>();
	   int sum = 0;
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter elements");
	   for(int i = 0; i<=5; i++) {
		   int n = in.nextInt();
		   li.add(n);
	   }
	   
	   for(int i: li) {
		   if(i%2 == 0) {
			   sum+= i;
		   }
	   }
	   
	   System.out.println("Sum:- " + sum);
  }
}
