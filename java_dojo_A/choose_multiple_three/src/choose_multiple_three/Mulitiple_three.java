package choose_multiple_three;

import java.util.ArrayList;
//ѡ��3�ı���
public class Mulitiple_three {
	public ArrayList<Integer> Multiple(int[] array){
		ArrayList<Integer> tar = new ArrayList();
		for(int i=0;i<array.length;i++){
			if(array[i]%3==0){
				tar.add(array[i]);
			}
		}
		return tar;
	}

}
