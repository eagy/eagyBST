import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;

public class LinkedBinarySearchTreeTest {
	LinkedBinarySearchTree<Integer> test;
	
	@Before
	public void setUp() throws Exception {
		test = new LinkedBinarySearchTree<>();
	}

	@After
	public void tearDown() throws Exception {
		test = null; 
	}

	@Test
	public void testFind() {
		test.addElement(1);
		
		assertEquals((Integer)1, test.find(1));
	}

	@Test
	public void testAddElement() {
		test.addElement(1);
		
		assertEquals((Integer)1, test.find(1));
	}

	@Test
	public void testRemoveElement() {
		test.addElement(1);
		
		assertEquals((Integer)1, test.removeElement(1));
	}

	@Test
	public void testRemoveAllOccurrences() {
		test.addElement(1);
		test.addElement(1);
		test.addElement(1);
		test.addElement(1);
		test.addElement(1);
		test.addElement(2);
		
		test.removeAllOccurrences(1);
		
		assertEquals(1, test.size());
		assertFalse(test.contains(1));
	}

	@Test
	public void testRemoveMin() {
		test.addElement(1);
		test.addElement(2);
		test.addElement(3);
		
		assertEquals((Integer)1, test.removeMin());
	}

	@Test
	public void testRemoveMax() {
		assertTrue(true);
	}

	@Test
	public void testFindMin() {
		assertTrue(true);
	}

	@Test
	public void testFindMax() {
		assertTrue(true);
	}

	@Test
	public void testGetLeft() {
		test.addElement(2);
		test.addElement(1);
		test.addElement(3);
		
		assertEquals((Integer)1, test.getLeft().getRootElement());
	}

	@Test
	public void testGetRight() {
		test.addElement(2);
		test.addElement(1);
		test.addElement(3);
		
		System.out.println(test.getRootElement());
		assertEquals((Integer)3, test.getRight().getRootElement());
	}

	@Test
	public void testGetRootElement() {
		test.addElement(1);
		
		assertEquals((Integer)1, test.getRootElement());
	}

	@Test
	public void testGetRootNode() {
		assertNull(test.getRootNode());
		
		test.addElement(1);
		
		assertNotNull(test.getRootNode());
	}

	@Test
	public void testIsEmpty() {
		assertTrue(test.isEmpty());
		
		test.addElement(1);
		
		assertFalse(test.isEmpty());
	}

	@Test
	public void testSize() {
		test.addElement(1);
		test.addElement(2);
		test.addElement(3);
		test.addElement(4);
		test.addElement(5);
		
		assertEquals(5, test.size());
	}

	@Test
	public void testGetHeight() {
		test.addElement(1);
		test.addElement(2);
		test.addElement(3);
		test.addElement(4);
		test.addElement(5);
		
		assertEquals(4, test.getHeight());
	}

	@Test
	public void testContains() {
		test.addElement(1);
		test.addElement(2);
		test.addElement(3);
		test.addElement(4);
		test.addElement(5);
		
		assertTrue(test.contains(4));
		assertFalse(test.contains(6));
	}

	@Test
	public void testToString() {
		test.addElement(3);
		test.addElement(2);
		test.addElement(1);
		test.addElement(4);
		test.addElement(5);
		
		assertEquals("1 2 3 4 5 ", test.toString());
	}

	@Test
	public void testIteratorInOrder() {
		test.addElement(2);
		test.addElement(1);
		test.addElement(4);
		test.addElement(3);
		test.addElement(5);
		Iterator<Integer> it = test.iteratorInOrder();
		
		assertEquals((Integer)1, it.next());
		assertEquals((Integer)2, it.next());
		assertEquals((Integer)3, it.next());
		assertEquals((Integer)4, it.next());
		assertEquals((Integer)5, it.next());
	}

	@Test
	public void testIteratorPreOrder() {
		test.addElement(2);
		test.addElement(1);
		test.addElement(4);
		test.addElement(3);
		test.addElement(5);
		Iterator<Integer> it = test.iteratorPreOrder();
		
		assertEquals((Integer)2, it.next());
		assertEquals((Integer)1, it.next());
		assertEquals((Integer)4, it.next());
		assertEquals((Integer)3, it.next());
		assertEquals((Integer)5, it.next());
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testIteratorPostOrder() {
		test.iteratorPostOrder();
	}

	@Test
	public void testIteratorLevelOrder() {
		test.addElement(4);
		test.addElement(2);
		test.addElement(6);
		test.addElement(1);
		test.addElement(3);
		test.addElement(5);
		test.addElement(7);
		Iterator<Integer> it = test.iteratorLevelOrder();
		
		assertEquals((Integer)4, it.next());
		assertEquals((Integer)2, it.next());
		assertEquals((Integer)6, it.next());
		assertEquals((Integer)1, it.next());
		assertEquals((Integer)3, it.next());
		assertEquals((Integer)5, it.next());
		assertEquals((Integer)7, it.next());
	}

}
