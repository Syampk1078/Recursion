package recursion;

public class RopeCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxPieces(15,5,8,7));
	}

	private static int maxPieces(int n, int a, int b, int c) {
		
		if(n==0) return 0;
		else if(n<0) return -1;
		
		int temp1 = maxPieces(n-a, a, b, c);
		int temp2 = maxPieces(n-b, a, b, c);
		int temp3 = maxPieces(n-c, a, b, c);
		int max = Math.max(Math.max(temp1, temp2), temp3);
		if(max == -1) return -1;
		return max+1;
	}

}
