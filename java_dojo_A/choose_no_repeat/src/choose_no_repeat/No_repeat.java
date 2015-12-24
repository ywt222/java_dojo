package choose_no_repeat;

import java.util.ArrayList;
//选出没有重复的
public class No_repeat {
	public ArrayList<Integer> NoRepeat(int[] array){
		ArrayList<Integer> tar = new ArrayList();
		//冒泡排序
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//前length-1个元素
		for(int i=0;i<array.length-1;i++){
			if(array[i]!=array[i+1]){
				tar.add(array[i]);
			}
		}
		//最后一个元素
		if(array[array.length-1]!=array[array.length-2]){
			tar.add(array[array.length-1]);
		}
		return tar;
	}

}
