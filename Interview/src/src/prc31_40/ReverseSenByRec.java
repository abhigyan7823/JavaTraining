package src.prc31_40;

public class ReverseSenByRec {

	public static String reverse(String sen) {
		if(sen.isEmpty()) {
			return sen;
		}
		return reverse(sen.substring(1))+sen.charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("I am Going to be King of Pirates"));
	}
	
}
