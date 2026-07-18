package com.in28minutes.api.f;

public class SwitchExpressionRunner {
	public static String findDayOftheWeek(int day) {
		return switch(day) {//if using second method
//		case 1:
//			return "monday";
//		case 2: 
//			return "tuesday";
//		case 3:
//			return "wednesday";
//		case 4:
//			return "thursday";
//		case 5:
//			return "friday";
//		case 6:
//			return "saturday";
//		case 7:
//			return "sunday";
//		default:return "invalid";
		
		 //or
		case 0->{
			System.out.println("hii");
			yield "sunday";
		}
		case 1 -> "monday";
		case 2->"tuesday";
		case 3 -> "wednesady";
		case 4->"thursday";
		case 5->"friday";
		case 6->"saturday";
		case 7->"sunday";
		default->"invalid";
		};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDayOftheWeek(6));

	}

}
