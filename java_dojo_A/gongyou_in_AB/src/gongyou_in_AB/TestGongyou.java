package gongyou_in_AB;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestGongyou {

	@Test
	public void testGongyou() {
		String[] array1={"a","e","h","t","f","c","g","b","d"};
		String[] array2={"a","d","e","f"};
		Gongyou_element target = new Gongyou_element();
		ArrayList<String> res = new ArrayList();
		res = target.Gongyou(array1, array2);
		ArrayList<String> b = new ArrayList();
		b.add("a");
		b.add("e");
		b.add("f");
		b.add("d");
		assertEquals(b,res);
	}

}
