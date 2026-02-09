package com.list.vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Product(Integer id, String name) {

}

public class VectorD10 {
	public static void main(String[] args) {

		Vector<Product> listofProduct = new Vector<>();
		listofProduct.add(new Product(323, "laptop"));
		listofProduct.add(new Product(121, "mobile"));
		listofProduct.add(new Product(212, "camera"));
		listofProduct.add(new Product(512, "bag"));
		listofProduct.add(new Product(412, "watch"));

		Enumeration<Product> elements = listofProduct.elements();
		
		Iterator<Product> asIterator = elements.asIterator();
		asIterator.forEachRemaining(System.out::println);
		
		listofProduct.sort((p1, p2) -> p1.id().compareTo(p2.id()));
		System.out.println("\nsort based on id");
		listofProduct.forEach(System.out::println);

		listofProduct.sort((p1, p2) -> p1.name().compareTo(p2.name()));
		System.out.println("\nsort based on name");
		listofProduct.forEach(System.out::println);
	}
}
