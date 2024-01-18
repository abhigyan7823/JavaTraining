package src.prc101_110;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadContentLineByLine {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("JavaFile.java"));
			String line = reader.readLine();
			System.out.println(line);
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
