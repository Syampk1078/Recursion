package recursion;

public class PowerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(5,8));

	}

	private static long pow(int x, int y) {
		// TODO Auto-generated method stub
		if(y==0) {
			return 1;
		}
		
		if(y%2==0) {
			long res = pow(x,y/2);
			return res*res;
		}
		else
		return pow(x,y-1)*x;
	}

}
