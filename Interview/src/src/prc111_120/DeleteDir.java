package src.prc111_120;

import java.io.File;

public class DeleteDir {
	public static void main(String[] args) {
		File directory = new File("/home/abhigyan_bhadoria/asd");
		if (directory.exists()) {
			if (directory.list().length == 0) {
				directory.delete();
				System.out.println("Directory deleted successfully");
			} else {
				System.out.println("Directory is not empty");
			}
		} else {
			System.out.println("Directory does not exist");
		}
	}
}
