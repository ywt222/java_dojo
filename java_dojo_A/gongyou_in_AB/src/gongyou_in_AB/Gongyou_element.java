package gongyou_in_AB;

import java.util.ArrayList;

//ѡ������A���뼯��B�еĹ���Ԫ��
public class Gongyou_element {
	public ArrayList<String> Gongyou(String[] array1,String[] array2){
		ArrayList<String> tar = new ArrayList();
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if (array1[i] == array2[j]){
					tar.add(array1[i]);
				}
			}
		}
		return tar;
	}

}
