package com.java.decisionControl;

public class Pattern1 {
    public static void rightPyramid(int n){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<=i;j++){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    
    public static void leftPattern(int n){
    	for(int i=0;i<n;i++){
    		for(int j=n-1;j>i;j--){
    			System.out.print("   ");
    		}
    		for(int k=0;k<=i;k++){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    
    
    
    
	public static void main(String[] args) {
		//rightPyramid(6);
		leftPattern(6);

	}

}
