package notgongyou_in_AB;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestNotGongyou {

	@Test
	public void testNotGongyou() {
		String[] array1={"a","e","h","t","f","c","g","b","d"};
		String[] array2={"a","d","e","f"};
		NotGongyou_element target = new NotGongyou_element();
		ArrayList<String> res = new ArrayList();
		res = target.NotGongyou(array1, array2);
		ArrayList<String> b = new ArrayList();
		b.add("h");
		b.add("t");
		b.add("c");
		b.add("g");
		b.add("b");
		assertEquals(b,res);
	}

}
