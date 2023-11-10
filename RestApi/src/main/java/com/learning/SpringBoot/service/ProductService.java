package com.learning.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.SpringBoot.dao.ProductRepository;
import com.learning.SpringBoot.entity.Product;

@Service
public class ProductService {
 
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product){
		return this.productRepository.save(product);
	}
	
	public List<Product> getAllProducts(){
		return this.productRepository.findAll();
	}
	
	public Product getProductById(int productId){
		return this.productRepository.findById(productId).get();
	}
	
	public Product updateProduct(int productId, Product product){
		Product savedProduct =this.productRepository.findById(productId).get();
		savedProduct.setProductName(product.getProductName());
		savedProduct.setProductPrice(product.getProductPrice());
		savedProduct.setProductDesciption(product.getProductDesciption());
		
		this.productRepository.save(savedProduct);
		return savedProduct;
	}
	
	public String deleteProduct(int productId){
		Product savedProduct = this.productRepository.findById(productId).get();
		this.productRepository.delete(savedProduct);
		return "Product deleted successfully";
		
	}
	
	
}
