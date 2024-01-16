package src.prc61_70;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinTwoList {
	public static void main(String[] args) {
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(3);
		al2.add(4);
	
		List<Integer> joinedList = Stream.concat(al1.stream(), al2.stream()).collect(Collectors.toList());
		System.out.println(joinedList);
	}
}
