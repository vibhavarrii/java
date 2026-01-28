package oops.com;

public class Student extends Person {//person is superclass //student is sub class
	private String college;
	private int year;
	public Student(String name , int year) {
		super(name);
		this.year = year;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static void main(String[] args) {
		Student student = new Student("ben", 5);
		//student.setName("joe");
		//System.out.println(student.getName());
		//String value=student.toString();
		//System.out.println(value);
		//System.out.println(student);
		Person person = new Person("jocky");
		
		System.out.println(person);
	}
	

}
