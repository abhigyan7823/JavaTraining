package src.prc91_100;

public class PrimitiveToObject {
	public static void main(String[] args) {
		int a = 1;
		Integer i = Integer.valueOf(a);
		Integer b = Integer.valueOf(2);
		int j = b.intValue();
		System.out.println(a);
		System.out.println(i);
		System.out.println(b);
		System.out.println(j);
	}
}
