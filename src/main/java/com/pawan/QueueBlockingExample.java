package com.pawan;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBlockingExample {
	public static void main(String[] args) {
		//Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q = new PriorityQueue<>();
		
		
		Integer[] aa={7, 4, 2, 1, 3} ;
		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 0; i < aa.length; i++)
			q.add(aa[i]);

		// Display contents of the queue.
		System.out.println("Elements of queue " + q);

		// To remove the head of queue.
		int removedele = q.poll();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);
		System.out.println(q);
		// Rest all methods of collection
		// interface like size and contains
		// can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-" + size);
	}
}
