//WAP to find the maximum occurring character in a String.
public class Answer_8 {
	public static void main(String[] args) {
		String str = "Heeeeloofff";
		String res ="";
		int max =0;
		int min = 0;
		int fin =0;
		
		for(int i = 0; i<str.length();i++) {
			
			for(int j =0;j<str.length()-1;j++) {
				if(j==i) {
					j++;
				}
				if(str.charAt(i)==str.charAt(j)) {
					 
					res =res+str.charAt(j);
					j++;
					
				}
				j++;
				
			}
			
		}
		
		for(int i=0;i<res.length();i++) {
			max=0;
			for(int j=0;j<res.length();j++) {
				if(res.charAt(i)==res.charAt(j)) {
					if(i==0){
						min++;
					}else {
						max++;
					}
					if(i==0) {
						i += min-1;
					}else if(i>res.length()-max){
						i+=max-1;
					}
				}
			}
			
			if(i>=2) {
				if(min>max) {
					
				}else if(max>min) {
					min =max;
					fin=i;
				}
			}
			if(i==1) {
				if(min>max) {
					 fin =0;                                        
				}else if(max>min) {
					fin=1;
					min=max;
				}
			}
			
			
		}
		System.out.println("The Maximum Ocurring Character is :"+res.charAt(fin));
	}
}
