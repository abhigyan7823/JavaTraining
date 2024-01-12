package src.prc31_40;

public class NumCanExpressAsSumOfPrime {
	
	static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num =11;
		int flag=0;
		for(int i =2;i<=num/2;i++) {
			if(isPrime(i)) {
				if(isPrime(num-i)) {
					System.out.println("Yes");
					flag++;
					
				}
			}
		}
		if(flag==0) {
			System.out.println("No");
		}
	}
}
