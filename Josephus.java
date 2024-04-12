package recursion;

public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jos(7,4));
	}

	private static int jos(int n, int k) {
		if(n==1) return 0;
		return (jos(n-1,k)+k)%n;
	}

}
