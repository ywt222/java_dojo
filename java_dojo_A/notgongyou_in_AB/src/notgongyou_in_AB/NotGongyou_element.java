package notgongyou_in_AB;

import java.util.ArrayList;
//ѡ��A��������B�����еĲ�����Ԫ��
public class NotGongyou_element {
	public ArrayList<String> NotGongyou(String[] array1,String[] array2){
		ArrayList<String> tar = new ArrayList();
		//������A��������B��Ԫ����ӵ�tar��
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
		//������B��������A��Ԫ����ӵ�tar��
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
