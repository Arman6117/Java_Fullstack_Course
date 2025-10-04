package com.handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadOperations {
	public static void main(String[] args) throws IOException {
		File f1=new File("./resume.txt");
		
//		System.out.println(f1.createNewFile());
		
		FileInputStream fis=new FileInputStream(f1);
		
//		System.out.println(fis.read());
//		System.out.println(fis.read());
		
//		for(int i=0 ; (i =fis.read()) !=-1 ; ) {
//			System.out.print((char) i);
//		}
		
//		int i=0;
//		while( (i=fis.read()) !=-1) {
//			System.out.print((char) i);
//		}
		
		String s1=new String();
		
		for(int i=0; (i=fis.read())!=-1;) {
			s1+=String.valueOf((char)i);
		}
		System.out.println(s1);
		
	}
}