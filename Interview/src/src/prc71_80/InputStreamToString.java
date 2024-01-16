package src.prc71_80;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamToString {
	public static void main(String[] args) {
		String path = "/home/abhigyan_bhadoria/Documents/JavaDoc";
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader fir = new InputStreamReader(fis);
			char[] charArray = new char[(int) path.length()];
			fir.read(charArray);
			String content = new String(charArray);
			System.out.println(content);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
