package src.prc21_30;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		int rem = 0;
		while(num != 0) {
			rem = num%10;
			rev = rev *10 +rem;
			num/=10;
		}
		System.out.println(rev);
	}
}
