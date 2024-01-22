package src.prc141_150;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<5;i++) {
			hs.add(i);
		}
		hs.stream().forEach(a->System.out.print(a+" "));
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
