package com.list.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListD05 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Insert element: ");
			System.out.println("2.Delete element: ");
			System.out.println("3.Display element: ");
			System.out.println("4.Exit.. ");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter element to insert: ");
				int ele = sc.nextInt();
				ll.add(ele);
				System.out.println(ele+" added to the list...\n");
				break;
			case 2:
				if(ll.isEmpty()) {
					System.err.println("list is empty nothing to deleted...\n");
				}else {
					System.out.print("Enter the element to deleted: ");
					int eleToDelete = sc.nextInt();
					boolean delete = ll.remove(Integer.valueOf(eleToDelete));
					if(delete) {
						System.out.println("element "+eleToDelete+" is deleted ");
						System.out.println(ll.toString()+"\n");

					}else {
						System.err.println("element "+eleToDelete+" is not available in list\n");
					}
				}
				break;
			case 3:
				if(!ll.isEmpty()) {
					System.out.println(ll.toString());

				}else {
					System.err.println("list is empty!!!\n");
				}
				break;
			case 4:
				System.out.println("Existing...");
				sc.close();
				System.exit(0);
				break;
			default:
				System.err.println("Invalid choice try again\n");	
			}
		}
	}

}
