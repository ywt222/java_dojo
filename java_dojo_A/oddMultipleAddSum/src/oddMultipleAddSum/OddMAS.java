package oddMultipleAddSum;
//ÿһ������*3+5�����ܺ�
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
