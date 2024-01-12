package src.prc21_30;

public class PrimeOrNot {
	public static void main(String[] args) {
		int num =10;
		int flag =0;
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
