package collect_all_even;

import java.util.ArrayList;
//ѡ�����������е�����ż��
public class AllEven {
	public ArrayList<Integer> Even(int[] array){
		
		ArrayList<Integer> tar = new ArrayList();
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				tar.add(array[i]);
			}
		}
		return tar;
	}
}



