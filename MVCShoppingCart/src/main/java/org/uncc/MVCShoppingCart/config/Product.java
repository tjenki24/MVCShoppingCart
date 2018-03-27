package org.uncc.MVCShoppingCart.config;

public class Product {
	private int id;
	private String name;
	private String price;
	private String description;
	private String image;
	
	public Product() {
	}
	public Product(String name, String price, String description, String image) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.image = image;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getImage() {
		return this.image;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
}
