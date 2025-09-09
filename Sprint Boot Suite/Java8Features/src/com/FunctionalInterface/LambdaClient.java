package com.FunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Area{
	//void rectangle(int a, int b);
	
//	double circle(int r);
	
	int multiply(int a, int b);
}

public class LambdaClient {

	public static void main(String[] args) {
		/*
//		Area a1= (int a, int b) -> {
//			System.out.println("Area of a Rectangle: " + (a * b));
//		};
//		
//		a1.rectangle(5, 6);
		
		Area a1= (l, b) ->System.out.println("Area of a Rectangle: " + (l * b));		
		a1.rectangle(9, 10);
		 */
		
//		Area a2= (r) -> {
//			return 3.14 * r * r;
//		};
//		System.out.println("Area of a circle: " +a2.circle(5));
		
		
//		Area a2= r -> 3.14 * r * r;	;
//		
//		System.out.println("Area of a circle: " +a2.circle(8));
		
		
//		Area a3 = (a, b) -> {
//			return a * b;
//		};
		
//		Area a3 = (a, b) -> a * b;
//		
//		System.out.println("Product of Number: "+ a3.multiply(4, 8));

		
		Function<String, Integer> len= str -> str.length();
		
		System.out.println( len.apply("Micheal Jackson"));
		System.out.println(">>>>>>>>>>>>>>>>>>");
		Predicate<Integer> isEvenOrOdd =  num -> num%2==0;
		
		
		Integer a  = new Integer(10);
		System.out.println(a);
		if(isEvenOrOdd.test(10)) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		//Supplier
		//Consumer
		// java.util.function
	}

}