package src.prc131_140;

public class CheckIfTwoBooleanTrue {
	public static void main(String[] args) {
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = false;
		int count =0;
		if(flag1) {
			count++;
		}
		if(flag2) {
			count++;
		}
		if(flag3) {
			count++;
		}
		if(count == 2) {
			System.out.println("Two flags are True");
		}
		else {
			System.out.println("Two flags are Not True");
		}
	}
}
