package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibListAugmentTester {
	@Test
	public void test0() {
		FibList l = new FibList();
		assertTrue(l.repOk());
		l.augment();
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		assertTrue(l.header != null);
		// your code goes here
	}

	@Test
	public void test1() {
		FibList l = new FibList();
		assertTrue(l.repOk());
		l.augment();
		assertTrue(l.repOk());
		l.augment();
		assertTrue(l.repOk());
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		assertTrue(l.header != null);
		// your code goes here
	}
}
