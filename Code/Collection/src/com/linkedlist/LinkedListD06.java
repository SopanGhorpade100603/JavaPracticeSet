package com.linkedlist;

import java.util.LinkedList;

record Product(Integer id, String productName) {

}

public class LinkedListD06 {

	public static void main(String[] args) {
		LinkedList<Product> ll = new LinkedList<>();
		ll.add(new Product(111, "Mobile"));
		ll.add(new Product(222, "Camera"));
		ll.add(new Product(333, "Laptop"));

		System.out.println("is list empty? " + ll.isEmpty());

		ll.forEach(prod -> System.out.println(prod.productName().toUpperCase()));
		
		Product product = ll.get(1);
		System.out.println(product);

	}
}
