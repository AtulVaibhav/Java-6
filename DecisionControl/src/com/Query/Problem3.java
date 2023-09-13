package com.Query;

public class Problem3 {
   public  void arrange01(int[] arr){
	   int[] temp = new int[arr.length];//new array
	   int Count = getCount(arr);//4
	   int firstIndices =0;
	   int anotherHalfIndices = Count;
	   for(int i=0;i<arr.length;i++){
		  if(arr[i]==0){
			  temp[firstIndices++] = arr[i];
		  }else{
			  temp[anotherHalfIndices++] = arr[i];
		  }
	   }
	   for(int data:temp){
		   System.out.print(data+" ");
	   }
   }
	
   private  int getCount(int[] arr) {
		int count=0;
	 for(int data:arr){
		 if(data==0) count++;
	 }
	 return count;
}
	public static void main(String[] args) {
		int[] arr = {0,1,0,1,1,0,1,1,0};
		new Problem3().arrange01(arr);

	}

}
