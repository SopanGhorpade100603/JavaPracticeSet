package com.queue_priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueD01 {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(5);
		queue.add(15);
		queue.add(22);
		queue.add(18);
		queue.add(9);
		System.out.println(queue);

//		    10						 5
//		  /   \					   /   \
//		 5     15                 10    9
//	   /  \    /                 /  \   /
//    22  18   9				22  18  15

		queue.offer(56); // to add element in queue OR
		queue.add(54);
		System.out.println(queue);

		Integer poll = queue.poll(); // used to fetch the element from head of queue after fetching it will delete
										// the element from queue
		System.out.println("poll element: " + poll);
		System.out.println("after poll: " + queue);

		Integer peek = queue.peek(); // used to only fetch the element from head of the queue
		System.out.println("peek: " + peek);

		queue.remove(22);
		System.out.println("after removing 22 element: " + queue);

		System.out.println("is queue empty?: " + queue.isEmpty());
	}
}
