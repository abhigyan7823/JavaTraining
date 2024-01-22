package src.prc151_160;

import java.util.Arrays;

public class ValidShuffleCheck {
	
	public static boolean isValidShuffle(String str, String str1, String str2) {
		if (str.length() != str1.length() + str2.length()) {
			return false;
		}
		char[] shuffle = str.toCharArray();
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		Arrays.sort(shuffle);
		Arrays.sort(s1);
		Arrays.sort(s2);
		int i = 0, j = 0, k = 0;
		while (k < shuffle.length) {
			if (i < s1.length && shuffle[k] == s1[i]) {
				i++;
			}
			else if (j < s2.length && shuffle[k] == s1[j]) {
				j++;
			} else {
				return false;
			}

			k++;
		}
		return i == s1.length && j == s2.length;
	}

	public static void main(String[] args) {
		String str = "adbce";
		String str1 = "ab";
		String str2 = "cde";

		if (isValidShuffle(str, str1, str2)) {
			System.out.println("Valid Shuffle");
		} else {
			System.out.println("Not Valid Shuffle");
		}
	}
}
