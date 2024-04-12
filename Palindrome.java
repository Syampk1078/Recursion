package recursion;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		System.out.println(isPalindrome(str,0,str.length()-1));

	}

	private static boolean isPalindrome(String string,int i,int j) {
		// TODO Auto-generated method stub
		if(string.charAt(i) != string.charAt(j)) return false;
		if(j<=i) return true;
		return isPalindrome(string,i+1,j-1);
	}

}
