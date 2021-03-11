package com.pawan;

import java.util.Date;

public class ThreadingClass2 {
	public static void main(String[] args) {

		X a=new X();
		
		
		
		new Thread(new Runnable() {
			public void run() {
				a.checkWait();
				
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				a.checkWait();
				
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				a.checkWait();
				
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.yield();
					Thread.sleep(2000);
					synchronized (Y.LOCK) {
						Y.LOCK.notifyAll();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}


class X extends Y{

	 
	 void checkWait() {
		 System.out.println("AAAAA "+new Date()+" "+Thread.currentThread().getId());
		 synchronized (LOCK) {
			 try {
				 System.out.println("wating "+Thread.currentThread().getId());
				 LOCK.wait();
				 System.out.println("wating over" +Thread.currentThread().getId());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		System.out.println("BBB "+new Date());
	}
}

class Y{
	final static Object LOCK=new Object(); 
}
