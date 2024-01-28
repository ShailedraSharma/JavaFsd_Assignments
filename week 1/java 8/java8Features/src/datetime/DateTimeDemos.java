package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemos {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDate myDate = LocalDate.of(2000, 02, 20);
		System.out.println(myDate);
		
		String dateStr = "2023-10-19";
		LocalDate dob = LocalDate.parse(dateStr);
		
		System.out.println(dob);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String dateStr1 = "02-12-2021";
		
		LocalDate formattedDate = LocalDate.parse(dateStr1, formatter);
		
		System.out.println(formattedDate);
		
		System.out.println(date1.isAfter(formattedDate));
	
		System.out.println(date1.plusWeeks(3));
		
		System.out.println(date1.minusYears(10));
		
	}
}
