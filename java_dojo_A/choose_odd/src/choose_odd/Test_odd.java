package choose_odd;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Test_odd {

	@Test
	public void testOdd() {
		int[] array = {0,1,2,3,4,5};
		Choose_odd tar = new Choose_odd();
		ArrayList<Integer> res = new ArrayList();
		res = tar.Odd(array);
		ArrayList<Integer> b = new ArrayList();
		b.add(1);
		b.add(3);
		b.add(5);
		assertEquals(b,res);
	}

}
