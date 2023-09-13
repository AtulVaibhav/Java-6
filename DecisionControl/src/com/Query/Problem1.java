package com.Query;

public class Problem1 {
	
	public static void getIndices(String str,String key){
		
		for(int i=0;i<str.length();i++){
			String sum="";
			for(int j=i;j<str.length();j++){
				sum = sum+str.charAt(j);
				if(sum.equals(key)){
					System.out.println(i+" "+j);
					break;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		//int[] arr = {2,3,6,9,0,11}; 
		String data = "encylopedia";
		//int sum=15;
		String subString = "ped";
		getIndices(data,subString);
	}

}
//arr[] = {0,1,0,1,1,0,1,1,0}: {0,0,0,0,1,1,1,1}: without using sorting