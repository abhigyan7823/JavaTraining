package src.prc141_150;

import java.util.HashMap;
import java.util.Map.Entry;

public class GetKeyFromValueMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
	    for(Entry<String, Integer> entry: map.entrySet()) {
	        if(entry.getValue() == 2) {
	          System.out.println(entry.getKey());
	          break;
	        }
	    }
	}
}
