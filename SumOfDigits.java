package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(5251));

	}

	private static int sumOfDigits(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		
		return (n%10)+sumOfDigits(n/10);
	}

}
