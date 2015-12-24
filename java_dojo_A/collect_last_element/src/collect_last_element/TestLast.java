package collect_last_element;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLast {

	@Test
	public void testLast() {
		int[] source={1,2,3,4,5};
		LastElement tar = new LastElement();
		int z = tar.Last(source);
		assertEquals(5,z);
	}
}
