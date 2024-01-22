package src.prc141_150;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);

		List<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		list3.forEach(a -> System.out.print(a + " "));

	}
}
