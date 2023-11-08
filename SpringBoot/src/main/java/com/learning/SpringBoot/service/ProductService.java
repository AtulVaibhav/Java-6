package com.learning.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.SpringBoot.dao.ProductDao;
import com.learning.SpringBoot.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
   
	public Product addProduct(Product product){
		return this.productDao.addProduct(product);
	}
	public List<Product> getAllProduct(){
		return this.productDao.getAllProduct();
	}
	
	public Product getProductById(int productId){
		return this.productDao.getProductById(productId);
	}
	public Product updateProduct(int productId, Product product){
		return this.productDao.updateProduct(productId, product);
	}
	 public String deleteProductByid(int productId){
	    return this.productDao.deleteProductByid(productId);
	 }
	
}
