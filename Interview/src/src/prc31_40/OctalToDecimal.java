package src.prc31_40;

public class OctalToDecimal {
	
	public static String reverse(String oct) {
		String rev = "";
		for(int i=oct.length()-1;i>=0;i--) {
			rev += oct.charAt(i);
		}
		return rev;
	}
	
	public static String decimalToOctal(int num) {
		String oct = "";
		while(num != 0) {
			oct += num % 8;
			num /= 8;
		}
		return reverse(oct);
	}
	
	public static int octalToDecimal(int oct) {
		int dec=0;
		int base=1;
		while(oct > 0) {
			int lastDigit = oct %10;
			oct /= 10;
			dec += lastDigit * base;
			base *= 8;
		}
		return dec;
	}
	
	public static void main(String[] args) {
		System.out.println(decimalToOctal(838));
		System.out.println(octalToDecimal(1506));
	}

}
