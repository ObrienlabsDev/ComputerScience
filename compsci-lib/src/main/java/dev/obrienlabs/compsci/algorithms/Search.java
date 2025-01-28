package dev.obrienlabs.compsci.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class Search {
	
	
	  public double filledCellsPercentage(int x, int y, int[][] cells) {

		  // sum all 1s, divide by grid size XxY 
		  // flatten array, count
		  // use x and y to shortcut to a max sum
		  float total = x * y;
		  long count = Arrays.stream(cells)
				  .flatMapToInt(Arrays::stream)//i -> Arrays.stream(i))//::stream)
				  .filter(i -> i > 0)
				  .count();
		  float percentage = count / total;
		  System.out.println("sum: " + count + " perc: " + percentage);
		  return percentage;

	  }

	/**
	 * 20250123
	 * Compute whether each item is the largest item between itself and all other items on the right
	 */
	public void determineLeftToRightGlobalOrder() {
		int[] input =  {4, 3, 2, 3, 1};
		int[] output = {1, 0, 0, 0, 1}; // whare 1=highest, 0=!highest
		
		// start iterating from left to right
		// compare the current index with the sublist on the right - it must be GT
		// for in place - mark the index as 1 if GT, 0 if equal or LT all to the right
		// Will involve a 2 level nested search
		// O(n) time complexity
		// O(1) storage complexity
		
		// for 1 pass
		System.out.println("pass 1");
		List<Integer> list = Arrays.stream(input)
				.boxed() // int to Integer
				.collect(Collectors.toList());
		
		// threadsafe non-final counter
		AtomicLong counter = new AtomicLong(0);
		
		List<Boolean> _list = list.stream()
				.map(y -> y > list.subList(counter.intValue(), list.size()).stream().max((k, j) -> k.compareTo(j)).get())
				.collect(Collectors.toList());
		_list.forEach(x -> System.out.println(x));
		
		System.out.println("pass 2");
		List<Integer> list2 = Arrays.stream(input).boxed().collect(Collectors.toList());
		
		
		//List<Boolean> _list = list.stream
	}
	
	public static void main(String[] args) {
		Search search = new Search();
		//search.determineLeftToRightGlobalOrder();
		int[][] array = {{0,0,1},{1,0,0}};
		search.filledCellsPercentage(2, 3, array );
	}
}
