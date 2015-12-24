package get_integer_interval_2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestInterval {

	@Test
	public void testInterval() {
		//test1
		int[] test_a={1,10};
		Integer_interval targ1 = new Integer_interval();
		ArrayList<Integer> res1 = new ArrayList();
		res1=targ1.Interval(test_a);
		ArrayList<Integer> a = new ArrayList();
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(10);
		assertEquals(a,res1);
		//test2
		int[] test_b={10,1};
		Integer_interval targ2 = new Integer_interval();
		ArrayList<Integer> res2 = new ArrayList();
		res2=targ2.Interval(test_b);
		ArrayList<Integer> b = new ArrayList();
		b.add(10);
		b.add(8);
		b.add(6);
		b.add(4);
		b.add(2);
		assertEquals(b,res2);
		//test3
		int[] test_c={10,10};
		Integer_interval targ3 = new Integer_interval();
		ArrayList<Integer> res3 = new ArrayList();
		res3=targ3.Interval(test_c);
		ArrayList<Integer> c = new ArrayList();
		c.add(10);
		assertEquals(c,res3);
		//test4
		int[] test_d={5,5};
		Integer_interval targ4 = new Integer_interval();
		ArrayList<Integer> res4 = new ArrayList();
		res4=targ4.Interval(test_d);
		ArrayList<Integer> d = new ArrayList();
		assertEquals(d,res4);
	}

}
