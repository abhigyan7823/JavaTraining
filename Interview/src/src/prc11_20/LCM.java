package src.prc11_20;

public class LCM {
	public static void main(String[] args) {
		int a = 3;
		int b = 12;
		int ans = 1;
		for(int i = 2; i <= a  && i <= b ;i++) {
			if(a % i == 0 && b % i==0) {
				ans = i;
			}
		}
		System.out.println((a*b)/ans);
	}
}
