package com.list.vector.stack;

import java.util.Collections;
import java.util.Stack;

public class StackD03 {
	public static void main(String[] args) {
		Stack<String>fruits = new Stack<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Strawbery");
		
		fruits.forEach(fruit->System.out.println(fruit));
		
		System.out.println("\nsorting fruits");
		Collections.sort(fruits);
		System.out.println(fruits);
		
		System.out.println("\nat top of fruit is: "+fruits.peek());
		System.out.println("offsetPosition of apple is: "+fruits.search("Apple"));
		System.out.println("index Position of mango is: "+fruits.indexOf("Mango"));

		
	}

}
