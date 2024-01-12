package src.prc21_30;

public class ArmstrongBwIntervals {
	static int power(int rem,int pow) {
		int ans = 1;
		for(int i=0;i<pow;i++) {
			ans *= rem; 
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int sti = 100,endi = 2000;
		for(int i=sti;i<=endi;i++) {
			int rem,ans=0,count=0;
			int n = i;
			int temp = i;
			while(temp!=0) {
				count++;
				temp/=10;
			}
			while(n!=0) {
				rem = n%10;
				ans += power(rem, count);
				n/=10;
			}
			if(ans == i) {
				System.out.println(ans);
			}
		}
	}
}
