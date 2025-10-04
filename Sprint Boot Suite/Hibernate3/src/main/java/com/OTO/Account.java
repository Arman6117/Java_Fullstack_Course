package com.OTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Account_oto")
public class Account {
	@Id
	private int accNo;
	private String accName;
	private String accBranch;

	@OneToOne
	@JoinColumn(name="E_id")
	private Employee e;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBranch() {
		return accBranch;
	}

	public void setAccBranch(String accBranch) {
		this.accBranch = accBranch;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String accName, String accBranch, Employee e) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBranch = accBranch;
		this.e = e;
	}
}
