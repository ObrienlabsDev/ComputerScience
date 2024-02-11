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

		
		// Add a list of numbers
		List<Integer> numbersToInsert = Stream.of(8,16,32,64,48,2,128).collect(Collectors.toList());
		tree.add(numbersToInsert);
		
		List<BinaryTree<Integer>> list = tree.inOrderTraversal();
		assertNotNull(list);

		BinaryTree<Integer> subTree = tree.getLeft();
		assertNotNull(subTree);
		assertTrue(subTree.getData().intValue() == 2);
		System.out.println("left subtree: " + subTree.getData());
		System.out.println("tree: " + tree);

		List<BinaryTree<Integer>> leftList = tree.inOrderTraversalOnlyLeft();
		assertNotNull(leftList);
		StringBuffer buffer = new StringBuffer();
		leftList.stream().forEach(x -> buffer.append(x.getData()).append(","));
		System.out.println("left nodes: " + tree.printOn(leftList));
		
	}
}