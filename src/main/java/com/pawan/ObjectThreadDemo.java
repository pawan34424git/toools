package com.pawan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ObjectThreadDemo  {

	   private List<String> synchedList;

	   public ObjectThreadDemo() {
//	      synchedList = Collections.synchronizedList(new LinkedList<String>());
	      
	      synchedList = new LinkedList<String>();
	   }

	   // method used to remove an element from the list
	   public String removeElement() throws InterruptedException {
	      synchronized (synchedList) {
	    	 System.out.println("removeElement 1 " + Thread.currentThread().getId());
	         while (synchedList.isEmpty()) {
	        	System.out.println("removeElement 2 " + Thread.currentThread().getId());
	            synchedList.wait();
	        	//Thread.sleep(2000);
	            System.out.println("removeElement 3 " + Thread.currentThread().getId());
	         }
	         System.out.println("removeElement 4 " + Thread.currentThread().getId());
	         String element = (String) synchedList.remove(0);

	         return element;
	      }
	   }

	   // method to add an element in the list
	   public void addElement(String element) {
		  System.out.println("addElement 1 " + Thread.currentThread().getId());
	      synchronized (synchedList) {
	    	 System.out.println("addElement 2 " + Thread.currentThread().getId());
	         synchedList.add(element);
	         synchedList.notifyAll();
	         System.out.println("addElement 3 " + Thread.currentThread().getId());
	      }
	      System.out.println("addElement 4 " + Thread.currentThread().getId());
	   }

	   public static void main(String[] args) {
	      final ObjectThreadDemo demo = new ObjectThreadDemo();

	      Runnable runA = new Runnable() {

	         public void run() {
	            try {
	               String item = demo.removeElement();
	               System.out.println("" + item);
	            } catch (InterruptedException ix) {
	            	ix.printStackTrace();
	               System.out.println("Interrupted Exception!"+ix.getMessage());
	            } catch (Exception x) {
	               System.out.println("Exception thrown.");
	            }
	         }
	      };

	      Runnable runB = new Runnable() {

	         // run adds an element in the list and starts the loop
	         public void run() {
	            demo.addElement("Hello!");
	         }
	      };

	      try {
	         Thread threadA1 = new Thread(runA, "A");
	         threadA1.start();

	         Thread.sleep(500);

	         Thread threadA2 = new Thread(runA, "B");
	         threadA2.start();

	         Thread.sleep(500);

	         Thread threadB = new Thread(runB, "C");
	         threadB.start();

	         Thread.sleep(1000);

//	         threadA1.interrupt();
//	         threadA2.interrupt();
	      } catch (InterruptedException x) {
	      }
	   }
	}