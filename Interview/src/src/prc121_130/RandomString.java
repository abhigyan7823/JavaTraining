package src.prc121_130;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {
		String alpha = "qwertyuiopasdfghjklzxcvbnm";
		String str = new String();
		Random random = new Random();
		int len = 5;
		for(int i=0;i<len;i++) {
			int ind = random.nextInt(alpha.length());
			str += alpha.charAt(ind);
		}
		System.out.println(str);
		
	}
}