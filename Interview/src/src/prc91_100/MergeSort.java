package src.prc91_100;

public class MergeSort {

	public static void conquer(int[] arr, int low, int mid, int hi) {
		int[] merge = new int[hi - low + 1];
		int i = low, j = mid + 1, k = 0;
		while (i <= mid && j <= hi) {
			if (arr[i] <= arr[j]) {
				merge[k++] = arr[i++];
			} else {
				merge[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			merge[k++] = arr[i++];
		}
		while (j <= hi) {
			merge[k++] = arr[j++];
		}
		for (int i1 = 0, i2 = low; i1 < merge.length; i1++, i2++) {
			arr[i2] = merge[i1];
		}
	}

	public static void divide(int[] arr, int low, int hi) {
		if (low >= hi) {
			return;
		}
		int mid = low + (hi - low) / 2;
		divide(arr, low, mid);
		divide(arr, mid + 1, hi);
		conquer(arr, low, mid, hi);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 6, 2, 8, 7 };
		divide(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
