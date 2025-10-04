package com.List.Practice;

interface Demo {
	void print();
}

class OverloadOverrideDemo implements Demo{
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a ,int b,int c) {
		return a+b+c;
	}
	
	@Override
	public void print() {
		System.out.println("Overriding the function");
		
	}
}
public class OverloadingOverriding {

	public static void main(String[] args) {
	 
		OverloadOverrideDemo obj = new OverloadOverrideDemo();
		
		System.out.println("Sum function with 2 parameters: " + obj.sum(10, 20));
		
		System.out.println("Sum function with 3 parameters: " + obj.sum(10, 20,30));
		
		obj.print();
	}

}
