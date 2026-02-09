package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueD01 {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.offer(56);
		q.offer(72);
		q.offer(16);
		q.offer(22);
		q.offer(52);
		q.offer(42);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
	}

}
