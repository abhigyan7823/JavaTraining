package src.prc11_20;

public class GCD {
	public static void main(String[] args) {
		int a = 24;
		int b = 30;
		int ans = 1;
		for(int i = 2; i <= a  && i <= b ;i++) {
			if(a % i == 0 && b % i==0) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
