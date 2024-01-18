package src.prc121_130;

public class CompareString {
	public static void main(String[] args) {
		String a = "ab";
		String b = new String("ab");
		String c = "ab";
		String d = new String("ab");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(d==b);
	}
}
