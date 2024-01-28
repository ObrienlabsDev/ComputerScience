package dev.obrienlabs.compsci.collections;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImpl<T extends Comparable<? super T>> implements BinaryTree<T> {
	
	private BinaryTree<T> left;
	private BinaryTree<T> right;
	private T data;


	public BinaryTreeImpl() {
		data = null;
	}
	
	public BinaryTreeImpl(T value) {
		data = value;
	}

	@Override
	public List<T> inOrderTraversal() {
		List<T> list = new ArrayList<T>();
		list.add(data);
		return list;
	}

	@Override
	public void add(T value) {
		// recursively insert value
		if(null == data) {
			data = value;
		} else {
			if(null == right && data.compareTo(value) < 0) {
				BinaryTree<T> right = new BinaryTreeImpl(value);
				this.right = right;
				
			}
		}
	}

	@Override
	public void delete(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer depth() {
		// TODO Auto-generated method stub
		return null;
	}
	


	@Override
	public BinaryTree<T> getLeft() {
		return left;
	}

	@Override
	public BinaryTree<T> getRight() {
		return right;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
