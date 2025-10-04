package com.handling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteOperations {

	public static void main(String[] args) throws IOException {
		File f2=new File("./mydoc.txt");
//		System.out.println(f2.createNewFile());
		
		BufferedInputStream bis=new BufferedInputStream(System.in);
		
		FileOutputStream fos=new FileOutputStream(f2);
		
//		fos.write(23);
//		fos.write(67);
		System.out.println("Write the Data: ");
//		for(int i=0; (i=bis.read())!= '#' ;) {
//			fos.write(i);
//		}
		

		
	}

}