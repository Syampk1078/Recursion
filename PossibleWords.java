package recursion;

import java.util.List;
import java.util.Scanner;

public class PossibleWords {
	
	static String[] keyboard = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		possibleWords(str,"");

	}

	private static void possibleWords(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		String key = keyboard[str.charAt(0)-48];
		for(int i=0;i<key.length();i++) {
			possibleWords(str.substring(1), ans+key.charAt(i));
		}
		
	}

}
