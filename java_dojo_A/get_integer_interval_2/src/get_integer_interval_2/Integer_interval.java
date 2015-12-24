package get_integer_interval_2;

import java.util.ArrayList;
//根据给出的两个数字得到自增的偶数区间，或自减的偶数区间，或只含此数字的数组
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
