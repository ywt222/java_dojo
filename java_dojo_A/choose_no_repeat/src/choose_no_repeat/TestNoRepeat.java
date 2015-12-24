package choose_no_repeat;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestNoRepeat {

	@Test
	public void testNoRepeat() {
		int[] array = {1,2,1,3,1,4,3,2};
		No_repeat tar = new No_repeat();
		ArrayList<Integer> res = new ArrayList();
		res = tar.NoRepeat(array);
		ArrayList<Integer> b = new ArrayList();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		assertEquals(b,res);
	}

}
