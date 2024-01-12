package src.prc21_30;

public class PrimeNumberBwIntervals {
	public static void main(String[] args) {
		int sti =5;
		int endi =17;
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
}
