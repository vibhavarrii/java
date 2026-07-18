package com.in28minutes.api.g;

public class RecordsRunner {
record Person(String name,String email,String phoneNumber) {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("joe","joe@123","9482675482");
		Person person2 = new Person("joe","joe@123","9482675482");
		System.out.println(person1);
		System.out.println(person1.equals(person2));
		System.out.println(person1.name);

	}

}
