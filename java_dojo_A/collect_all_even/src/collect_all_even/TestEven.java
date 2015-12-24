package collect_all_even;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestEven {

	@Test
	public void testEven() {
		
			int[] source = {1,2,3,4,5};
			AllEven targ = new AllEven();
			ArrayList<Integer> res = new ArrayList();
			res=targ.Even(source);
			//assertEquals中的参数类型必须一致，因此把{2,4}转换为ArrayList类型
			ArrayList<Integer> b = new ArrayList();
			b.add(2);
			b.add(4);
			assertEquals(b,res);
		
	}

}
