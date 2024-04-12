package recursion;

public class CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(12345));

	}

	private static int count(int i) {
		// TODO Auto-generated method stub
		if(i == 0) {
			return 0;
		}
		
		return 1+count(i/10);
	}

}
