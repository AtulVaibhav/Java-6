package com.learning.SpringBoot.entity;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private String productDesciption;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, double productPrice, String productDesciption) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDesciption = productDesciption;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDesciption() {
		return productDesciption;
	}
	public void setProductDesciption(String productDesciption) {
		this.productDesciption = productDesciption;
	}
    
    
}
