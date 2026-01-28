package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student>students= List.of(new Student(1,"leo"),new Student(200 ,"blue"),new Student(4,"jhon"));
		System.out.println(students);
		ArrayList<Student>studentsAl = new ArrayList<>(students);
		
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		

	}

}
