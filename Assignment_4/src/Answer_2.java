//WAP to print Duplicates characters from the String.
public class Answer_2 {

	public static void main(String[] args) {
		String str = "Helloogff";
		String res ="";
		for(int i = 0; i<str.length();i++) {
			for(int j =0;j<str.length()-1;j++) {
				if(j==i) {
					j++;
				}
				if(str.charAt(i)==str.charAt(j)) {
					 
					res += str.charAt(j)+" ";
					++i;
				}
			}
		}
		System.out.println("The letters Are :" +res);
		

	}

}
