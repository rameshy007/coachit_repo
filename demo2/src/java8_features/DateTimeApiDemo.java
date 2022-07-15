package java8_features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class DateTimeApiDemo {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getMonth());
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime.minusHours(1));
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime dt1 = LocalDateTime.of(1995, Month.APRIL, 28, 12, 45);
		System.out.println(dt1);
		Year year = Year.of(2000);

		if (year.isLeap()) {
			System.out.println("yes leap year");
		} else {
			System.out.println("not leap year");
		}
		String result = year.isLeap() ? "even" : "odd";
		System.out.println(result);
	}
}
