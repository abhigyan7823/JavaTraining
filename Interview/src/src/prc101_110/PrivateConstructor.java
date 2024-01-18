package src.prc101_110;

public class PrivateConstructor {
	
	private PrivateConstructor() {
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) {
		PrivateConstructor pv = new PrivateConstructor();
	}
}
