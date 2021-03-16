package com.pawan;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class QueueExample {
	public static void main(String[] args) {
//		final BlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
//		final BlockingQueue<Integer> pbq = new LinkedBlockingQueue<>();
//		final BlockingQueue<Integer> pbq = new ArrayBlockingQueue<>(10);
//		 DelayQueue pbq = new DelayQueue();
		final BlockingQueue<Integer> pbq = new SynchronousQueue<>();
		
		Thread producer = new Thread(() -> {
			while (true) {
				Integer v=(int) (Math.random() * 100);
				
				try {
					pbq.put(v);
					System.out.println("produced "+v+" :::"+pbq);
//					Thread.sleep(5000);
					Thread.sleep(400);
					
				} catch (InterruptedException e) {System.err.println("producer "+e.getMessage());}
			}
		});
		
		Thread consumer = new Thread(() -> {
			while (true) {
				
				try {
					Integer v = pbq.take();
					System.out.println("consumed "+v+" :::"+pbq);
//					Thread.sleep(500);
					Thread.sleep(5000);
				} catch (InterruptedException e) {System.err.println("consumer "+e.getMessage());}
			}
		});
		
		
		consumer.start();
		producer.start();
	}
}
