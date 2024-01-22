package src.prc151_160;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAsFunArg {
	
	static void print(ArrayList<Integer> al) {
		al.forEach(a -> System.out.print(a+" "));
	}
	
	public static void main(String[] args) {
		print(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
	}
}
