package src.prc71_80;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileToByteArray {
	public static void main(String[] args) {
		String path = "/home/abhigyan_bhadoria/Documents/JavaDoc";
		try {
			byte[] bytearr = Files.readAllBytes(Paths.get(path));
			System.out.println(Arrays.toString(bytearr));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			byte[] bytearr1 = Files.readAllBytes(Paths.get(path));
			Files.write(Paths.get(path),bytearr1);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
