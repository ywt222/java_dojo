package rank_twolarge_onesmall;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRank {

	@Test
	public void testRank() {
		int[] array = {2,8,1,9,6,4,3,10};
		Rank_twoLarge_oneSmall tar = new Rank_twoLarge_oneSmall();
		int[] res = tar.Rank(array);
		int[] b = {2,3,1,6,8,4,9,10};
		assertEquals(b,res);
	}
}
