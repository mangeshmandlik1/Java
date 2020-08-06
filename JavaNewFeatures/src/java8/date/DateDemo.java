package java8.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateDemo {

	public static void main(String[] args) {

//		-date class was available in sql and util package
//		-previous date was giving date+time when asked for date
//		- now new package java.time
	
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = LocalDate.of(2019, 8, 03);
		System.out.println(date);
		
		date = LocalDate.of(2019, Month.AUGUST, 03);
		System.out.println(date);
		
//		date = LocalDate.of(1989, Month.FEBRUARY, 29);
//		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		time = LocalTime.of(12, 35, 10,99);
		System.out.println(time);
		
//		for(String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		time = LocalTime.now(ZoneId.of("Japan"));
		System.out.println(time);
		
		Instant i = Instant.now();
		System.out.println(i);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		
	}

}
