package com.cg.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	private int Id;
	private String Name;
	private int Price;

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name =Name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}

	public Product(int Id, String Name, int Price) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Price = Price;
	}

	public Product() {
		super();
		
	}

	@Override
	public String toString() {
		return "Product [prodId=" + Id + ", prodName=" +Name + ", prodPrice=" + Price + "]";
	}

}
