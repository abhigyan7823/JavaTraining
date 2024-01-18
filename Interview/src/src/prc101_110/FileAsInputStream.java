package src.prc101_110;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileAsInputStream {
	public static void main(String[] args) {
		try {
			InputStream input = new FileInputStream("/home/abhigyan_bhadoria/Documents/JavaDoc");
			int i = input.read();
			while (i != -1) {
				System.out.print((char) i);
				i = input.read();
			}
			input.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
