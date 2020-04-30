package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.entity.Product;


public interface ProductDaoImpl {

	public boolean create(Product product);
	public List<Product> retrieve();


}
