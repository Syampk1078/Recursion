package recursion;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,20};
		System.out.println(sumOfArr(arr,0));
	}

	private static int sumOfArr(int[] arr, int i) {
		if(arr.length-1 == i) {
			return arr[i];
		}
		return arr[i]+sumOfArr(arr,i+1);
	}

}
