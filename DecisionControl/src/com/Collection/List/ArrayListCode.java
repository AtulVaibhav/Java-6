package com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCode {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(10);
		list.add(15);
		
		System.out.println(list);
		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println("Size of list:"+list.size());
		
		//get()
		System.out.println(list.get(0));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		
		//remove()
		int removedElement = list.remove(3);
		System.out.println(removedElement);
		System.out.println(list);
		
		//contain()
			if(list.contains(200)){
				System.out.println("Present");
				
			}
		
		// even number from list
		for(Integer data:list)	{
			if(data%2==0){
				System.out.println(data);
			}
		}
		
		//Iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
//insert , delete ,read
// add employee object 
// basedId
// getAll