//WAP to remove Duplicates from a String.(Take any String example with duplicates character)
public class Answer_1 {

	public static void main(String[] args) {
		String word = "heelo";
		String result = "";
		boolean status =false;
		for(int i=0;i<word.length();i++) {
			char  temp = word.charAt(i);
			for(int j=0;j<word.length();j++) {
				if(i==word.length()-1) {
					break;
				}
				char temp_2 = word.charAt(i+1);
				if(temp==temp_2) {
					status=true;
				}else {
					status =false;
					break;
				}
			}
			if(status==false) {
				result=result+word.charAt(i);
			}
			
		}
		System.out.print(result);
	}
	 }
