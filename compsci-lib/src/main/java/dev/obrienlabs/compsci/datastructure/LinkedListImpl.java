package dev.obrienlabs.compsci.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

public class LinkedListImpl {

	LinkedList<Long> list;
	
	public LinkedListImpl() {
		list = new LinkedList<>();
	}
	
	public void uc1InsertionOptimized(List<Long> aList, Long p1) {
		long start = System.currentTimeMillis();//.nanoTime();
		aList.add(p1);
		
		LongStream.range(0, 1 << 4)//27)
			.forEach(i -> aList.add(i));
		
		System.out.println("pass by reference size in function: " + aList.size());
		// randomly remove items
		//LongStream.range(0, 1 << 11)
		//.forEach(i -> aList.remove(i));
	
		long end = System.currentTimeMillis();//.nanoTime();
		System.out.println("Dur MS: " + (end - start));
	}
	
	public boolean uc2SearchSubOptimial(List<Long> aList, Long p1) {
		return aList.indexOf(p1) > -1;
	}
	
	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		LinkedList<Long> aList = new LinkedList<>();
		aList.add(Long.valueOf(0L));
		Long param = Long.valueOf(1L);
		list.uc1InsertionOptimized(aList, param);
		System.out.println("Found: " + list.uc2SearchSubOptimial(aList, param));
		System.out.println("pass by reference size in caller: " + aList.size());
	}

}
