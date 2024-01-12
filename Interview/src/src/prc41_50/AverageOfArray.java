package src.prc41_50;

public class AverageOfArray {
	public static void main(String[] args) {
		int[] arr = {3,2,5,7,4};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println((float)sum/arr.length);
	}
}
