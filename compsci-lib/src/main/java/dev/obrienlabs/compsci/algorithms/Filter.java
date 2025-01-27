package dev.obrienlabs.compsci.algorithms;

import java.util.stream.Collectors;

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
		
		Filter filter = new Filter();
		
		StringBuilder builder = original.chars()
			.mapToObj(c -> (char) c)
			.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append); // supplier, accumulator, combiner
		System.out.println("Unmodified: " + builder.toString());
		
		builder = original.chars()
				.mapToObj(c -> (char) c)
				.map(Filter::swap)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append); // supplier, accumulator, combiner
		System.out.println("Modified: " + builder.toString());	

	}

}
