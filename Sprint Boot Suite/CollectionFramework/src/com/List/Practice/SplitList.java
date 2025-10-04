package com.List.Practice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SplitList {
  public static void main(String[] args) {
	  ArrayList<Integer> li = new ArrayList<Integer>();
	   Scanner in = new Scanner(System.in);
	   LinkedList<Integer> li1 = new LinkedList<>();
	   
	   li1.add(2);
//	   li1.rem
	
	   System.out.println("Enter elements");
	   for(int i = 0; i<=5; i++) {
		   int n = in.nextInt();
		   li.add(n);
	   }
	   
	   int mid = li.size() / 2;
	   List list1 = li.subList(0, mid);
	   List list2 =   li.subList(mid, li.size());
	   System.out.println("List 1:-" + list1 + " List 2:- " + list2);
  }
}
