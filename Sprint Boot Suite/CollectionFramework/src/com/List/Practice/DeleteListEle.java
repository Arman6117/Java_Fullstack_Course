package com.List.Practice;

import java.util.ArrayList;
import java.util.List;

public class DeleteListEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> li1 = new ArrayList<>();
      List<Integer> li2 = new ArrayList<>();
      
      li1.add(4);
      li1.add(9);
      li1.add(8);
      
      li2.add(4);
      li2.add(1);
      li2.add(9);
      li2.add(4);
      li2.add(8);
      li2.add(0);
      li2.add(5);
      li2.add(1);
      li2.add(8);
      
      li2.removeAll(li1);
      
      System.out.println(li2);
      
	}

}
