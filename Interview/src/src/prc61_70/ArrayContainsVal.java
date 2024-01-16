package src.prc61_70;

public class ArrayContainsVal {
	public static void main(String[] args) {
		int[] arr = {1,323,5,34,6};
		int val = 23;
		int flag =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				System.out.println("Yes");
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("No");
		}
	}
}
