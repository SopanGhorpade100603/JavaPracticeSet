package com.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueD02 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.offer("Orange");
		queue.offer("Apple");
		queue.add("Mango");
		queue.add("Guava");
		queue.add("Grapes");
//		queue.add(null);  // NullPointerException
		System.out.println(queue);

	}

}
