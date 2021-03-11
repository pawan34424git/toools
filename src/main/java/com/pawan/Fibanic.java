package com.pawan;

public class Fibanic {

	public static void main(String[] args) {
		int N = 104;

		loop(N);
		System.out.println("------------------------------");

		for (int i = 0; i < N; i++) {

			System.out.print(fib(i) + " ");
		}

	}

	static int fib(int n) {
		// Base Case
		if (n <= 1)
			return n;

		// Recursive call
		return fib(n - 1) + fib(n - 2);
	}

	static void loop(int N) {
		int num1 = 0, num2 = 1;
		int counter = 0;
		while (counter < N) {

			// Print the number
			System.out.print(num1 + " ");

			// Swap
			int temp = num2 + num1;
			num1 = num2;
			num2 = temp;

			counter++;
		}
	}
}
