package src.prc111_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePath {
	public static void main(String[] args) {
		Path currentDir = Paths.get("/home/abhigyan_bhadoria/P.txt");
		Path absolutePath = currentDir.resolve("/home");
		System.out.println(absolutePath);
	}
}
