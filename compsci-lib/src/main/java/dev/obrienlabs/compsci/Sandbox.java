package dev.obrienlabs.compsci;

import java.util.ArrayList;
import java.util.List;

public class Sandbox {
	
	public static void main(String[] args) {
		System.out.println("args: " + args.length);
		double value = 102.0;
		
		List<Integer> integerList = new ArrayList<>();
		for(int i=0; i<10; i++ ) {
			integerList.add(Integer.valueOf(i));
		}
		integerList.stream().forEach(System.out::println);
	}

}
