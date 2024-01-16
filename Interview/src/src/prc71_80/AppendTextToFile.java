package src.prc71_80;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToFile {
	public static void main(String[] args) {
		String path = "/home/abhigyan_bhadoria/Documents/JavaDoc";
		String text = "It is appeneded";
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))) {
			writer.write(text);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
