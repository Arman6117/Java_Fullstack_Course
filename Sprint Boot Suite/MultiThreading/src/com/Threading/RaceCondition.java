package com.Threading;

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		BrickDairy  bd =  new BrickDairy();
//		 int brick = 0;
//		 
//        Runnable r1 = () -> {
//        	for(int i =0; i<500; i+= 50) {
//        		brick += 50;
//        	}
//        };
//        
//        Runnable r2 = () -> {
//        	for(int i =0; i<1000; i+= 50) {
//        		brick += 50;
//        	}
//        };
//        
//        Runnable r3 = () -> {
//        	for(int i =0; i<1500; i+= 50) {
//        		brick += 50;
//        	}
//        };
//        
//        Thread t1 = new Thread(r1, "First Person");
//        Thread t2 = new Thread(r2, "Second Person");
//        Thread t3 = new Thread(r3, "Third Person");
//        
//        t1.start();
//        t2.start();
//        t3.start();
		
		Brick1 b1 = new Brick1();
		Brick2 b2 = new Brick2();
    b1.start();
    b2.start();
        
//        t1.join();
//        t2.join();
//        t3.join();
//        System.out.println(b1.bricks);
//        System.out.println(b1.bricks);
//        		
	}
    
}

class Brick1 extends Thread
{
	int bricks= 0;
	
	@Override
	public void run() {
		for(int i =0; i<500; i+= 50) {
  	  	bricks += 50;
  		System.out.println(bricks);
	}
	}
}

class Brick2 extends Thread
{
	int bricks= 0;
	
	@Override
	public void run() {
		
		for(int i =0; i<1500; i+= 50) {
	  	  	bricks += 50;
	  	  	System.out.println(bricks);
		}
	}
}


class BrickDairy {
	
	
}