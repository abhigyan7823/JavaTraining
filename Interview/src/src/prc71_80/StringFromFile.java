package src.prc71_80;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StringFromFile {
	public static void main(String[] args) {
		String path = "/home/abhigyan_bhadoria/Documents/JavaDoc";
		try {
			Path path2 = Paths.get(path);
			String contents = Files.readString(path2);
			System.out.println(contents);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
