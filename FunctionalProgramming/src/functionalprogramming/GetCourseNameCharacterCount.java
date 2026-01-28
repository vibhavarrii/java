package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GetCourseNameCharacterCount {
	public static List<Integer>count(List<String>courses){
		if(courses==null)
			return new ArrayList<>();
		else{
			return courses.stream().map(String::length).collect(Collectors.toList());//list is an interface
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();//next line for input
		List<String>courses=new ArrayList<>();
		for(int i=0;i< n;i++) {
			courses.add(sc.nextLine());
		}
		List<Integer>result=count(courses);
		System.out.println("result"+result);
		sc.close();

	}

}
