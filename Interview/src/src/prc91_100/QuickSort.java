package src.prc91_100;

public class QuickSort {
	
	public static int partition(int[] arr,int low,int hi) {
		int pi = arr[hi];
		int i = low-1;
		for(int j=low;j<hi;j++) {
			if(arr[j]<pi) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pi;
		arr[hi] = temp;
		return i;
	}
	
	public static void quicksort(int[] arr,int low,int hi) {
		if(low < hi) {
			int pidx = partition(arr,low,hi);
			quicksort(arr, low, pidx-1);
			quicksort(arr, pidx+1, hi);
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,1,3,6,2,8,7};
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
