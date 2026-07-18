package arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>() ;

	public Student(String name , int...marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		for(int mark :marks) {
			this.marks.add(mark);
		
	}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int mark:marks) 
		sum+=mark;
		return sum;

}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
		
		return Collections.min(marks);
}

	public BigDecimal getAverageMark() {
		// TODO Auto-generated method stub
		int sum = 0;
		BigDecimal average;
		int length = marks.size();
		for(int mark:marks)
			sum+=mark;
		average = new BigDecimal(sum).divide(new BigDecimal(length));
		return average ;
	}

	public void addNewMark(int mark) {
		// TODO Auto-generated method stub
		marks.add(mark);
	}

	public void removeMarkAtIndex(int mark) {
		// TODO Auto-generated method stub
		marks.remove(mark);
		
	}
	public String toString() {
		return "Student name :" + name +", Marks :" + marks;
	}
}
