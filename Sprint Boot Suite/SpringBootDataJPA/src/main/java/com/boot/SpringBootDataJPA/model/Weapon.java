package com.boot.SpringBootDataJPA.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Component
@Entity
public class Weapon {
	@Id
	private Integer id;
	private String name;
	private String type;

	public Weapon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weapon(Integer id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
