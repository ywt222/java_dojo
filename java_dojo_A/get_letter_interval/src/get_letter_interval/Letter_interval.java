package get_letter_interval;

import java.util.ArrayList;
//根据给出的两个数字得到对应自增的字母区间，或对应自减的字母区间，或对应的字母本身
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
