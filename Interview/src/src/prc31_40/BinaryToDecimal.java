package src.prc31_40;

public class BinaryToDecimal {

	public static String reverse(String bin) {
		String rev = "";
		for(int i=bin.length()-1;i>=0;i--) {
			rev += bin.charAt(i);
		}
		return rev;
	}
	
	public static String decimaToBinary(int num) {
		String bin = "";
		while(num != 0) {
			bin += num % 2;
			num /= 2;
		}
		return reverse(bin);
	}
	
	public static int binaryToDecimal(int bin) {
		int dec = 0;
		int base = 1;
		while(bin > 0) {
			int lastdigit = bin % 10;
			bin/=10;
			dec += lastdigit * base;
			base *= 2;
		}
		return dec;
		
	}
	
	public static void main(String[] args) {
		System.out.println(decimaToBinary(28));
		System.out.println(binaryToDecimal(11100));
	}
	
}
