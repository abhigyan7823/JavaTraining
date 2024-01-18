package src.prc91_100;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int ele =4;
		int low=0;
		int hi=arr.length-1;
		int mid,flag=0;
		while(low<hi) {
			mid = low+(hi-low)/2;
			if(arr[mid] == ele) {
				System.out.println("Found");
				flag++;
				break;
			}
			else if(ele > arr[mid]) {
				low = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		if(flag==0) {
			System.out.println("Not Found");
		}
	}
}
