package com.list.vector.stack;

import java.util.Stack;

public class Demo01 {
	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.addElement("raghav");
		stk.push("sopan");
		stk.push("ram");
		stk.push("sham");
		stk.push("ajay");
		stk.push("rahul");
		System.out.println(stk.pop()); //it will retrieve and delete top element 
		System.out.println(stk.peek()); //it will only retrieve element from top ot stack 
		System.out.println(stk);
		
	}
}
