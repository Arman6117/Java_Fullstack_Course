
import java.util.ArrayList;

public class ListPrimeNumber {

	public static void main(String[] args) {
		ArrayList<Integer> prime = new ArrayList<>();
		for(int i = 2; i<= 50; i++) {
			boolean isPrime  = true;
			for(int j = 2; j <=Math.sqrt(i); j++) {
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


//OUTPUT
//[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]

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

//OUTPUT
/*
 * Sum function with 2 parameters: 30
   Sum function with 3 parameters: 60
   Overriding the function 
*/


