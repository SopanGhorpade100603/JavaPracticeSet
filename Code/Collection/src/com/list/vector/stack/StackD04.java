package com.list.vector.stack;

import java.util.Stack;

public class StackD04 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(3);
		stk.push(12);
		stk.push(21);
		stk.push(6);
		stk.push(4);
		stk.push(5);
		stk.push(19);
		stk.push(22);
		System.out.println(stk);
		stk.sort((num1, num2) -> num1.compareTo(num2));
		System.out.println("sorted element: " + stk);
		System.out.println("prime no:");
		stk.forEach(ele -> {
			int count=0;
			for(int i=1;i<=ele;i++) {
			if (ele % i == 0) {
				count++;
			}
			}
			if(count==2) {
				System.out.println(ele);
			}
		});

	}

}
