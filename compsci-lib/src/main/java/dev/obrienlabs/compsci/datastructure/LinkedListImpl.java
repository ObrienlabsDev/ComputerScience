package dev.obrienlabs.compsci.datastructure;

import java.util.LinkedList;
import java.util.stream.LongStream;

public class LinkedListImpl {

	LinkedList<Long> list;
	
	
	public void uc1InsertionOptimized() {
		long start = System.nanoTime();
		
		list = new LinkedList<>();
		LongStream.range(0, 1 << 31)
			.forEach(i -> list.add(i));
		
		// randomly remove items
		LongStream.range(0, 1 << 11)
		.forEach(i -> list.remove(i));
	
		long end = System.nanoTime();
		System.out.println("Dur NS: " + (end - start));
	}
	
	public void uc2SearchSubOptimial() {
		
	}
	
	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		list.uc1InsertionOptimized();
		list.uc2SearchSubOptimial();

	}

}
