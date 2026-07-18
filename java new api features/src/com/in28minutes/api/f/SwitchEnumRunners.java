package com.in28minutes.api.f;

import java.time.DayOfWeek;

public class SwitchEnumRunners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek  dayofweek = DayOfWeek.FRIDAY;//DayOfWeek is a enum representing 7 days of week
		String str =  switch(dayofweek) {
		case MONDAY -> "first day of week";
		case TUESDAY,WEDNESDAY,THURSDAY,FRIDAY ->"hii";
		default -> "return something";
		
		};
		System.out.println(str);

	}

}
