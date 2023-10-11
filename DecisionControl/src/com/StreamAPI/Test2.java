package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		//Creating Stream
		// 1.Stream.of()
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		stream.forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		// 2.Stream.of(array)
		Integer[] arr = {21,22,23,24,25,26};
		Stream<Integer> stream2 = Stream.of(arr);
		stream2.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		// 3.List.stream()
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		// 4.Stream.iterate()
		//for(initiate, condition , update)
		Stream<Integer> stream4 = Stream.iterate(0,n->n+2);
		stream4.limit(10).forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
        // 5.chars()
		IntStream stream5 = "ABC".chars();
		stream5.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		Stream<String> stream6 = Stream.of("A_B_C_D".split("_"));
		stream6.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		//Intermediate operations
		// 1.filter()
		String[] names = {"Harsh","Amit","John","Anurag","Akash"};
		Stream<String> streamOfNames = Stream.of(names);
		streamOfNames.filter(obj->obj.startsWith("A")).forEach(x->System.out.print(x+" "));
		System.out.println();
		
		// 2.map()
		String[] namesList = {"Harsh","Amit","John","Anurag","Akash","Anuj"};
		Stream<String> streamOfNameList = Stream.of(namesList);
		streamOfNameList.filter(obj->obj.startsWith("A"))
		.map(obj->obj.toUpperCase()).forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		//sorted(): 
		Stream.of(namesList)
		.filter(x->x.startsWith("A"))
		.sorted()
		.map(x->x.toUpperCase())
		.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		//Terminal Operations:
		   // 1.forEach()
		   // 2.collect()
		List<String> listOfNames = Stream.of(namesList)
		                  .filter(x->x.startsWith("A"))
	                      .sorted()
		                  .map(x->x.toUpperCase())
		                  .collect(Collectors.toList());
		System.out.println(listOfNames);
		
		
		//match()
		String[] namesII = {"Harsh","Amit","John","Anurag","Akash"};
		boolean result = Stream.of(namesII)
		                 .anyMatch(obj->obj.endsWith("ag"));
		System.out.println(result);
		
		boolean result2 =  Stream.of(namesII)
                           .allMatch(obj->obj.endsWith("ag"));
		System.out.println(result2);
		
		boolean result3 = Stream.of(namesII)
                          .noneMatch(obj->obj.endsWith("at"));
		System.out.println(result3);
		
		//count
		List<Integer> listOfInteger = Arrays.asList(1,2,3,2,3,4,5,6,1,1,3,5);
		long countOf1 = listOfInteger.stream().filter(x->x==1).count();
		System.out.println(countOf1);
		
		//reduce()
		
		List<Integer> listOfInteger2 = Arrays.asList(1,2,3,2,3,4,5,6,1,1,3,5);
		Integer result4 = listOfInteger2.stream()
		                 .distinct()// 1 2 3 4 5 6
		                 .reduce(0,(sum,b)->sum+b); 
		System.out.println(result4);
		
		
		
	}

}
