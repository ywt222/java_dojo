package notgongyou_in_AB;

import java.util.ArrayList;
//选出A集合中与B集合中的不共有元素
public class NotGongyou_element {
	public ArrayList<String> NotGongyou(String[] array1,String[] array2){
		ArrayList<String> tar = new ArrayList();
		//把属于A但不属于B的元素添加到tar中
		for(int i=0;i<array1.length;i++){
			int flag = 1;
			for(int j=0;j<array2.length;j++){
				if(array1[i] == array2[j]){
					flag = 0;
					break;
				}
			}	
			if(flag == 1){
				tar.add(array1[i]);
			}
		}
		//把属于B但不属于A的元素添加到tar中
		for(int i=0;i<array2.length;i++){
			int flag = 1;
			for(int j=0;j<array1.length;j++){
				if(array2[i] == array1[j]){
					flag = 0;
					break;
				}
			}	
			if(flag == 1){
				tar.add(array2[i]);
			}
		}
		return tar;
	}
}
