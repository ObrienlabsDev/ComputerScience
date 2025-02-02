package dev.obrienlabs.compsci.algorithms;

import java.util.stream.IntStream;

public class Fibonacci<T extends Number> {
	
	// 1,1,2,3,5,8.13
	public Integer getFibonacciNumber(Integer number) {
		// base
		if(number < 2) {
			return Integer.valueOf(1);
		} else {
		// recursive
			return getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci<Integer> f = new Fibonacci<>();
		IntStream.range(0,15).forEach(
			i -> System.out.println(i + " = " + f.getFibonacciNumber(Integer.valueOf(i))));

	}
}
