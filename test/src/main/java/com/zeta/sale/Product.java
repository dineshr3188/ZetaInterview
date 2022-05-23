package com.zeta.sale;

public class Product {

	public int id;
	public String Name;
	public double price;
	public int quantity;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
		this.quantity = quantity;
	}




}

