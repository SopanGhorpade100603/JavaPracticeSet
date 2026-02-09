package com.queue.priorityqueue;

import java.util.PriorityQueue;

record Task(String name, Integer priority) {

}

public class QueueD04 {
	public static void main(String[] args) {
		PriorityQueue<Task> queue = new PriorityQueue<>((t1, t2) -> t1.priority().compareTo(t2.priority()));
		queue.add(new Task("Submit report", 4));
		queue.add(new Task("Find Bug", 2));
		queue.add(new Task("Write Program", 3));
		queue.add(new Task("Execute program ", 1));
		queue.forEach(System.out::println);
	}

}
