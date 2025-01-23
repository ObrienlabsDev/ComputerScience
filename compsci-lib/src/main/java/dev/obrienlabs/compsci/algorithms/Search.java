package dev.obrienlabs.compsci.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

	/**
	 * 20250123
	 * Compute whether each item is the largest item between itself and all other items on the right
	 */
	public void determineLeftToRightGlobalOrder() {
		int[] input =  {4, 3, 2, 3, 1};
		int[] output = {1,0,0,0,1};
		
		// start iterating from left to right
		// compare the current index with the sublist on the right - it must be GT
		// for in place - mark the index as 1 if GT, 0 if equal or LT all to the right
		// Will involve a 2 level nested search
		// O(n) time complexity
		// O(1) storage complexity
		
		// for 1 pass
		List<Integer> list = Arrays.stream(input)
				.boxed() // int to Integer
				.collect(Collectors.toList());
		list.forEach(x -> System.out.println(x));

	}
	
	public static void main(String[] args) {
		Search search = new Search();
		search.determineLeftToRightGlobalOrder();
	}
}
