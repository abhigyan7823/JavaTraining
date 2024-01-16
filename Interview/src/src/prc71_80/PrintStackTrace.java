package src.prc71_80;

import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a[] = new int[3];
			System.out.println("Printing element at index four:" + a[4]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			StringWriter string_writer = new StringWriter();
			e.printStackTrace(new PrintWriter(string_writer));
			String printExceptionAsString = string_writer.toString();
			System.out.println(printExceptionAsString);
		}
	}
}
