package src.prc51_60;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static void main(String[] args) throws ParseException {
		String str = "14:30:00";
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date = format.parse(str);
		System.out.println(date);
	}
}
