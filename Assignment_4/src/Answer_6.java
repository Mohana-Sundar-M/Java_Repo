//WAP to implement Pangram Checking with least inbuilt methods being used.
public class Answer_6 {

	public static void main(String[] args) {
		String details ="The five boxing wizards jump quickly";
		String pangram = "";
		String result ="";
		
		for(int i=0;i<details.length();i++) {
			if(details.charAt(i)!=' ') {
				pangram =pangram+details.charAt(i);				
			}
		}
		for (int i = 0; i < pangram.length(); i++) {
	        if(!result.contains(String.valueOf(pangram.charAt(i)))) {
	            result += String.valueOf(pangram.charAt(i));
	        }
	    }
		
		if(result.length()==26) {
			System.out.println("The Given Sentence is Pangram");
		}else {
			
			System.out.println("The Given Sentence is Not A Pangram");
		}
	}

}
