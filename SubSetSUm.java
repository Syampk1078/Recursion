package recursion;

public class SubSetSUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {10,5,15,20};
		System.out.println(countSubsets(ar,25,0));
	}

	private static int countSubsets(int[] ar, int sum, int i) {
		if(sum == 0) return 1;
		if(sum<0 || i == ar.length) return 0;		
		return countSubsets(ar, sum-ar[i], i+1) + countSubsets(ar, sum, i+1);
	}

}
