package src.prc101_110;

public class CalExcutionTime {
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static void square(int n) {
		System.out.println(n*n);
	}
	
	public static void main(String[] args) {
		long st = System.nanoTime();
		square(add(2,3));
		long end = System.nanoTime();
		System.out.println("Nano Seconds "+(end-st));
	}
}
