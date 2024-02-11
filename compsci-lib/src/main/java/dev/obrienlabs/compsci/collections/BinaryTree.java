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
	List<BinaryTree<T>> inOrderTraversal();
	List<BinaryTree<T>> inOrderTraversalHelper(List<BinaryTree<T>> list);
	List<BinaryTree<T>> inOrderTraversalOnlyLeft();
	List<BinaryTree<T>> inOrderTraversalOnlyLeftHelper(List<BinaryTree<T>> list);	
}
