package com.springbootcrudoperations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//The Domain Layer - Etki alani katmani
@Entity
@Table(name = "product")
public class Product {

	/* ismi, fiyati, markasi, modeli, miktar'adet' */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private long id;

	@Column(name = "product_name")
	private String name;

	@Column(name = "product_price")
	private String price;

	@Column(name = "product_brand")
	private String brand;

	@Column(name = "product_model")
	private String model;

	@Column(name = "product_amount")
	private long amount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	
	
}
