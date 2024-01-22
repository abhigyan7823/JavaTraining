package src.prc141_150;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetUnionAndIntersection {
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		for(int i=1;i<7;i++) {
			if(i%2==0) {
				hs1.add(i);
			}
			else {
				hs2.add(i);
			}
		}
//		Set<Integer> union = Stream.concat(hs1.stream(), hs2.stream()).collect(Collectors.toSet());
		hs1.addAll(hs2);
		System.out.println("Union : "+ hs1);
		System.out.println("hs1 :" +hs1);
		System.out.println("hs2 :"+hs2);
		Set<Integer> hs3 = hs1.stream()
				.filter(ele -> hs2.contains(ele))
				.collect(Collectors.toSet());
		System.out.println(hs3);
	}
}
