package get_letter_interval;

import java.util.ArrayList;
//���ݸ������������ֵõ���Ӧ��������ĸ���䣬���Ӧ�Լ�����ĸ���䣬���Ӧ����ĸ����
public class Letter_interval {
	public ArrayList<String> Interval(int[] array){
		ArrayList<String> tar = new ArrayList();
		if(array[0]==array[1]){
			char temp = (char) (array[0]+96);
			String str = String.valueOf(temp);
			tar.add(str);
		}
		if(array[0]<array[1]){
			for (int i=array[0];i<=array[1];i++){
				char temp = (char) (i+96);
				String str = String.valueOf(temp);
				tar.add(str);
			}
		}
		if(array[0]>array[1]){
			for (int i=array[0];i>=array[1];i--){
				char temp = (char) (i+96);
				String str = String.valueOf(temp);
				tar.add(str);
			}
		}
		return tar;
	}

}
