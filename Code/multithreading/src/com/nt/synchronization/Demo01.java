package com.nt.synchronization;

class Table {

	public synchronized void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(num + " * " + i + " = " + (num * i));
			System.out.println();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Table table = new Table(); // lock is created

		Thread t1 = new Thread(() -> table.printTable(9));
		Thread t2 = new Thread(() -> table.printTable(5));
		Thread t3 = new Thread(() -> table.printTable(7));

		t1.start();
		t2.start();
		t3.start();

	}

}
