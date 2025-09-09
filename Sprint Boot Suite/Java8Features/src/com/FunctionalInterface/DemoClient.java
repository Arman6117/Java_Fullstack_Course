package com.FunctionalInterface;

@FunctionalInterface
interface Car{
	void drive() ;
	default void speed() {
		System.out.println("Maintaining Good Speed: ");
	}
	static void fuel() {
		System.out.println("Fuel Inlet is Petrol ");
	}
}

class Benz implements Car{

	@Override
	public void drive() {
		System.out.println("Vehicle Benz in running");
		
	}
//	public void speed() {
//		System.out.println("Speed is Abnormal");
//	}
	
//	public static void fuel() {
//		System.out.println("Fuel is EV");
//	}
}


public class DemoClient {

	public static void main(String[] args) {
		
		
		Car c1=new Benz();
		c1.drive();
		
		c1.speed();
		
		Car.fuel();
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		// Annoymous Inner class
		Car c2=new Car(){
			public void drive() {
				System.out.println("Vehicel Ferrai is Running");
			}			
		};
		c2.drive();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		// Lambda Expression
		//Syn :   (parameter) -> { Experssion }
		
		
		Car c3 = () -> 	System.out.println("Vichle Audi is Running");
		
		c3.drive();
		
		

	}

}