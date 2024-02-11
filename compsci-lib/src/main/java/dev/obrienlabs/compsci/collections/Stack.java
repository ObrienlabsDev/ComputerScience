package dev.obrienlabs.compsci.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Stack {

	boolean isBalanced(String s) {
		boolean balanced = true;
		// index is important
		String pushKeys = "[{(";
		String pullKeys = "]})";
		Map<String, Integer> dictionaryIndex = new HashMap<String, Integer>();
		Map<String, Integer> dictionaryCost = new HashMap<String, Integer>();
		
		// initialize lookup map
		pushKeys.chars().forEach(x -> dictionaryCost.put(String.valueOf((char)x), Integer.valueOf(1)));
		pullKeys.chars().forEach(x -> dictionaryCost.put(String.valueOf((char)x), Integer.valueOf(-1)));

		// initialize stacks
		Map<Integer, Integer> stack = new HashMap<Integer, Integer>();
		for(int i=0; i<pushKeys.length(); i++) {
			stack.put(i, 0);
			dictionaryIndex.put(pushKeys.substring(i, i+1), i);
			dictionaryIndex.put(pullKeys.substring(i, i+1), i);	
		}
		
		Stream.of(s).forEach(x -> System.out.println(x));
		// lookup dictionary value and add to stack at index - flatmap
		// parse both key strings
		// use index in dictionary to add to stack
		//Stream.of(pushKeys).forEach(x -> {
			
		//});
		//////Integer index = 0;
		//Stream.of(s).forEach(x -> {
		for(int index=0; index<s.length(); index++) {
			// get lookup position
			int position = dictionaryIndex.get(s.substring(index, index+1));
			// get value to add to 
			int current = stack.get(position);
			int adjust = dictionaryCost.get(s.substring(index, index+1));
			stack.put(position, current + adjust);
		}
		
		// check numbers in stack - all must be zero
		for(Integer value : stack.values()) {
			if(value != 0) {
				balanced = false;
			}
		}
		//if(stack.entrySet().stream().filter(x -> !x.getValue().equals(0)).count() > 0)
		//	balanced = true;
		//});
		
		/*List<String> list = Stream.of(s)
				.filter(x -> x.equals(dictionary.get(x)))
				.collect(Collectors.toList());
		list.forEach(x -> System.out.println(x));*/
		
		return balanced;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		String aString = "{}([()][])";
		System.out.println(stack.isBalanced(aString));
	}
}
