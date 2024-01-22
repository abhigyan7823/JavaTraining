package src.prc151_160;

import java.util.HashSet;

public class CheckSubSet {
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs2.add(2);
		System.out.println(hs1.stream().allMatch(ele -> hs2.contains(ele)));//set 2 is not sub of set 1
	}
}
