package choose_no_repeat;

import java.util.ArrayList;
//ѡ��û���ظ���
public class No_repeat {
	public ArrayList<Integer> NoRepeat(int[] array){
		ArrayList<Integer> tar = new ArrayList();
		//ð������
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//ǰlength-1��Ԫ��
		for(int i=0;i<array.length-1;i++){
			if(array[i]!=array[i+1]){
				tar.add(array[i]);
			}
		}
		//���һ��Ԫ��
		if(array[array.length-1]!=array[array.length-2]){
			tar.add(array[array.length-1]);
		}
		return tar;
	}

}
