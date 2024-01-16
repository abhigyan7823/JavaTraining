package src.prc71_80;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputStreamToString {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		String str = "Output String";
		stream.write(str.getBytes());
		String st = new String(stream.toByteArray());
		System.out.println(st);
	}
}
