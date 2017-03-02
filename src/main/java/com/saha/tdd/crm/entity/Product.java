package com.saha.tdd.crm.entity;

import javax.persistence.Entity;

@Entity
public class Product extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
