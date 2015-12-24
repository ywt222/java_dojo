package get_intersection;

import java.util.ArrayList;
//弹出两个集合的交集
public class Intersection {
	public ArrayList<Integer> Jiaoji(int[] array1,int[] array2){
		ArrayList<Integer> tar = new ArrayList();
		for(int i=0;i<array2.length;i++){
			for(int j=0;j<array1.length;j++){
				if (array2[i] == array1[j]){
					tar.add(array2[i]);
				}
			}
		}
		return tar;
	}
}
