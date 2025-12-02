package com.nt.factory_method;

class Book {
	private String name;
	private double price;

	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static Book getBook() {
		return new Book("java", 470);
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

}

public class Demo01 {
	public static void main(String[] args) {
		Book bk = Book.getBook();
		System.out.println(bk);
	}

}
