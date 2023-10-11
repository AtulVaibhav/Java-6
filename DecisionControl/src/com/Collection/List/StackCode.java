package com.Collection.List;

import java.util.Stack;

public class StackCode {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<>();
		//push
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println(stack);
		
		//peek(): object present at top of stack
		System.out.println(stack.peek());
		System.out.println(stack);
		
		//pop()
		System.out.println(stack.pop());
		System.out.println(stack);

	}

}
