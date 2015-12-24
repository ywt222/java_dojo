package get_intersection;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestIntersection {

	@Test
	public void testJiaoji() {
		int[] array1={10,27,28,19,5};
		int[] array2={5,78,28,19,23};
		Intersection target = new Intersection();
		ArrayList<Integer> res = new ArrayList();
		res = target.Jiaoji(array1, array2);
		ArrayList<Integer> b = new ArrayList();
		b.add(5);
		b.add(28);
		b.add(19);
		assertEquals(b,res);
	}

}
