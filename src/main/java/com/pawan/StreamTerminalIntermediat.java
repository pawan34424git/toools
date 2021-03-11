package com.pawan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalIntermediat {

	public static void main(String[] args) {
		List<Integer>  list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		var start = System.currentTimeMillis();
		
		list.stream().map(l->{
			System.out.println(l+" :::: "+Thread.currentThread().getName());
			return l;
		}).forEach(i->{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+" :: "+Thread.currentThread().getName());
		});
		
		System.out.println((System.currentTimeMillis()-start) + " ms");
		
		
		start = System.currentTimeMillis();
		
		list.parallelStream().map(l->{
			System.out.println(l+" :::: "+Thread.currentThread().getName());
			return l;
		}).forEach(i->{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+" :::: "+Thread.currentThread().getName());
		});
		
		System.out.println((System.currentTimeMillis()-start) + " ms");
		
		list.parallelStream().map(l->{
			System.out.println(l+" :ssssdddddddddddddddd:: "+Thread.currentThread().getName());
			return l;
		});

	}

}
