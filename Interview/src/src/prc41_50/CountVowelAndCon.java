package src.prc41_50;

public class CountVowelAndCon {
	public static void main(String[] args) {
		int vcount=0,ccount=0;
		String str = "I am going to Be King of the Pirates";
		str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
				 vcount++;
			 }
			 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {   
				 ccount++;
			 }
		}
		System.out.println("Vowel Count"+vcount);
		System.out.println("Consonet Count"+ccount);
	}
}
