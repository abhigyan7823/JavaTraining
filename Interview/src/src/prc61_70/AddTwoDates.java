package src.prc61_70;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddTwoDates {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2022-01-01");
		LocalDate date2 = LocalDate.parse("2022-03-20");

		LocalDate sum = date1.plusDays(date2.toEpochDay() - date1.toEpochDay());
		System.out.println("Sum of Dates: " + sum.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	}
}
