package src.prc1_10;

public class Largest {
	public static void main(String[] args) {
		int a = 3,b=2,c=5;
		if(a >= b && a >= c) {
			System.out.println(a);
		}
		else if(b >= a && b >=c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
}
