package dev.obrienlabs.compsci.collections;


import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class BinaryTreeTest {

	
	
	@Test
	public void testContructor() {
		BinaryTree<Integer> tree = new BinaryTreeImpl<Integer>();
		List<Integer> list = tree.inOrderTraversal();
		assertNotNull(list);
		
		tree.add(10);
		tree.add(16);
		BinaryTree<Integer> subTree = tree.getRight();
		assertNotNull(subTree);
		
	}
}