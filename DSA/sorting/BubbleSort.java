package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	
	static int[] bubble(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];    
	                arr[i] = arr[j];    
	                arr[j] = temp;
				}
			}
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
		print(bubble(arr));
	}
}
