package com.cg.spring.service;
import com.cg.spring.dao.*;
 

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.spring.entity.*;

@Service
public class ProductService implements ProductServiceImpl {
	@Autowired
	ProductDao productDao;

	@Override
	public Product save(Product product) {
		boolean r = productDao.create(product);

		if (r) {
			return product;
		} else
			return null;
	}

	@Override
	public List<Product> retrieve() {
		// TODO Auto-generated method stub
		return productDao.retrieve();
	}
}
