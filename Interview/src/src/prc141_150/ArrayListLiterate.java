package src.prc141_150;

import java.util.ArrayList;

public class ArrayListLiterate {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.stream().forEach(a -> System.out.print(a+" "));
	}
}
