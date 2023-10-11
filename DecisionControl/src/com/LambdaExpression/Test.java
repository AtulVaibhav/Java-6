package com.LambdaExpression;


interface Calculation{
	//void add();
	void add(int a,int b);
	void multiply(int a,int b,int c);
}
//class Addition implements Calculation{
//
//	@Override
//	public void add(int a,int b) {
//		System.out.println(a+b);
//		
//	}
//	
//}
public class Test {

	public static void main(String[] args) {
		//Calculation calculaton = ()->System.out.println("Addition");//LambadExpression
		//calculaton.add();
		
		//Calculation calculation = (int a,int b)->System.out.println(a+b);
		//calculation.add(12, 13);

	}

}
// no accessmodifier
// no return type
// no nameOfFunction