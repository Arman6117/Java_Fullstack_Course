package com.Threading;

public class MultiThreadOperations {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Active count of thread: " + Thread.activeCount());
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("Current thread priority: " + Thread.currentThread().getPriority());
        System.out.println("Current thread id: " + Thread.currentThread().getId());
        System.out.println("Current thread lifecycle: " + Thread.currentThread().getState());
        
        System.out.println("--------------------------------------------");
        
        Thread t1 = new Thread();
        t1.start();
        System.out.println("Custom thread lifecycle: " + t1.getState());
        System.out.println("Custom thread priority: " + t1.getPriority());
    
        t1.join();
        System.out.println("Custom thread lifecycle: " + t1.getState());
        System.out.println("Active count of thread: " + Thread.activeCount());
        
	}

}
