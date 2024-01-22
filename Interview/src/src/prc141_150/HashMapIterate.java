package src.prc141_150;

import java.util.HashMap;

public class HashMapIterate {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.entrySet().stream().forEach(ent -> System.out.println(ent));
        map.keySet().stream().forEach(ent->System.out.println(ent));
        map.values().stream().forEach(val->System.out.println(val));
	}
}