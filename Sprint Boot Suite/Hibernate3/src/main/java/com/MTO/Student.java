package com.MTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Std_mto")
public class Student {
 @Id
 private int s_id;
 private String s_name;
 private int s_year;
 @ManyToOne
 @JoinColumn(name="d_id")
 private Department dept;

 public Student(int s_id, String s_name, int s_year, Department dept) {
	super();
	this.s_id = s_id;
	this.s_name = s_name;
	this.s_year = s_year;
	this.dept = dept;
 }

 public Student() {
	super();
	// TODO Auto-generated constructor stub
 }

 public int getS_id() {
	return s_id;
 }

 public void setS_id(int s_id) {
	this.s_id = s_id;
 }

 public String getS_name() {
	return s_name;
 }

 public void setS_name(String s_name) {
	this.s_name = s_name;
 }

 public int getS_year() {
	return s_year;
 }

 public void setS_year(int s_year) {
	this.s_year = s_year;
 }

 public Department getDept() {
	return dept;
 }

 public void setDept(Department dept) {
	this.dept = dept;
 }
 
 
}
