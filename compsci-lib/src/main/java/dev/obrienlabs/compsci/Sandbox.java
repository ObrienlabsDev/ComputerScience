package dev.obrienlabs.compsci;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sandbox {
	
	public static void main(String[] args) {
		System.out.println("args: " + args.length);
		double value = 102.0;
		
		// at least an order of magnitude slower for concurrency for a single core - but not multicore
		List<Integer> integerList = new CopyOnWriteArrayList<>();
		for(int i=0; i<(1 << 24); i++ ) {
			integerList.add(Integer.valueOf(i));
		}
		integerList.remove(Integer.valueOf(5));
		integerList.stream().forEach(System.out::println);
	}

}
