package dev.obrienlabs.compsci.algorithms;

public class Ordering {
	
	public int[] reverse(int[] a) {
		return a;
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
