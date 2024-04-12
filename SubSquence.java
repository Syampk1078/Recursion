package recursion;

public class SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gss("abc","");

	}

	private static void gss(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		gss(str.substring(1),ans+str.charAt(0));
		gss(str.substring(1),ans);

	}

}
