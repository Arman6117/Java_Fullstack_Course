package com.customException;

import java.util.Scanner;

public class Test {

	public static void login(String email , String pass) throws LoginException {
	  
		if(email != "abc.com" || pass != "1234") {
			throw new LoginException("Invalid email or password");
		}
		
	}
	public static void main(String[] args)  {
	   	
        Scanner in = new Scanner(System.in);
		
        System.out.println("Enter your email: ");
		String email = in.next();
		System.out.println("Enter your pass: ");
		String pass = in.next();
		
		try {
			login(email,pass);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("End");
	}

}
