package imports;

import java.util.Arrays;

enum Season{
	WINTER(1),SUMMER(2),RAIN(3),monsoon(4);
	int value;
	private Season(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}

public class Enums {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.WINTER;
		Season season1 = Season.valueOf("SUMMER");
		System.out.println(season1);
		System.out.println(season1.ordinal());
		System.out.println(Season.WINTER.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		System.out.println(season.getValue());
		
		

	}

}
