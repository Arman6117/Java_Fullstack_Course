package com.generic;

class Development<T> {
	T a;
	
	public T task(T a) {
		return a;
	}
	
}

class Development2<T, K>{
	T a;
	K b;
//	@Override
//	public String toString() {
//		return "Development2 [a=" + a + ", b=" + b + "]";
//	}
	
	public String task2(T a, K b) {
		return a + "::" + b;
	}
	
}

public class GenericClient {

	public static void main(String[] args) {
		Development<Integer> d1 = new Development<>();
		System.out.println(d1.task(2));
		Scanner
		Development2<Integer, String> d2 = new Development2<>();
		System.out.println(d2.task2(10, "Hello"));

	}

}
