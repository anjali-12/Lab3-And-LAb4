package com.cg.spring.service;

import java.util.List;

import com.cg.spring.entity.Product;


public interface ProductServiceImpl {

	public Product save(Product product);

	public List<Product> retrieve();

}
