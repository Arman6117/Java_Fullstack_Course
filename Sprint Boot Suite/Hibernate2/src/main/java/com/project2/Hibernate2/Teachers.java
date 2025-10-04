package com.project2.Hibernate2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="teacher_tab")
public class Teachers {
 @Id
 private int t_id;
 private String t_name;
 private String t_sub;
 private float t_sal;
 
 @Override
public String toString() {
	return "Teachers [t_id=" + t_id + ", t_name=" + t_name + ", t_sub=" + t_sub + ", t_sal=" + t_sal + "]";
}
 public Teachers() {
	super();
	// TODO Auto-generated constructor stub
 }
 public Teachers(int t_id, String t_name, String t_sub, float t_sal) {
	super();
	this.t_id = t_id;
	this.t_name = t_name;
	this.t_sub = t_sub;
	this.t_sal = t_sal;
 }
 
 //Getters setters
 public int getT_id() {
	return t_id;
 }
 public void setT_id(int t_id) {
	this.t_id = t_id;
 }
 public String getT_name() {
	return t_name;
 }
 public void setT_name(String t_name) {
	this.t_name = t_name;
 }
 public String getT_sub() {
	return t_sub;
 }
 public void setT_sub(String t_sub) {
	this.t_sub = t_sub;
 }
 public float getT_sal() {
	return t_sal;
 }
 public void setT_sal(float t_sal) {
	this.t_sal = t_sal;
 }
 
}
