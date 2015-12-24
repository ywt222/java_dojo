package choose_multiple_three;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestMultiple {

	@Test
	public void testMultiple() {
		int[] array = {0,1,2,3,4,5,6,9,11};
		Mulitiple_three tar = new Mulitiple_three();
		ArrayList<Integer> res = new ArrayList();
		res = tar.Multiple(array);
		ArrayList<Integer> b = new ArrayList();
		b.add(0);
		b.add(3);
		b.add(6);
		b.add(9);
		assertEquals(b,res);
	}

}
