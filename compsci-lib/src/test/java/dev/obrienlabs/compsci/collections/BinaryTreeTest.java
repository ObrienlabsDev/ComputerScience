package dev.obrienlabs.compsci.collections;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;


public class BinaryTreeTest {

	
	
	@Test
	public void testContructor() {
		BinaryTree<Integer> tree = new BinaryTreeImpl<Integer>();
		List<Integer> list = tree.inOrderTraversal();
		assertNotNull(list);
		
		// Add a list of numbers
		List<Integer> numbersToInsert = Stream.of(8,16,32,64,48,2,128).collect(Collectors.toList());
		tree.add(numbersToInsert);

		BinaryTree<Integer> subTree = tree.getRight();
		assertNotNull(subTree);
		assertTrue(subTree.getData().intValue() == 16);
		System.out.println("right subtree:" + subTree.getData());
		System.out.println("tree: " + tree);
		
	}
}