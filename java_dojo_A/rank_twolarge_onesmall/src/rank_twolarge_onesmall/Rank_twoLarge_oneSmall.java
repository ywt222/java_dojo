package rank_twolarge_onesmall;

public class Rank_twoLarge_oneSmall {
	public int[] Rank(int[] array) {
		//ц╟ещеепР
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0;i<array.length-2;i+=3){
			int temp = array[i];
			array[i] = array[i+1];
			array[i+1] = array[i+2];
			array[i+2] = temp;
		}
		return array;
	}

}
