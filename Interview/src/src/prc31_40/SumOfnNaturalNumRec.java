package src.prc31_40;

public class SumOfnNaturalNumRec {
	
	static int fact(int n) {
		if(n == 0) {
			return n;
		}
		else {
			return n+fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fact(3));
	}
	
}
