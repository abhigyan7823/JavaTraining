package sorting;

public class MergeSort {

	public static void merge(int[] arr,int l,int m,int r) {
		int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i=0;
        int j=0;
        int k=l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}
	
	public static void sort(int[] arr, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,1,25,23,15,98,54,123,1};
		print(arr);
		System.out.println();
		sort(arr,0,arr.length-1);
		print(arr);
	}
	
}
