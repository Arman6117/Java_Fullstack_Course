package com.handling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File file = new File("./mydoc.txt");
     
     File dest =new File("./copy.txt");
     
     try {
		if(dest.createNewFile()) {
			 System.out.println("File created");
		 }
	} catch (IOException e) {
		
		e.printStackTrace();
	}
     FileInputStream fis =new FileInputStream(file);
//     BufferedInputStream bis = new BufferedInputStream(System.in);
     FileOutputStream fos = new FileOutputStream(dest);
     
     
       for(int i = 0;(i = fis.read())!=-1;i++) {
    	   char data = (char)i;
    	   fos.write(data);
       }
       
       FileInputStream fis2 = new FileInputStream(dest);
   	for(int i=0 ; (i =fis2.read()) !=-1 ; i++) {
		System.out.print((char) i);
	}
     
	}

}
