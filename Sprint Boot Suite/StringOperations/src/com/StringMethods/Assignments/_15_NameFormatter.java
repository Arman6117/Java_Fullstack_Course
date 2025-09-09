package com.StringMethods.Assignments;

import java.util.Scanner;

public class _15_NameFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your First Name: ");
		String Fname = sc.next();
		System.out.print("Enter Your Last Name: ");
		String Lname = sc.next();
		
		Character FirstChar = Lname.charAt(0);
		Character FirstCharF = Fname.charAt(0);
		
		System.out.println("Formated String: " + Fname + ", " + FirstChar);
		System.out.println("Formated String: " + Lname + ", " + FirstCharF);
	}

}