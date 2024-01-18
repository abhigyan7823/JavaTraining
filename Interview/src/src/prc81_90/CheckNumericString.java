package src.prc81_90;

public class CheckNumericString {

	public static void main(String[] args) {
		String str = "12a";
		try {
			int a = Integer.parseInt(str);
			System.out.println("Numeric");
		}
		catch(NumberFormatException e){
			System.out.println("Not Numeric");
		}
	}
	
}
