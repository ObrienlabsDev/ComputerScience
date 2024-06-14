package dev.obrienlabs.compsci.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StackImpl {

	String pushKeys = "[{(";
	String pullKeys = "]})";
	// move these
	boolean balanced = true;	
	Stack<String> stack = new Stack<String>();
	/*
	 * Using streams and stack from java 8
	 * 
	 */
	boolean isBalanced(String s) {
		// stream and check push/pull pairs
		stack = new Stack<String>();
		s.chars().mapToObj(c -> (char)c).forEach(mapConsumer);
		if(!stack.isEmpty())
			return false;
		else
			return balanced;
	}
	
	Consumer<Character> mapConsumer = new Consumer<Character>() {
		public void accept(Character s) {
			if(pushKeys.contains(s.toString())) {
				stack.push(s.toString());
			} else {
				if(!stack.isEmpty()) { // check for too many closing brackets
					String y = stack.pop();
					// if pull of last push corresponds to current char - ok				
					if(pushKeys.indexOf(y) != pullKeys.indexOf(s.toString())) {
						balanced = false;
					}
				} else {
					balanced = false;
				}
			}
		}
	};
	
	/**
	 * @deprecated
	 * Using mix of pre-post Java 8
	 * @param s
	 * @return
	 */
	boolean isBalanced2(String s) {
		boolean balanced = true;
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
		StackImpl stack = new StackImpl();
		String aString = "{}([()][])"; // true
		//String aString = "{}([()][]"; // false
		//String aString = "{}([()][]))"; // false
		//String aString = "{[}]"; // false - need to check pull removal
		System.out.println(stack.isBalanced(aString));
	}
}
