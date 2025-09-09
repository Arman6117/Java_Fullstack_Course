package com.handling;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		method2();
	}

	public static void method2() {
		method1();
	}
	public static void method1() //throws IOException
	{
		/*
		 * StatcTrace Message
		 * -------------------
		 * Exception Name:		java.lang.ArithmeticException
		 * Exception Message: 	/ by zero
		 * While Line No.
		 * Message Info
		 */
		System.out.println("Program Started");
		
//		File f=new File("D://resume.txt");
//		f.createNewFile();
		
		int a=10;
		int b=0;
		int res=0;
		try {
		res=a/b;
		}catch (ArithmeticException ae) {
			//System.out.println(ae.toString());
			
			ae.printStackTrace();
		}
		finally {
			System.out.println("Exception Handled");
		}
		
		System.out.println(res);
		System.out.println("Program End");
		
	}
	
}

/*
Exception Handling Statements

try
catch
finally
throw
throws

*/