package com.saha.tdd.crm.dao;

import javax.ejb.Stateless;

import com.saha.tdd.crm.entity.Product;

@Stateless
public class ProductDao extends GenericDao<Product>{

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return "from Product";
	}

}
