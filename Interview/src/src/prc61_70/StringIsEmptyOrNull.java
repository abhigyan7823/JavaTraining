package src.prc61_70;

public class StringIsEmptyOrNull {
	
	public static String check(String str) {
		if(str == null) {
			return null;
		}
		else if(str.length()==0) {
			return "Empty";
		}
		return "Normal";
	}
	
	public static void main(String[] args) {
		String str = "";
		System.out.println(check(str));
	}
}
