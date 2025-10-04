package com.Threading;

public class Test3 {

	public static void main(String[] args) {
	
		//Anonymous Class
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Employee: "+Thread.currentThread().getName() +" -- "+ Thread.currentThread().getId()+ " --- "+ Thread.currentThread().getPriority());
					}
			}
		};
		
		Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				for(int j=0; j<20; j++) {
					System.out.println("Manager: "+Thread.currentThread().getName() +" -- "+ Thread.currentThread().getId()+ " --- "+ Thread.currentThread().getPriority());
					}
				
			}
		};
		
		
		Thread t1=new Thread(r1, "E-T1");
		Thread t2=new Thread(r2, "M-T2");
		
		t1.start();
		t2.start();
	}

}