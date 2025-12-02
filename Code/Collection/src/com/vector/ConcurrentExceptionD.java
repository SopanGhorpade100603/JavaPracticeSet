package com.vector;

import java.util.Vector;

class UpdateValue extends Thread {
	private Vector<Integer> value;

	public UpdateValue(Vector<Integer> value) {
		super();
		this.value = value;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		value.add(22);
	}
}

public class ConcurrentExceptionD {
//failfastIterator
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		numbers.add(14);
		numbers.add(12);
		numbers.add(11);
		numbers.add(12);
		numbers.add(45);
		numbers.add(41);

		UpdateValue failFastItr = new UpdateValue(numbers);
		failFastItr.start();

//		Iterator<Integer> itr = numbers.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			Thread.sleep(500);
//		}

		for (Integer num : numbers) {
			System.out.println("Iterating: " + num);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * while retrieving the object from Collection by using Iterator interface or
 * for each loop if at any point of time the Original Structure is going to
 * modify after the creation of Iterator then we will get
 * ConcurrentModificationException
 */