package src.prc21_30;

public class PrimeNumberBwIntervalsFunction {
	
	static void primeIntervals(int sti,int endi) {
		int flag;
		for(int i = sti;i<=endi;i++) {
			flag=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j == 0) {
					flag = 0;
					break;
				}
			}
			if(flag != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		primeIntervals(5, 17);
	}
}
