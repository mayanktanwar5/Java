package com.amzaon.com;

public class Product {

	private int productId ;
	private int quantity;
	private String category;
	private String productName;
	private boolean isPrime =false;
	
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public Product(int productId, int quantity, String category , String productName ,boolean isPrime)
	{
		this.productId = productId;
		this.quantity = quantity;
		this.category = category;
		this.productName = productName;
		this.isPrime = isPrime;
		
	}
	
	public String productDelivery()
	{
		return "Standard";
	}
	
	public String productPrice()

	{
		return "No Discount";
	}
}
