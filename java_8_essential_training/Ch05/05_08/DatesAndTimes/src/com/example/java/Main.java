package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		// Example using the original API
		Date d = new Date();
		System.out.println(d);

		GregorianCalendar  gc = new GregorianCalendar(2009,1,28);
		gc.add(GregorianCalendar.DATE,1);
		Date d2 = gc.getTime();
		System.out.println(d2);
		// this might look confusing but month were numbered starting from 0, so 1 is February!

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(d2));

		// Now, the Java 8 version of the API
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDate ld = LocalDate.of(2009,1,28);
		System.out.println(ld);

		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		System.out.println(dtf.format(ld));

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println(dtf2.format(ld));

	}

}
