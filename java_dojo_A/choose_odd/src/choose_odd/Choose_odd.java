package choose_odd;

import java.util.ArrayList;
//Ñ¡³öÆæÊı
public class Choose_odd {
	public ArrayList<Integer> Odd(int[] array){
		ArrayList<Integer> tar = new ArrayList();
		for(int i=0;i<array.length;i++){
			if(array[i]%2!=0){
				tar.add(array[i]);
			}
		}
		return tar;
	}

}
