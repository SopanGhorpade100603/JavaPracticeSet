package com.set.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetD03 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.Add elements");
			System.out.println("2.Delete elements");
			System.out.println("3.Display HashSet");
			System.out.println("4.exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element to add: ");
				int ele = sc.nextInt();
				hs.add(ele);
				System.out.println("element addded...\n");
				break;

			case 2:
				System.out.print("Enter element to delete: ");
				int deleteEle = sc.nextInt();
				if (hs.contains(deleteEle)) {
					hs.remove(deleteEle);
					System.out.println(deleteEle + " delete from set \n");
				} else {
					System.err.println(deleteEle + " element not found...\n");
				}
				break;

			case 3:
				System.out.println(hs.toString());
				break;

			case 4:
				System.err.print("existing");
				for (int i = 0; i < 3; i++) {
					System.err.print(".");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
				System.exit(0);
			default:
				System.err.println("invalid choice, try again/n");
			}

		}

	}

}
