package src.prc21_30;

public class PowerOfNumber {
	public static void main(String[] args) {
		int num = 5;
		int pow = 3;
		int ans = 1;
		for (int i=1;i<=pow;i++) {
			ans *= num;
		}
		System.out.println(ans);
	}
}
