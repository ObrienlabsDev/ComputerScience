package dev.obrienlabs.compsci.collections;

import java.util.List;

public interface BinaryTree<T> {

	void add(T value);
	void delete(T value);
	BinaryTree<T> getLeft();
	BinaryTree<T> getRight();
	Integer depth();
	List<T> inOrderTraversal();
}
