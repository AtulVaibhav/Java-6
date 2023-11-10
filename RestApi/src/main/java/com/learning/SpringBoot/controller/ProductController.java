package com.learning.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringBoot.entity.Product;
import com.learning.SpringBoot.service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController {
    
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		Product savedProduct = this.productService.addProduct(product);
		return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAll(){
		List<Product> list = this.productService.getAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<Product> getById(@PathVariable int productId){
		Product product = this.productService.getProductById(productId);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@PutMapping("/product/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable int productId,
			                                    @RequestBody Product product){
		Product updatedProduct = this.productService.updateProduct(productId, product);
	    return new ResponseEntity<>(updatedProduct,HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable int productId){
		String msg =this.productService.deleteProduct(productId);
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
	
}
