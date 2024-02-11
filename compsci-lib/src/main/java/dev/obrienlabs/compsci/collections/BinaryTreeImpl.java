package dev.obrienlabs.compsci.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

	public T getData() {
		return data;
	}
	
	@Override
	public List<BinaryTree<T>> inOrderTraversal() {
		return inOrderTraversalHelper(new ArrayList<BinaryTree<T>>());
	}

	@Override
	public List<BinaryTree<T>> inOrderTraversalHelper(List<BinaryTree<T>> list) {
		if(null != left)
			left.inOrderTraversalHelper(list);
		list.add(this);
		if(null != right)
			right.inOrderTraversalHelper(list);
		return list;
	}

	@Override
	public List<BinaryTree<T>> inOrderTraversalOnlyLeft() {
		return inOrderTraversalOnlyLeftHelper(new ArrayList<BinaryTree<T>>(), false);
	}

	@Override
	public List<BinaryTree<T>> inOrderTraversalOnlyLeftHelper(List<BinaryTree<T>> list, boolean add) {
		if(null != left)
			left.inOrderTraversalOnlyLeftHelper(list, true);
		if(add) 
			list.add(this);
		if(null != right)
			right.inOrderTraversalOnlyLeftHelper(list, false);
		return list;
	}	
	
	@Override
	public void add(T value) {
		// recursively insert value
		if(null == data) {
			data = value;
		} else {
			// traverse until a null child exists
			if(data.compareTo(value) < 0) {
				if(null == right) {
					right =  new BinaryTreeImpl<T>(value);
				} else {
					right.add(value);
				}
			} else {
				if(null == left) {
					left =  new BinaryTreeImpl<T>(value);
				} else {
					left.add(value);
				}			
			}
		}
	}

	@Override
	public void add(List<T> list) {
		list.stream().forEach(addConsumer);
	}
	
	Consumer<T> addConsumer = new Consumer<T>() {
		public void accept(T value) {
			add(value);
		}
	};
	
	@Override
	public boolean search(T value) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String printOn(List<BinaryTree<T>> list) {
		StringBuffer buffer = new StringBuffer();
		list.stream().forEach(x -> buffer.append(x.getData()).append(","));
		return buffer.toString();
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(data);
		//inOrderTraversal().stream().forEach(i -> buffer.append(i.getData()).append(","));
		return buffer.toString();
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
