package src.prc91_100;

public class ConstructorChain {
	private String str;
	public ConstructorChain() {
		this("asdf");
		System.out.println("Default Constructor");
	}

	public ConstructorChain(String str) {
		super();
		System.out.println("Parameterized Constructor 1");
		this.str = str;
	}

	public static void main(String[] args) {
		ConstructorChain con = new ConstructorChain();	
	}	
}
