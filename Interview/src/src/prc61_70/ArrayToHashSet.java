package src.prc61_70;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToHashSet {
	public static void main(String[] args) {
		int[] arr = {1,24,14,4};
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		Arrays.stream(arr).forEach(a -> System.out.print(a+" "));
		System.out.println();
		int[] nums = hs.stream().mapToInt(Integer::intValue).toArray();
		Arrays.stream(nums).forEach(val -> System.out.print(val+" "));
	}
}
