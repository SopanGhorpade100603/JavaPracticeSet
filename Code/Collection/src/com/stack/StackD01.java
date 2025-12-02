package com.stack;

import java.util.Stack;

public class StackD01 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(42);
		stack.push(22);
		stack.push(41);
		stack.push(12);
		stack.push(7);
		stack.forEach(System.out::println);
//		stack.sort((num1,num2)->num1.compareTo(num2));
//		System.out.println("sorted element: "+stack.toString());
		int ele = stack.pop();
		System.out.println("element delete from stack is: "+ele);
		System.out.println(stack.toString());
		System.out.println("top of the stack: "+stack.peek());
		

	}

}
