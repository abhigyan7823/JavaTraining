package src.prc151_160;

public class ContainsSubString {
	public static void main(String[] args) {
		String str = "I am Going to be King of The Pirates";
		String str2 = "King";
		
		int ind = str.indexOf(str2);
		if(ind == 0 ) {
			System.out.println("Not substring");
		}
		else {
			System.out.println("Substring");
		}
	}
}
