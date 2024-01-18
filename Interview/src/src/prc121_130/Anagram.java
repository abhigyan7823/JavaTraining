package src.prc121_130;

import java.util.Arrays;

public class Anagram {
	
	public static boolean areAnagram(char[] s1,char[] s2) {
		int n1 = s1.length;
		int n2 = s2.length;
		if(n1 != n2) {
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<n1;i++) {
			if(s1[i] != s2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str1 = "asdf";
		String str2 = "dasf";
		if(areAnagram(str1.toCharArray(),str2.toCharArray())) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}
