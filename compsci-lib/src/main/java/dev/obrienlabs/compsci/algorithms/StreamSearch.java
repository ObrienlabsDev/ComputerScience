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
		
	}

	public static void main(String[] args) {
		StreamSearch streamer = new StreamSearch();
		streamer.search();
		

	}

}
