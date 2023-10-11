package com.Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map : key,Value : Duplicate key is not allowed(value gets updated)
public class MapCode {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Amit", 11);
		map.put("Yogesh", 12);
		map.put("John", 14);
		map.put("Harsh", 13);
		System.out.println(map);
		
		map.put("Yogesh", 100);
		System.out.println(map);
		
		map.put(null, 200);
		System.out.println(map);
		
		//get the value
		System.out.println(map.get("John"));
		//System.out.println(map.get("Ankit"));
		
		//containsKey
		if(map.containsKey("Amit")){
			System.out.println(map.get("Amit"));
		}
		
		//remove(key)
		System.out.println(map.remove("Amit"));
		System.out.println(map);
		
		
		//Iteration
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		Map<String,Integer> map2 = new LinkedHashMap<>();
		map2.put("Amit", 11);
		map2.put("Yogesh", 12);
		map2.put("John", 14);
		map2.put("Harsh", 13);
		map2.put(null, 15);
		System.out.println(map2);
		
		//key as a null can't be added to TreeMap
		Map<String,Integer> map3 = new TreeMap<>();
		map3.put("Amit", 11);
		map3.put("Yogesh", 12);
		map3.put("John", 14);
		map3.put("Harsh", 13);
		//map3.put(null, 15);
		System.out.println(map3);
		
		

	}

}
