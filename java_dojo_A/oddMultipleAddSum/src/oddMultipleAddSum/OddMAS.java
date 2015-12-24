package oddMultipleAddSum;
//每一个奇数*3+5再求总和
public class OddMAS {
	public int OddMulAddSum(int[] array){
		int sum = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]%2!=0){
				sum += array[i]*3+5;
			}
		}
		return sum;
	}
}
