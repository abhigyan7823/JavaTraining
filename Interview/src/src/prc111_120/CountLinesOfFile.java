package src.prc111_120;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLinesOfFile {
	public static void main(String[] args) {
		try {
			Path file = Paths.get("/home/abhigyan_bhadoria/DeathNote");
			long count = Files.lines(file).count();
			System.out.println("Total Lines: " + count);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
