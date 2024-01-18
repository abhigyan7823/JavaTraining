package src.prc111_120;

class UnderAgeException extends Exception {

	public UnderAgeException(String msg) {
		super(msg);
	}
}

public class CustomException {
	public static void main(String[] args) {
		int age =12;
		try {
			if(age<18) {
				throw new UnderAgeException("You Can Not Vote");
			}
			else {
				System.out.println("You Can vote");
			}
		}
		catch (UnderAgeException e) {
			e.printStackTrace();
		}
	}
}
