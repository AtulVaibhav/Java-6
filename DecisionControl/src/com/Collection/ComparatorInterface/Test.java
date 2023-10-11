package com.Collection.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	int productId;
	String productName;
	int productPrice;
	int productRatings;
	public Product(int productId, String productName, int productPrice, int productRatings) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productRatings = productRatings;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productRatings=" + productRatings + "]";
	}
}

class SortByPrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.productPrice==p2.productPrice) return 0;
		else if(p1.productPrice > p2.productPrice) return 1;
		else return -1;
	}
	
}


class SortByRating implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.productRatings==p2.productRatings) return 0;
		else if(p1.productRatings > p2.productRatings) return 1;
		else return -1;
	}
	
}
public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(101,"Mobiles",6000,3);
		Product p2 = new Product(102,"Laptops",76000,5);
		Product p3 = new Product(103,"TV",60000,4);
		Product p4 = new Product(104,"WashingMachines",45000,2);
		Product p5 = new Product(105,"Gym-tools",20000,1);
		
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		List<Product> list2 = list;
		
		
		
		
		System.out.println(list);
		System.out.println("Sorting products based on price");
		Collections.sort(list, new SortByPrice());
		System.out.println(list);
		
		System.out.println("Sorting products based on ratings");
		Collections.sort(list, new SortByRating());
		System.out.println(list);
		
		

	}

}
