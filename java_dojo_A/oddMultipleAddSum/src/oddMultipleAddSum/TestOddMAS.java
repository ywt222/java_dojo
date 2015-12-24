package oddMultipleAddSum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOddMAS {

	@Test
	public void testOddMulAddSum() {
		int[] array = {1,5,7,12,11,35,54,67,70};
		OddMAS tar = new OddMAS();
		int res = tar.OddMulAddSum(array);
		int b = 408;
		assertEquals(b,res);
	}

}
