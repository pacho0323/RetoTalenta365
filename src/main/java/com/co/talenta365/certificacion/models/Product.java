package com.co.talenta365.certificacion.models;

public class Product {
	private String category;
	private String products;
	
	public Product(String category, String products) {
		this.category = category;
		this.products = products;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}



}
