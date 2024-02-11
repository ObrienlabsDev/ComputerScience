package dev.obrienlabs.compsci.collections;

import java.util.List;

public interface BinaryTree<T extends Comparable<? super T>> {

	void add(List<T> list);
	void add(T value);
	void delete(T value);
	BinaryTree<T> getLeft();
	BinaryTree<T> getRight();
	T getData();
	boolean search(T value);
	Integer depth();
	List<T> inOrderTraversal();
	List<T> inOrderTraversalHelper(List<T> list);
	
}
