package com.List.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAvg {
   public static void main(String[] args) {
	   ArrayList<Integer> li = new ArrayList<Integer>();
	   int sum = 0;
	   float avg;
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter elements");
	   for(int i = 0; i<=5; i++) {
		   int n = in.nextInt();
		   li.add(n);
	   }
	   
	   for(int i: li) {
		   sum += i;
	   }
	   avg = sum / li.size();
	   System.out.println("Sum:- " + sum + " avg:- " + avg);
	   
   }
}
