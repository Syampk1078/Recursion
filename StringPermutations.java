package recursion;

import java.util.Scanner;

public class StringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		permutationOfString(str.toCharArray(),0);

	}

	private static void permutationOfString(char[] str, int fi) {
		// TODO Auto-generated method stub
		if(fi == str.length-1) {
			System.out.println(str);
			return;
		}
		for(int i=fi;i<str.length;i++) {
			swap(str,i,fi);
			permutationOfString(str, fi+1);
			swap(str,i,fi);
		}
		
	}

	private static void swap(char[] str, int i, int fi) {
		// TODO Auto-generated method stub
		char temp = str[i];
		str[i] = str[fi];
		str[fi] = temp;
		
	}

}
