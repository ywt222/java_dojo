package get_integer_interval_2;

import java.util.ArrayList;
//���ݸ������������ֵõ�������ż�����䣬���Լ���ż�����䣬��ֻ�������ֵ�����
public class Integer_interval {
	public ArrayList<Integer> Interval(int[] array){
		ArrayList<Integer> tar = new ArrayList();
		if((array[0]==array[1])&&(array[0]%2==0)){
			tar.add(array[0]);
		}
		if(array[0]<array[1]){
			if(array[0]%2==0){
				for(int i=array[0];i<=array[1];i=i+2){
					tar.add(i);
				}
			}
			if(array[0]%2!=0){
				for(int i=array[0]+1;i<=array[1];i=i+2){
					tar.add(i);
				}
			}
		}
		if(array[0]>array[1]){
			if(array[0]%2==0){
				for(int i=array[0];i>=array[1];i=i-2){
					tar.add(i);
				}
			}
			if(array[0]%2!=0){
				for(int i=array[0]+1;i>=array[1];i=i-2){
					tar.add(i);
				}
			}
		}
		return tar;
	}

}
