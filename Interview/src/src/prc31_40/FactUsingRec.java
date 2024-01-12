package src.prc31_40;

public class FactUsingRec {
	
	static int fact(int num) {
		if(num == 1) {
			return num;
		}
		else {
			return num*fact(num-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	
}
