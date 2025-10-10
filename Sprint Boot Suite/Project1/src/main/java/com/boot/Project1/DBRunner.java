package com.boot.Project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DBRunner implements CommandLineRunner {

	@Autowired
   DBConfig dbConfig;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From runner class");
		System.out.println(dbConfig.toString());
		
	}

}
