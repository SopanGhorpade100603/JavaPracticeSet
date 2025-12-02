package com.queue_priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueD03 {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(11);
		queue.offer(2);
		queue.offer(4);
		queue.offer(6);
		System.out.println(queue);

	}

}
