package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueD02 {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.offer("sopan");
		q.offer("ram");
		q.offer("sham");
		q.offer("raghav");
		q.offer("raj");
		q.offer("sapana");
		System.out.println(q);
	}

}
