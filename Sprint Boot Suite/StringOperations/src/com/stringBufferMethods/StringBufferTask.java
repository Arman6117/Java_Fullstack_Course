package com.stringBufferMethods;

public class StringBufferTask {

	public static void main(String[] args) {
		/*
		 * String are Immutable
		 * StringBuffer & StringBulider are Mutable
		 * 
		 */
		
		String s1="Hello";				//23
		String s2=new String("Hello");	//31
		
		System.out.println(s1==s2);
		
		String s3="HelloHai";			//40
		
		s1=s1+"Hai";					//46
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1==s3);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		
		StringBuffer sb1=new StringBuffer("Hello");		//50
		StringBuffer sb2=new StringBuffer("HelloDude");	//56
		
		//sb1.append("Dude");
		System.out.println(sb1);
		sb1.insert(0, "Dude");
		System.out.println("After Inserting: "+ sb1);
		
		sb1.deleteCharAt(2);
		System.out.println(sb1);
		
		sb1.delete(0, 3);
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		StringBuffer sb3=new StringBuffer("Hello");
		sb3.ensureCapacity(100);
		System.out.println("Current capacity: " + sb3.capacity());
		
		 
		
		StringBuffer sb4=new StringBuffer("Hello");
		
		
		System.out.println(sb3.equals(sb4)); 	//address
		System.out.println(sb3.compareTo(sb4));	//Data
		
		
//		String (Java 1.0)are Immutable
//		StringBuffer (Java 1.0 - Sync) & StringBuilder(Java 1.5 - NonSync) are Mutable



//		StringBuffer & StringBulider Methods
//		-----------------------------------
//		append
//		insert
//		deleteCharAt
//		delete
//		reverse
//		capacity	
//		ensureCapacity
//		equals 		(Compare Address)
//		compareTo	(Compare Data)

	}

}
