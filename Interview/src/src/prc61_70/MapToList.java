package src.prc61_70;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        List<Map.Entry<String, Integer>> entryList = hashMap.entrySet().stream().collect(Collectors.toList());
        entryList.forEach(entry -> System.out.println(entry.getKey()+""+entry.getValue()));
	}
}
