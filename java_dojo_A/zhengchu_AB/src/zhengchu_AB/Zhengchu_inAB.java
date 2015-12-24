package zhengchu_AB;

import java.util.ArrayList;
//选出A集合中可以被B集合中整除的数
public class Zhengchu_inAB {
	public ArrayList<Integer> ZhengchuAB(int[] array1,int[] array2){
		ArrayList<Integer> tar = new ArrayList();
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if(array1[i]%array2[j] == 0){
					tar.add(array1[i]);
					break;
				}
			}
		}
		return tar;
	}
}
