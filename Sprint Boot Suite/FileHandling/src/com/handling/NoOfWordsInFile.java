package com.handling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NoOfWordsInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("./mydoc.txt");
		FileInputStream fis = new FileInputStream(file);
		int cnt = 0;
		for(int i = 0; (i = fis.read() )!= -1; i++) {
			cnt++;
		}
		
		System.out.println("No of words in file: "+ cnt);
		

	}

}
