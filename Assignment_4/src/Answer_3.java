//WAP to check if “2552” is palindrome or not.
public class Answer_3 {

	public static void main(String[] args) {
		String str = "2552";
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			res +=str.charAt(i);
		}
		if(res.equals(str)) {
			System.out.println("The Given String Is Palindrome");
		}
		else
			System.out.println("The Given String Is Not A Palindrome");

	}

}
