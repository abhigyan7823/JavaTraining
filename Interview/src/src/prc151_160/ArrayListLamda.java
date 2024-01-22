package src.prc151_160;

import java.util.ArrayList;

public class ArrayListLamda {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.forEach(a -> System.out.print(a + " "));
	}
}
