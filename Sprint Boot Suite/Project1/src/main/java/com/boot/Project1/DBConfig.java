package com.boot.Project1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConfig {
	@Value("${mysql.driver}")
	private String driver;
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.username}")
	private String username;
	@Value("${mysql.password}")
	private String password;
	@Override
	public String toString() {
		return "DBConfig [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
