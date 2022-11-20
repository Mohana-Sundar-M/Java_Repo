//WAP to implement Anagram Checking least inbuilt methods being used.
public class Answer_5 {

	public static void main(String[] args) {
		String name_1 = "race";
		String name_2 = "care";
		
		int checkCount =0;
		for(int i=0;i<name_1.length();i++) {
			
			for(int j=0;j<name_2.length();j++) {
				
				if(name_1.charAt(i)==name_2.charAt(j)) {
					checkCount++;
					break;
				}
			}
			
		}
		if(checkCount==name_1.length()) {
			
			System.out.println("The Given Names Are Anagram");
		}else {
			System.out.println("The Given Names Are Not Angram");
		}
		
	}

}
