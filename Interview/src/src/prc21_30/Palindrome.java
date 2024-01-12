package src.prc21_30;

public class Palindrome {
	public static void main(String[] args) {
		int num = 121;
		int n = num;
		int rem=0,rev=0;
		while(num!=0) {
			rem = num%10;
			rev = rev*10 +rem;
			num/=10;
		}
		if(n == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
