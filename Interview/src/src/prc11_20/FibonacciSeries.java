package src.prc11_20;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		int first = 0;
		int sec = 1;
		int sum = 1;
		while(n!=0) {
			System.out.print(first+" ");
			sum = first + sec;
			first = sec;
			sec = sum;
			n--;
		}
	}
}
