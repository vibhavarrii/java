package arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class Studentarray {
	public static void main(String[] args) {
		Student student = new Student("joe",new int[] {100,98,97,55});//right click , refactor,inline
		System.out.println(student);
	int number = student.getNumberOfMarks();
	//System.out.println(number);
	int sum = student.getTotalSumOfMarks();
	//System.out.println(sum);
	int maximumMarks = student.getMaximumMark();
	//System.out.println(maximumMarks);
	int minimumMarks = student.getMinimumMark();
	//System.out.println(minimumMarks);
	BigDecimal average = student.getAverageMark();
	//System.out.println(average);
	System.out.println(student);
	student.addNewMark(40);
	System.out.println(student);
	student.removeMarkAtIndex(2);
	System.out.println(student);

}
}
