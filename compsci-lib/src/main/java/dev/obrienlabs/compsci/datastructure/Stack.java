package dev.obrienlabs.compsci.datastructure;

/**
 * 20250209 Stack implementation from scratch
 * mirror java.util.Stack
 * @author michaelobrien
 *
 * @param <T>
 */
public interface Stack<T> {
	void push(T item);
	T pull();
	T pop();
	T peek();
	boolean isEmpty();
	int size();
}
