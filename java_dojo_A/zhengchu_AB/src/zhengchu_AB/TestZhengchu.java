package zhengchu_AB;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestZhengchu {

	@Test
	public void testZhengchuAB() {
		int[] array1 = {4,7,9,25,16,21,64,32,35,49};
		int[] array2 = {2,3,5};
		Zhengchu_inAB tar = new Zhengchu_inAB();
		ArrayList<Integer> res = new ArrayList();
		res = tar.ZhengchuAB(array1,array2);
		ArrayList<Integer> b = new ArrayList();
		b.add(4);
		b.add(9);
		b.add(25);
		b.add(16);
		b.add(21);
		b.add(64);
		b.add(32);
		b.add(35);
		assertEquals(b,res);
	}

}
