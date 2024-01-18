package src.prc101_110;

public class MethodAsArg {
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static void square(int n) {
		System.out.println(n*n);
	}
	
	public static void main(String[] args) {
		square(add(2,3));
	}
}
