import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayUnorderedListTest {
	ArrayUnorderedList<Integer> test;
	
	@Before
	public void setUp() throws Exception {
		test = new ArrayUnorderedList<>();
		
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public void testAddToFront() {
		test.addToFront(new Integer(1));
		assertEquals((Integer)1, test.first());
	}

	@Test
	public void testAddToRear() {
		test.addToRear(new Integer(3));
		assertEquals((Integer)3, test.last());
	}

	@Test
	public void testAddAfter() {
		test.addToFront(new Integer(1));
		test.addToRear(new Integer(3));
		test.addAfter((Integer)2, (Integer)1);
		
		assertEquals((Integer)3, test.last());
		assertEquals((Integer)1, test.first());
		assertTrue(test.contains((Integer)2));
	}


	@Test
	public void testRemoveLast() {
		test.addToFront(new Integer(1));
		test.addToRear(new Integer(3));
		test.addAfter((Integer)2, (Integer)1);
		
		assertEquals((Integer)3,test.removeLast());
	}

	@Test
	public void testRemoveFirst() {
		test.addToFront(new Integer(1));
		test.addToRear(new Integer(3));
		test.addAfter((Integer)2, (Integer)1);
		
		assertEquals((Integer)1,test.removeFirst());
	}

	@Test
	public void testRemove() {
		test.addToFront(new Integer(1));
		test.addToRear(new Integer(3));
		test.addAfter((Integer)2, (Integer)1);
		
		assertEquals((Integer)2,test.remove(2));
	}

	@Test
	public void testFirst() {
		test.addToFront(new Integer(1));
		test.addToRear(new Integer(3));
		test.addAfter((Integer)2, (Integer)1);
		
		assertEquals((Integer)1, test.first());
	}

	@Test
	public void testLast() {
		test.addToFront(new Integer(1));
		test.addToRear(new Integer(3));
		test.addAfter((Integer)2, (Integer)1);
		
		assertEquals((Integer)3, test.last());
	}

	@Test
	public void testContains() {
		test.addToFront((Integer)1);
		assertTrue(test.contains((Integer)1));
	}

	@Test
	public void testIsEmpty() {
		assertTrue(test.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(0, test.size());
		
		test.addToFront((Integer)1);
		
		assertEquals(1, test.size());
	}

	@Test
	public void testToString() {
		test.addToFront(1);
		test.addToRear(3);
		test.addAfter(2,1);
		assertEquals("1 2 3", test.toString());
	}

	@Test
	public void testIterator() {
		Iterator<Integer> it = test.iterator();
		
		assertNotNull(it);
	}

}
