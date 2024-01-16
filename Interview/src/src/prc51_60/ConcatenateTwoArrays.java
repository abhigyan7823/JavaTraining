package src.prc51_60;

import java.util.Iterator;

public class ConcatenateTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,23,44,5};
		int[] arr2 = {234,1,31,12};
		int[] res = new int[arr2.length+arr1.length];
		int i;
		for(i=0;i<arr1.length;i++) {
			res[i] = arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			res[i++] = arr2[j];
		}
		for(int k=0;k<res.length;k++) {
			System.out.print(res[k]+" ");
		}
	}

}
