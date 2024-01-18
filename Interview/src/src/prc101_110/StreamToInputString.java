package src.prc101_110;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class StreamToInputString {
	public static void main(String[] args) throws IOException {
		String string = "King Of The Pirates";
		
        InputStream stream = new ByteArrayInputStream(string.getBytes
                (Charset.forName("UTF-8")));
 
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
 
        String str = br.readLine();
 
        System.out.print("Input stream : ");
 
        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }
	}
}
