package dev.obrienlabs.compsci.algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.Collectors;

public class Ordering {
	
	public int[] reverse(int[] a) {
		// built in via StringBuilder
		// using a stack - no - use deque
		Deque<Integer> queue = new ConcurrentLinkedDeque<>();
		//List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		Arrays.stream(a).forEach(x -> queue.add(x));
		ArrayList<Integer> list = new ArrayList<>();
		queue.stream().forEach(x -> list.add(queue.removeLast()));
		// 1 element remaining
		list.add(queue.removeLast());
		Integer[] typedArray = list.stream().toArray(Integer[]::new);
		return Arrays.stream(typedArray).mapToInt(x -> x).toArray();
	}
	
	public boolean same(int[] a, int[] b) {
		
		return true;
	}

	public static void main(String[] args) {
		Ordering order = new Ordering();
		
		int[] b = {4,3,2};
		int[] r = order.reverse(b);
		
		System.out.println(order.same(b, r));
		
	}

}
