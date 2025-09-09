package com.customException;

import java.util.Scanner;

public class Bank {

	public static void withdraw (int amt) throws InsuficientBalanceException{
		int balance  = 10000;
		if(balance < amt) {
			throw new InsuficientBalanceException("Insuficiant balance in the account");
			
		} else if (balance == amt) {
			System.out.println("Please maintain minimum balance");
		} else {
			balance = balance - amt;
			System.out.println("Amount withdrawed successfully");
			System.out.println("Current balance: " + balance);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw");
		int amt = in.nextInt();
		
		try {
			withdraw(amt);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Process end");
				
	}

}
