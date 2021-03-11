package com.pawan;

import java.util.Date;

public class ThreadingClass {
	public static void main(String[] args) {

		A a=new A();
		
		
		
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
					Thread.sleep(2000);
					a.notifyCall();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}


class A extends B{

	synchronized void notifyCall() {
		this.notifyAll();
	}
	synchronized void checkWait() {
		System.out.println("AAAAA "+new Date());
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("BBB "+new Date());
	}
}

class B{
	
}
