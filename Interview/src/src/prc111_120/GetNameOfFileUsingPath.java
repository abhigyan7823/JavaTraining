package src.prc111_120;

import java.io.File;

public class GetNameOfFileUsingPath {
	public static void main(String[] args) {
		File file = new File("/home/abhigyan_bhadoria/P.txt");
		System.out.println(file.getName());
	}
}
