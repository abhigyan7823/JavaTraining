package src.prc31_40;

public class CalculatorUsingSwitch {
	public static void main(String[] args) {
		int a = 6, b = 2;
		char ch = '*';
		switch(ch) {
			case'+':
				System.out.println(a+b);
				break;
			case'-':
				System.out.println(a-b);
				break;
			case'*':
				System.out.println(a*b);
				break;
			case'/':
				System.out.println(a/b);
				break;
			case'%':
				System.out.println(a%b);
				break;
		}
		
	}
}
