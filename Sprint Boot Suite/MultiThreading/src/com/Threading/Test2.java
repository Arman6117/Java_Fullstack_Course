package com.Threading;

import java.io.Closeable;

public class Test2 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		Thread t1=new Thread(e1, "T1");
		t1.start();

		Manager1 m1=new Manager1();
		Thread t2=new Thread(m1, "T2");
		t2.start();
	}

}

class Employee1 implements Runnable
{
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
		System.out.println("Employee: "+Thread.currentThread().getName() +" -- "+ Thread.currentThread().getId()+ " --- "+ Thread.currentThread().getPriority());
		}
	}
}
class Manager1 implements Runnable
{
	@Override
	public void run() {
		for(int j=0; j<20; j++) {
		System.out.println("Manager: "+Thread.currentThread().getName() +" -- "+ Thread.currentThread().getId()+ " --- "+ Thread.currentThread().getPriority());
		}
	}
}