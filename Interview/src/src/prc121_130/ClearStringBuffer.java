package src.prc121_130;

public class ClearStringBuffer {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		System.out.println(str.toString());
		str.delete(0, str.length());
		System.out.println(str.toString());
	}
}
