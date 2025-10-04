package com.MTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="dept_mto")
public class Department {
	@Id
	private int d_id;
	private String d_name;
	private String d_admin;
	public Department(int d_id, String d_name, String d_admin) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_admin = d_admin;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_admin() {
		return d_admin;
	}
	public void setD_admin(String d_admin) {
		this.d_admin = d_admin;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", d_admin=" + d_admin + "]";
	}
	
	
}
