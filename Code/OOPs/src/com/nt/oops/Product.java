package com.nt.oops;

import java.util.Scanner;

public class Product {

	int productId;
	String productName;
	double productPrice;

	public void setProductData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id:");
		this.productId = Integer.parseInt(sc.nextLine());
		System.out.println("Enter product Name:");
		this.productName = sc.nextLine();
		System.out.println("Enter product price:");
		this.productPrice = Double.parseDouble(sc.nextLine());
	}

	public void getProductData() {
		System.out.println("product id is: " + productId);
		System.out.println("product name is: " + productName);
		System.out.println("product price is: " + productPrice);
	}

	public static void main(String[] args) {
		Product prod = new Product();
		prod.setProductData();
		prod.getProductData();

	}

}
