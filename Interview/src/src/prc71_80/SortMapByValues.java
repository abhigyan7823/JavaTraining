package src.prc71_80;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("John", 30);
		unsortedMap.put("Alice", 25);
		unsortedMap.put("Bob", 35);
	
		LinkedHashMap<String, Integer> temp = unsortedMap.entrySet().stream()
		        .sorted((a, b) -> a.getValue().compareTo(b.getValue()))
		        .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (a, b) -> a, LinkedHashMap::new));

		System.out.println(temp);
		
	}
}
