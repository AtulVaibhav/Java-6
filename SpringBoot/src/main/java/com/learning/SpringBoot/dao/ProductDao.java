package com.learning.SpringBoot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learning.SpringBoot.entity.Product;

@Repository
public class ProductDao {
    static List<Product> list;
    static{
    	list = new ArrayList<>();
    }
    
    //addProduct
    public Product addProduct(Product product){
    	boolean result = list.add(product);
    	if(result){
    	    return product;
    	}
    	return null;
    }
    
    //getAllProduct
    public List<Product> getAllProduct(){
    	if(list.isEmpty())return null;
    	return list;
    }
    
    //getProductByid
    public Product getProductById(int productId){
    	return list.stream()
    	       .filter(obj->obj.getProductId()==productId)
    	       .findFirst().get();
    }
    
    //updateProducts
    
    
    //deleteProducts
    public String deleteProductByid(int productId){
    	Product product = list.stream()
	                 .filter(obj->obj.getProductId()==productId)
	                 .findFirst().get();
    	if(product!=null){
    		list.remove(product);
    		return "Product deleted Successfully";
    	}
    	return "No product found";
    	
    }
    
    
    
    
    
    
    
    
    
    
}
