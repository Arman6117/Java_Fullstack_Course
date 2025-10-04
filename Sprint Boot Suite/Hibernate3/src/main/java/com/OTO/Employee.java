package com.OTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_oto")
public class Employee {
	@Id
	private int emp_id;
	private String emp_name;
	private float emp_sal;

	public Employee(int emp_id, String emp_name, float emp_sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(float emp_sal) {
		this.emp_sal = emp_sal;
	}

}
