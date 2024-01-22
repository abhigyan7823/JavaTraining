package src.prc151_160;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DiffSets {
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs2.add(2);
		Set<Integer> hs3 = hs1.stream().filter(a -> ! hs2.contains(a)).collect(Collectors.toSet());
		hs3.stream().forEach(a -> System.out.print(a+" "));
	}
}
