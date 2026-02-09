package com.list.vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorD09 {

	public static void main(String[] args) {
		Vector<String> todoList = new Vector<>();
		Scanner sc = new Scanner(System.in);
		int choice ;
		do {
			System.out.println("To Do List Menu: ");
			System.out.println("1. Add Task");
			System.out.println("2. view Task");
			System.out.println("3. mark Task as completed");
			System.out.println("4. exit");
			System.out.println("Enter your choice: ");
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				System.out.println("add task description: ");
				String desc = sc.nextLine();
				todoList.add(desc);
				System.out.println("task added successfully\n");
				break;
				
			case 2:
				if(!todoList.isEmpty()) {
					System.out.println("to do list");
				for(String list: todoList) {
					System.out.println(list);
				}
				System.out.println();
				}else {
					System.err.println("todo list is empty\n");
				}
				break;
				
			case 3:
				System.out.println("Enter task number to remove");
				int taskNo = Integer.parseInt(sc.nextLine());
				if(taskNo>=1 && taskNo <= todoList.size()) {
					String completeTask = todoList.remove(taskNo-1);
					System.out.println("task completed: "+completeTask+"\n");
				}else {
					System.err.println("Invalid task no\n");

				}
				break;
				
			case 4:
				System.err.print("existing");
				for(int i=0;i<5;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.err.print(".");

				}
				break;
				
				default:
					System.err.println("invalid choice!!!try again");
			}

		}while(choice !=4);
		sc.close();
	}

}
