package dev.obrienlabs.compsci.algorithms;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Filter {
	public static final Character A = Character.valueOf('A');
	public static final Character B = Character.valueOf('B');
	
	public static Character swap(Character x) {
		if(x.equals(A)) {
			return B;
		} else {
			return A;
		}
	}

	public static void main(String[] args) {
		String original = "ABAA";
		String target = "BABB";
		
		StringBuilder builder = original.chars()
			.mapToObj(c -> (char) c)
			.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append); // supplier, accumulator, combiner
		System.out.println("Unmodified: " + builder.toString());
		
		builder = original.chars()
				.mapToObj(c -> (char) c)
				.map(Filter::swap)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append); // supplier, accumulator, combiner
		System.out.println("Modified: " + builder.toString());	

		
		// filter even numbers
		IntStream.range(1, 20).parallel().filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
	}

}
