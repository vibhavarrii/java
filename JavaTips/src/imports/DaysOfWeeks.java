package imports;

public enum DaysOfWeeks {
	MONDAY("Monday"),
    TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
	
	private String name;
	DaysOfWeeks(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	 public boolean isWeekday() {
		 switch(this) {
		 case MONDAY:
		 case TUESDAY:
		 case WEDNESDAY:
		 case THURSDAY:
		 case FRIDAY:
			 return true;
			 
		 }
		 return false;
	 }
	 
	 public boolean isHoliday() {
		 switch(this) {
		 case SATURDAY:
		 case SUNDAY:
			 return true;
		 }
		 return false;
	 }
	 public static void main(String[] args) {
		 DaysOfWeeks day = DaysOfWeeks.MONDAY;
		 System.out.println(day.getName());
		 System.out.println(day.isWeekday());
		 System.out.println(day.isHoliday());
		 
	 }
	
}
