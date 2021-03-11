package com.pawan;

import java.util.ArrayList;
import java.util.List;

public class LambdaThread {
	public static void main(String[] args) {
		
		Runnable run=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println(i+" :: "+Thread.currentThread().getId());
			}
		};
		
		Thread a=new Thread(run);
		Thread b=new Thread(run);
		Thread c=new Thread(run);
		Thread d=new Thread(run);
		
		a.start();
		b.start();
		c.start();
		d.start();
		
		List<String> li=new ArrayList<>();
		li.stream().map(m->m).forEach(s->System.out.println(s));
	}
}
