package get_letter_interval;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

//import get_integer_interval_2.Integer_interval;

public class TestLetter {

	@Test
	public void testInterval() {
		//test1
		int[] test_a={5,5};
		Letter_interval targ1 = new Letter_interval();
		ArrayList<String> res1 = new ArrayList();
		res1=targ1.Interval(test_a);
		ArrayList<String> a = new ArrayList();
		a.add("e");
		assertEquals(a,res1);
		//test2
		int[] test_b={1,5};
		Letter_interval targ2 = new Letter_interval();
		ArrayList<String> res2 = new ArrayList();
		res2=targ2.Interval(test_b);
		ArrayList<String> b = new ArrayList();
		b.add("a");
		b.add("b");
		b.add("c");
		b.add("d");
		b.add("e");
		assertEquals(b,res2);
		//test3
		int[] test_c={5,1};
		Letter_interval targ3 = new Letter_interval();
		ArrayList<String> res3 = new ArrayList();
		res3=targ3.Interval(test_c);
		ArrayList<String> c = new ArrayList();
		c.add("e");
		c.add("d");
		c.add("c");
		c.add("b");
		c.add("a");
		assertEquals(c,res3);
	}

}
