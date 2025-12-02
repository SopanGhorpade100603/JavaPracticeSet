package com.stack;

import java.util.Stack;

public class StackD02 {

	public static void main(String[] args) {
		Stack<String>stk = new Stack<>();
		stk.push("java");
		stk.add("is");
		stk.add("awesome");
		stk.add("language");
		stk.forEach(text->System.out.println(text));

	}

}
