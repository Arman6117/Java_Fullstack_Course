package com.StringMethods.Assignments;

public class _14_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JavaJ";
		
		StringBuilder sb = new StringBuilder(str);
		String reversedString = sb.reverse().toString();
		
		if(str.equals(reversedString)) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}