package src.prc131_140;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntoString {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		String str = al.toString();
		System.out.println(str);
		String[] str2 = str.split(",");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(str2));
		System.out.println(list);
	}
}
