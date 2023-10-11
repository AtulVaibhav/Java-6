package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		//print all even numbers
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(x->x%2==0).forEach(x->System.out.print(x+" "));
		System.out.println();
		
        list.stream().map(x->x*x).forEach(x->System.out.print(x+" "));
        System.out.println();
        
        List<Integer> squareOfEvenNumber = list.stream()
        		 .filter(x->x%2==0)
        		 .map(x->x*x)
        		 .collect(Collectors.toList());
        System.out.println(squareOfEvenNumber);
        
        //Stream API
        
	}

}
