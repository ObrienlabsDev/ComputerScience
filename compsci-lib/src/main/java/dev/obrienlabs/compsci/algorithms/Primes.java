/**
 * Michael O'Brien
 * 2025
 * Primes
 */

package dev.obrienlabs.compsci.algorithms;

import java.util.stream.IntStream;

public class Primes<T extends Number> {
	

	public boolean isPrime(Integer number) {
		if(number < 2) {
			return true;
		} else {
			long count = IntStream.rangeClosed(2, number - 1)
				.filter(i -> number % i == 0)
				.count();
			return count == 0; 
		}
	}
	
	public static void main(String[] args) {
		Primes<Integer> p = new Primes<>();
		IntStream.rangeClosed(1,30)
			.filter(n -> n % 2 != 0)
			.forEach(
					i -> System.out.println(i + " = " + p.isPrime(Integer.valueOf(i))));

	}
}
