package com.conditionals;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(determineNameOfDay(6));
	}

	private static String determineNameOfDay(int dayNumber) {
		switch(dayNumber) {
	
		case 0:return  "Monday";
		case 1:return  "Tuesday";
		case 2:return  "Wednesday";
		case 3:return  "Thursday";
		case 4:return "Friday";
		case 5:return "Saturday";
		}
		return "Sunday";
	}


}