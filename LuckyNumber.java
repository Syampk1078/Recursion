package recursion;

public class LuckyNumber {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLuckyNumber(13,2));
	}

	private static boolean isLuckyNumber(int num, int counter) {
		if(num%counter == 0) return false;
		if(num<counter) return true;
		 
		return isLuckyNumber(num-(num/counter), counter+1);
	}

}
