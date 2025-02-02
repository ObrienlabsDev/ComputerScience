package dev.obrienlabs.compsci.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StreamSearch {
	
	public void search() {
		List<String> data = new CopyOnWriteArrayList<>();
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Bob", "Dana", "Eve", "Frank", "Eve", "George", "Heidi");
		names.stream().forEach(a -> data.add(a));
		
		// test methods
		data.stream().distinct().forEach(a -> System.out.println(a + ", "));
		System.out.println("original: " + names.size() + " distict: " + data.stream().distinct().count());
		
		// flatMap
		List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
		List<String> names2 = Arrays.asList("Bob", "Dana", "Eve");
		List<String> names3 = Arrays.asList("Frank", "Eve", "George", "Heidi");
		List<List<String>> listOfLists = Arrays.asList(names1, names2, names3);
		// iterate all names as one
		StringBuffer buffer = new StringBuffer();
		listOfLists.stream().flatMap(a -> a.stream()).forEach(b -> buffer.append(b).append(", "));
		System.out.println(buffer.toString());
		
		// limit
		System.out.println("Limit");
		listOfLists.stream().limit(2).forEach(a -> System.out.println(a));
	}

	public static void main(String[] args) {
		StreamSearch streamer = new StreamSearch();
		streamer.search();
		

	}

}
