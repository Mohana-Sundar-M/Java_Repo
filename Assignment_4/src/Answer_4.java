//WAP to count the number of consonants, vowels, special characters in a String.
public class Answer_4 {

	public static void main(String[] args) {
		String str = "#Mohan@";
		int vowelChck =0;
		int consonantChck =0;
		int specialChck=0;
		for(int i=0;i<str.length();i++) {
			char temp = str.charAt(i);
			if(temp>=65&&temp<=90) {
				temp =(char) ((char) temp+32);
			}
			
			if(temp==97||temp==101||temp==105||temp==111||temp==117) {
				vowelChck++;
			}
			else if((temp>=32&&temp<=47)||(temp>=58&&temp<=64)||(temp>=91&&temp<=96)||(temp>=123&&temp<=126)) {
				specialChck++;
			}
			else {
				consonantChck++;
			}
		}
		
		System.out.println("The Vowels Are :"+vowelChck);
		System.out.println("The Consonants Are :"+consonantChck);
		System.out.println("The Special Characters Are :"+specialChck);

	}

}
