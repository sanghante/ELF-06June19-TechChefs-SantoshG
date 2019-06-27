package com.techchefs.javaapps.learning.jodadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestLocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.of(1981, 10, 4, 12, 12);
		
		LocalDate ld = LocalDate.of(1981, 10, 4);
		
		Period p = Period.between(ld, LocalDate.now());
		
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		ZoneId i = ZoneId.systemDefault();
		System.out.println(i.toString());
		
		ZoneId z = ZoneId.of("Australia/Sydney");
		ZonedDateTime zdt = ZonedDateTime.now(z);
		System.out.println(zdt.toLocalDateTime());
		
	}
}
