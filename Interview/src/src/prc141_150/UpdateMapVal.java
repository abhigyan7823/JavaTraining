package src.prc141_150;

import java.util.HashMap;

public class UpdateMapVal {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.replace("two",12);
		System.out.println(map);
	}
}
