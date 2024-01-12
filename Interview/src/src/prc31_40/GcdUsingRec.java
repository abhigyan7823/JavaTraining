package src.prc31_40;

public class GcdUsingRec {

	static int gcd(int a,int b) {
		if(a%b == 0) {
			return b;
		}
		else {
			return gcd(b,a%b);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(12,30));
	}

}
