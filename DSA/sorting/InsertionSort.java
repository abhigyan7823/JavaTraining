package sorting;

public class InsertionSort {
	
	static int[] insertion(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int curr = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>curr) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = curr;
		}
		return arr;
	}
	
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {34,231,12,11,54};
		print(arr);
		System.out.println();
		print(insertion(arr));
	}
}
