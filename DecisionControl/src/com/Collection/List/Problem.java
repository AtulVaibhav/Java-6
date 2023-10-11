package com.Collection.List;

public class Problem {
   public static int getLongestSubstring(String str){
	   int maxLength = 0;
	   for(int i=0;i<str.length();i++){
		   String subString = "";
		   for(int j=i;j<str.length();j++){
			   if(subString.contains(String.valueOf(str.charAt(j)))){
				   break;
			   }else{
				   subString = subString+str.charAt(j);
				   if(subString.length()>maxLength){
					   maxLength = Math.max(maxLength, subString.length());
				   }
			   }
		   }
	   }
	  return maxLength;
	   
   }
	public static void main(String[] args) {
		String str = "abcabcbb";
		String str2 = "bbbbbb";
		getLongestSubstring(str2);
		
	}

}
