package recursion;

public class FirstNNaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstN(5);

	}

	private static void firstN(int i) {
	
		if(i == 0) return;
		//System.out.print(i+" "); //reverse order
		firstN(i-1);
		System.out.print(i+" "); //order
		
	}

}
