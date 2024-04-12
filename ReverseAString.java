package recursion;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SYAMp";
		System.out.println(reverseString(str));

	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 1) {
			return str;
		}		
		return str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
		
	}

}
