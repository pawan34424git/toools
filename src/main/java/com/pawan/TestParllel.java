package com.pawan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestParllel {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		list.stream().filter(i -> {
			System.out.println(i + " ::filter:: " + Thread.currentThread().getName()); // Intermediate
			return i < 8;
		}).map(l -> {
			System.out.println(l + " ::map:: " + Thread.currentThread().getName());
			return l;
		}).forEach(i -> {
			
			System.out.println(i + " ::forEach:: " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		list.stream().filter(i -> {
			System.out.println(i + " ::filter:: " + Thread.currentThread().getName()); // Intermediate
			return i < 8;
		});

	}

}
