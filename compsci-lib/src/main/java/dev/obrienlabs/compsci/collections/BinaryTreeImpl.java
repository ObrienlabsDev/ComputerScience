package dev.obrienlabs.compsci.collections;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImpl<T> implements BinaryTree<T> {
	
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	private T data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> inOrderTraversal() {
		List<T> list = new ArrayList<T>();
		list.add(data);
		return list;
	}

}
