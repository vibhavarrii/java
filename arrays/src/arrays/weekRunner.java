package arrays;

public class weekRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] week = {"monday","tuesday","wednesday","thursday","friday"};
		String mostchar = " ";
		for(String day:week) {
			if(day.length() > mostchar.length()) {
				mostchar = day;
				
			}
		}
		System.out.println(mostchar);
		for(int i=week.length-1 ; i>=0;i--) {
			System.out.println(week[i]);
		}
		

	}

}
