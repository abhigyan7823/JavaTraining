package src.prc61_70;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		int[] arr = al1.stream().mapToInt(value -> value.intValue()).toArray();
		System.out.println(java.util.Arrays.toString(arr));
		
		List<Integer> al = new ArrayList<>();
		for(int i: arr) {
			al.add(i);
		}
		System.out.println(al);
	}
}
