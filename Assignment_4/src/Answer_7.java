//WAP to find if String contains all unique characters.
public class Answer_7 {

	public static void main(String[] args) {
	String unique = "abcd10jk";
	String chck = "";
	boolean status =false;
	for(int i=0;i<unique.length();i++) {
		char  temp = unique.charAt(i);
		for(int j=0;j<unique.length();j++) {
			if(i==unique.length()-1) {
				break;
			}
			char temp_2 = unique.charAt(i+1);
			if(temp==temp_2) {
				status=true;
			}else {
				status =false;
				break;
			}
		}
		
		if(status) {
			chck=chck+unique.charAt(i);
		}
		
	}
	
	if(chck.length()==0) {
		System.out.println("They Are All Unique Characters");
	}else {
		System.out.println("They Are Not Unique Characters");
	}
	
	}

}
