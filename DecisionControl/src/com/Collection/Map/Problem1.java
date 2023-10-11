package com.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
	public static void printDuplicates(int[] arr){
		Map<Integer,Integer> map = new HashMap<>();
		for(int data:arr){
			if(map.containsKey(data)){
				map.put(data, map.get(data)+1);
			}else{
				map.put(data, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,2,5,6,4,7};
		printDuplicates(arr);

	}

}
