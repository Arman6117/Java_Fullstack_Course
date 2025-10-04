package com.Threading;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		Employee e1=new Employee("T1");
		Manager m1=new Manager("T2");
		
		e1.start();
//		e1.join();
//		e1.sleep(10000);
		
		m1.start();
//		m1.join();
		System.out.println(Thread.activeCount());

	}

}
class Employee extends Thread
{
	public Employee(String tName) {
		super(tName);
	}
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
		System.out.println("Employee: "+Thread.currentThread().getName() +" -- "+ Thread.currentThread().getId()+ " --- "+ Thread.currentThread().getPriority());
		}
	}
}
class Manager extends Thread
{
	public Manager(String tName) {
		super(tName);
	}
	@Override
	public void run() {
		for(int j=0; j<20; j++) {
		System.out.println("Manager: "+Thread.currentThread().getName() +" -- "+ Thread.currentThread().getId()+ " --- "+ Thread.currentThread().getPriority());
		}
	}
}