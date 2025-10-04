package com.handling;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		
//		File f=new File("E:\\Symbiosis\\New.ArtsScience\\Batch-1\\FileHandling\\Doc\\Res1");
		
//		System.out.println( f.createNewFile());
//		System.out.println(f.exists());
//		System.out.println( f.delete());
		
//		if(f.exists()) 
//			f.delete();
//			
//		System.out.println(f.createNewFile());
		
		
//		System.out.println( f.mkdir());
//		System.out.println( f.mkdirs());
		
		//Relative  path
		
		File f1=new File("./myDoc.txt");
		
//		System.out.println(f1.createNewFile());
		System.out.println(f1.delete());
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getParent());
		
		System.out.println( f1.getName());

	}

}