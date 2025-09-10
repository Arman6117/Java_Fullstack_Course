package com.wrapper;



public class Test {

	public static void main(String[] args) {
		
		int a=10;
		//System.out.println(a);
		
		//Integer i1=new Integer(10);
		
		// Boxing
		Integer i1=Integer.valueOf(a);
		
		//Auto-Boxing
		Integer i2=a;
		
		System.out.println(i2);
		
		// Unboxing		
		Integer i3=12;
		
		int b=i3.intValue();
		
		// Auto-Unboxing
		int c=i3; 
		System.out.println(c);
		
		String s1="101";
		System.out.println(s1+5);
		Integer is1=Integer.valueOf(s1);
		System.out.println(is1+5);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		
		
		Byte b1=127;
		
		
		Integer I1=127;
		Integer I2=127;
		
		System.out.println(I1==I2);
		
		
		
		
		Character ch1='A';
		Character ch2='A';
		
		System.out.println(ch1==ch2);
		
//		for(int i=165; i<176; i++) {
//			System.out.println((char)i);
//		}
		
		Character ch3='©';
		Character ch4='©';
		
		System.out.println(ch3==ch4);
		
		System.out.println(Character.isDigit('6'));
		System.out.println(Character.isLetter('^'));
		
		
		String str4="5678.9876";
		
		//Double i=Double.parseDouble(str4);
		Double i=Double.valueOf(str4);
		System.out.println(i);
		
		Integer ii=456;
		String str5=String.valueOf(ii);
		System.out.println(str5);
		
		Character ch5='6';
		int i5=Integer.valueOf(ch5);
		System.out.println(i5);
		
	}

}