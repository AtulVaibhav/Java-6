package com.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCode {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();//not maintaining insertion order.uniquenes
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		System.out.println(set);
		
		Set<Integer> set2 = new LinkedHashSet<>();//LinkedList +HashSet. maintaining insertion order:uniqueness + insertion order
		set2.add(100);
		set2.add(20);
		set2.add(10);
		set2.add(300);
		System.out.println(set2);
		
		TreeSet<Integer> treeSet = new TreeSet<>();//uniqueness + sorted
		treeSet.add(100);
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(300);
		System.out.println(treeSet);
		
		
		// [1,0,0,1,0,1,0,1,1]:count of subarray having equal number of zero and one
		

	}

}
