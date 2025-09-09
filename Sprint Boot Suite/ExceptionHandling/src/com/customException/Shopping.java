package com.customException;

public class Shopping {
    
	public static void checkoout(int amt)  {
		float finalAmt;
		float discount;
	    if (amt >= 10000) {
	    	discount = 2f;
	    	finalAmt = amt *(1-discount/100);
	    }else {
	    	finalAmt = amt;
	    }
	    
	    System.out.println("*************************");
	    System.out.println("Your bill");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
