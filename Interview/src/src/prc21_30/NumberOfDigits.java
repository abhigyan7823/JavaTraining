package src.prc21_30;

public class NumberOfDigits {
	public static void main(String[] args) {
		int n = 10230;
		int count=0;
		while(n != 0) {
			count++;
			n/=10;
		}
		System.out.println(count);
	}
}
