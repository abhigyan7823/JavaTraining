package src.prc21_30;

public class Armstrong {
	
	static int power(int rem,int pow) {
		int ans = 1;
		for(int i=0;i<pow;i++) {
			ans *= rem; 
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int num = 1634;
		int rem,ans=0,count=0;
		int n = num;
		int temp = num;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		System.out.println(count);
		while(n!=0) {
			rem = n%10;
			ans += power(rem, count);
			n/=10;
		}
		if(num == ans) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}
	}
}
