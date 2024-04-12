package recursion;

import java.util.Scanner;

public class BalancedParantheis {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] ar = new char[n*2];
		balPar(ar,n,0,0,0);

	}

	private static void balPar(char[] ar, int n, int i, int o, int c) {
		// TODO Auto-generated method stub
		if(i == ar.length) {
			System.out.println(ar);
		}
		if(o<n) {
			ar[i] = '(';
			balPar(ar,n,i+1,o+1,c);
		}
		if(c<o) {
			ar[i] = ')';
			balPar(ar,n,i+1,o,c+1);
		}
		
	}

}
