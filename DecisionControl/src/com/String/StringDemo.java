package com.String;

public class StringDemo {

	public static void main(String[] args) {
		//using literals(SCP):it doesn't allow duplicate objects
		String str = "Java";
		String str3 = "Java";
		if(str==str3){
			System.out.println("pointing to same location");
		}
		
		
		//using new keyword
		String str2 = new String("JavaWorld");
		
		//Immutable : which can't be modified
		String str4 = "Java is a programming lang.";
		str4.concat("Java supports OOPs");
		System.out.println(str4.hashCode());
		
		str4 = str4.concat("Java supports OOPs");//new object
		System.out.println(str4.hashCode());
		
		//Methods:
		//concat() equals() compareTo() length() lowercase() uppercase()
		//trim() charAt() hashCode() indexOf() split()
     
	}

}
