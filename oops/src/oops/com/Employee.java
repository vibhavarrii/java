package oops.com;

import java.math.BigDecimal;

public class Employee extends Person{
	private String title;
	private String employerName;
	private char employerGrade;
	private BigDecimal salaray;
	public Employee(String name , String title) {
		super(name);
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployerGrade() {
		return employerGrade;
	}
	public void setEmployerGrade(char employerGrade) {
		this.employerGrade = employerGrade;
	}
	public BigDecimal getSalaray() {
		return salaray;
	}
	public void setSalaray(BigDecimal salaray) {
		this.salaray = salaray;
	}
	public String toString() {
        return super.toString() +title + "#" + employerName + "#" + employerGrade ;
    }
	public static void main(String[] args) {
		Employee employee =  new Employee("joe","idk");
		employee.setEmail("blah");
		employee.setEmployerName("joe");
		employee.setEmployerGrade('A');
		employee.setEmail("blah");
		employee.setSalaray(new BigDecimal("50000.65"));
		System.out.println(employee);
	}
	
	

}
