package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(3,'A','B','C');
	}

	private static void towerOfHanoi(int n, char src, char aux, char des) {
		if(n==1) {
			System.out.println(src+" -> "+des);
			return;
		}
		towerOfHanoi(n-1, src, des, aux);
		towerOfHanoi(1, src, aux, des);
		towerOfHanoi(n-1, aux, src, des);
	}

}
