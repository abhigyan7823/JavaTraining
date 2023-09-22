package src;

public class Array {
	public static void main(String[] args) {
		int n=6;
		int[] arr = new int[n];
		for(int i=0;i<5;i++) {
			arr[i]=i;
		}
		int pos=2;
		int data=2;
		insertion(arr,pos,data,n);
		System.out.println();
		deletion(arr,pos,n);
	}

	private static void deletion(int[] arr, int pos, int n) {
		for(int i=pos;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void insertion(int[] arr,int pos, int data,int n) {
		
		for(int i=n-1;i>pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=data;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
