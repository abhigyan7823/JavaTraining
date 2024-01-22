package src.prc151_160;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortKeysOfMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Luffy", 1);
		map.put("Zoro", 2);
		map.put("Sanji", 3);
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(), entry -> entry.getValue(),
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);
        
	}
}
