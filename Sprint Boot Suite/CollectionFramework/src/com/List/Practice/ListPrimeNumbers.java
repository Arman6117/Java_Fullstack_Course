package com.List.Practice;

import java.util.ArrayList;

public class ListPrimeNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> prime=  new ArrayList<>();
		
		for(int i = 2; i <= 50; i++) {
			boolean isPrime= true;
			for(int j = 2; j<= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				prime.add(i);
			}
		}
		System.out.println(prime);
 
	}

}
