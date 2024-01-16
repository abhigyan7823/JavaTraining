package src.prc51_60;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "I         am Going to be Pirare King";
		String ans = " ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				ans += str.charAt(i);
			}
		}
		System.out.println(ans);
		System.out.println(str.replaceAll(" ", ""));
	}
}
