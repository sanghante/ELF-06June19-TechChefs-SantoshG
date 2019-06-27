package com.techchefs.javaapps.learning.jodadatetime;

import java.time.LocalDate;

import lombok.extern.java.Log;

@Log
public class TestJodaLocalTime {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		
		log.info(""+date.getDayOfMonth());
		log.info(""+date.getDayOfYear());
		log.info(""+date.getDayOfWeek());
		
		log.info(""+date.getYear());
		log.info(""+date.getEra());
		log.info(""+date.getMonth());
		
		
		log.info(""+date.getMonthValue());
		log.info(""+date.getChronology());
		
		log.info(""+date.lengthOfMonth());
		log.info(""+date.atStartOfDay());
		log.info(""+date.toEpochDay());
		log.info(""+date.lengthOfYear());
		
		
		System.out.println(date.isLeapYear());
		
		System.out.println(date.toString());
		
		System.out.println(date.plusDays(200));
		
		
		
	}

}
