package src.prc11_20;

public class AlphabetOrNot {
	public static void main(String[] args) {
//		System.out.println((int)'a');
//		System.out.println((int)'z');
//		System.out.println((int)'A');
//		System.out.println((int)'Z');
		char ch = 'F';
		int asci = (int) ch;
		if(asci >= 65 && asci <= 90 || asci >= 97 && asci <= 122 ) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not Alphabet");
		}
	}
}
