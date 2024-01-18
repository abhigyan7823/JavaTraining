package src.prc131_140;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class CheckBirthday {
	public static void main(String[] args) {
		int bd = 12;
		Month bm = Month.APRIL;
		
		LocalDate localDate = LocalDate.now();
		int date = localDate.getDayOfMonth();
		Month month = localDate.getMonth();
		
		if(date == bd && month == bm) {
			System.out.println("Happy Birthday");
		}
		else {
			System.out.println("Not Your Birthday");
		}
		
	}
}
