package src.prc41_50;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = {8,2,9,5,7,4};
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
