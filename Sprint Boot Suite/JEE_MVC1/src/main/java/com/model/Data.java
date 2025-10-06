package com.model;

public class Data {
	private Integer uid;
	private String fullname;
	private String email;
	private String username;
	private String password;
	private String connPass;

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(Integer uid, String fullname, String email, String username, String password, String connPass) {
		super();
		this.uid = uid;
		this.fullname = fullname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.connPass = connPass;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConnPass() {
		return connPass;
	}

	public void setConnPass(String connPass) {
		this.connPass = connPass;
	}
}
