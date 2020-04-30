package com.cg.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.spring.entity.Product;

@Transactional
@Repository
public class ProductDao implements ProductDaoImpl {

	@PersistenceContext
	EntityManager e;

	@Override
	public boolean create(Product product) {
		e.persist(product);
		return true;
	}

	@Override
	public List<Product> retrieve() {
		String s = "SELECT product FROM Product product";
		TypedQuery<Product> query = e.createQuery(s, Product.class);

		return query.getResultList();
	}

}
