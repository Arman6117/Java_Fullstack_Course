package com.handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NoOfLinesInFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./mydoc.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int cnt = 1;
		for(int i= 0;(i = fis.read()) != -1;i++) {
			if((char)i  == '\n') {
				cnt++;
			}
		}
         System.out.println("No of lines in a file: " + cnt);
	}

}
