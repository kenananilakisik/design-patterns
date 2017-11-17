package question1b;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitVectorTests {

	@Test
	/**
	 * Tests for get and set
	 */
	public void test1() {
		BitVector b = new BitVector();
		b.set(5);
		b.set(34);
		b.set(76);
		b.set(98);
		assertEquals(b.get(5),true);
	}
	
	@Test
	/**
	 * Tests for size
	 */
	public void test2() {
		BitVector b = new BitVector();
		b.set(5);
		b.set(34);
		b.set(76);
		b.set(98);
		assertEquals(b.size(),4);
	}
	
	@Test
	/**
	 * Test for copy
	 */
	public void test3()
	{
		BitVector b = new BitVector();
		BitVector c = new BitVector();
		b.set(5);
		b.set(34);
		b.set(76);
		b.set(98);
		c.set(2);
		c.set(35);
		c.set(78);
		c.set(99);
		c.set(129);
		b.copy(c);
		int bArray[] = b.getArray();
		String str3 = "";
		for (int m = 0; m < bArray.length;m++)
		{
			str3 += bArray[m] + " ";
		}
		assertEquals(str3,"36 12 20480 12 2 ");
	}
	
	@Test
	/**
	 * Test for clear
	 */
	public void test4()
	{

		BitVector b = new BitVector();
		b.set(5);
		b.set(34);
		b.set(76);
		b.set(98);
		b.clear(76);
		assertEquals(b.get(76),false);
	}
	
	@Test
	/**
	 * Test for iterator
	 */
	public void test5()
	{
		BitVector b = new BitVector();
		b.set(5);
		b.set(34);
		b.set(76);
		b.set(98);
		String str = "";
		Iterator<Integer> i = b.iterator();
		while(i.hasAnotherElement())
		{
			str += i.nextElement() + " ";
		}
		assertEquals(str,"5 34 76 98 ");
	}


}

